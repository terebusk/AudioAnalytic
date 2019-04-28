function sendXHttpRequest() {
    var text = document.querySelector('#user').value;
    var number = document.querySelector('#repeat').value;
    var json = {
        user: text,
        repeat: number
    }
    var formattedJsonData = JSON.stringify(json);
    var xhttp = new XMLHttpRequest();

    xhttp.open("POST", "/user", true);
    xhttp.setRequestHeader("Content-type", "application/json");

    console.log(formattedJsonData);

    xhttp.send(formattedJsonData);
    xhttp.onreadystatechange = function () {
        if (xhttp.readyState == 4 && xhttp.status == 200) {
            var obj = JSON.parse(xhttp.responseText);
            document.querySelector('#output').innerHTML = '';
            for (var i = 0; i < obj.responses.length; i++) {
                var span = document.createElement("span");
                var text = document.createTextNode(obj.responses[i]);
                var breakline = document.createElement("br");
                span.appendChild(text);
                document.querySelector('#output').appendChild(span).appendChild(breakline);
            }
        }
    }
}

function getMessage() {
    var xhttp = new XMLHttpRequest();
    xhttp.open("GET", "/demo", true);
    xhttp.setRequestHeader("Content-type", "application/json");
    xhttp.onreadystatechange = function () {
        if (xhttp.readyState == 4 && xhttp.status == 200) {
            document.getElementById('header').textContent=xhttp.responseText;
        }
    };
    xhttp.send(null);
}

getMessage();