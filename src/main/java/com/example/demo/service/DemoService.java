package com.example.demo.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
public class DemoService {

    public List<String> getResponseList(String username, Integer repeat) {
        if (username == null || repeat == null || repeat < 0) {
            return new ArrayList<>();
        }
        return IntStream.range(0, repeat).mapToObj(e -> "Hello " + username).collect(Collectors.toList());
    }
}
