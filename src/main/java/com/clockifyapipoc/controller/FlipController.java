package com.clockifyapipoc.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlipController {

    @Value("com.clockifyapipoc.baseUrl")
    private String baseUrl;

    @Value("com.clockifyapipoc.apiKey")
    private String apiKey;

    @GetMapping("/flip")
    public String flipSide(@RequestParam String sideId) {


    }
}
