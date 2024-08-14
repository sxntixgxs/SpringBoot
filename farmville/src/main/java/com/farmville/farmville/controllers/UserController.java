package com.farmville.farmville.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.*;

@Controller
public class UserController {
    @GetMapping("/details")
    public String details(Map<String,Object> model) {
        model.put("title", "Developing using SpringBoot");
        model.put("author", "menorSS");
        return "details";
    }
    

}
