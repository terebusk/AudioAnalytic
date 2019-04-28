package com.example.demo.entity;

import java.io.Serializable;

public class DemoRequest implements Serializable {
    private String user;
    private Integer repeat;

    public Integer getRepeat() {
        return repeat;
    }

    public void setRepeat(Integer repeat) {
        this.repeat = repeat;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
