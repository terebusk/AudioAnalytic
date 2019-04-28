package com.example.demo.entity;

import java.util.List;

public class DemoResponse {

    List<String> responses;

    public DemoResponse(List<String> responses) {
        this.responses = responses;
    }

    public List<String> getResponses() {
        return responses;
    }

    public void setResponses(List<String> responses) {
        this.responses = responses;
    }
}
