package com.farmville.farmville.controllers;

import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class UserRestController {
    @GetMapping("/v2/details")
    public Map<String,Object> details() {
        Map<String,Object> body = new HashMap<>();
        body.put("title", "dev on Springboot");
        body.put("author","diavlo77");
        return body;
    }
    
}
