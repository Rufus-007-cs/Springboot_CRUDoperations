package com.project.webapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/")
    public String greetings(){
        return"Welcome to my new webapp";
    }

    @RequestMapping("/about")
    public String about(){
            return"Executing CRUD operations with java Springboot for a product fetching webapp";
        }
    }

