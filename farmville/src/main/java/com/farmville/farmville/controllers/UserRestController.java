package com.farmville.farmville.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.farmville.farmville.models.User;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api")
public class UserRestController {
    @GetMapping("/details")
    public Map<String,Object> details() {
        User user = new User("Santiago Sandoval","sandovalbgasantiago@gmail.com");
        Map<String,Object> body = new HashMap<>();
        body.put("title", "dev on Springboot");
        body.put("user",user);
        return body;
    }
    
}
