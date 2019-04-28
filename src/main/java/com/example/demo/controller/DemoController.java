package com.example.demo.controller;

import com.example.demo.entity.DemoRequest;
import com.example.demo.entity.DemoResponse;
import com.example.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
public class DemoController {

    @Autowired
    DemoService service;

    @RequestMapping(value = "/demo", method = RequestMethod.GET)
    public String demoEndpoint(Model model) {
        return "This is a demo endpoint";
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public DemoResponse demoRequest(@RequestBody DemoRequest request) {
        return new DemoResponse(service.getResponseList(request.getUser(), request.getRepeat()));
    }

}
