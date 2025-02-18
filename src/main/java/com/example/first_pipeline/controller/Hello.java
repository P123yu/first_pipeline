package com.example.first_pipeline.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/get")
public class Hello {

    @GetMapping
    public String message(){
        return "hello git actions from piyush";
    }

}
