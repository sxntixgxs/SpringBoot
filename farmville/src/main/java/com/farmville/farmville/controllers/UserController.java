package com.farmville.farmville.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.farmville.farmville.models.User;

import java.util.*;

@Controller
public class UserController {
    @GetMapping("/details")
    public String details(Model model) {
        User user = new User("Santiago","sandovalsantiago@oracle.us");
        model.addAttribute("title", "Developing using SpringBoot");
        model.addAttribute("user", user);
        return "details";
    }
    

}
