package com.thyleafpractise.thymeleafpractical.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ExampleController {

    @GetMapping("/example")
    public String example(){

        return "example";
    }
}
