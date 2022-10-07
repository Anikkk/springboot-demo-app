package com.thyleafpractise.thymeleafpractical.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
   
    @GetMapping("/")
    public String about1(Model model){
        model.addAttribute("name","Aniket");
        model.addAttribute("currentdate", new Date().toLocaleString());
        return "index";
    }

    @GetMapping("/loop")
    public String iterateHandler(Model m){

        List<String> names=List.of("Karan","Aniket","Shubham","Aliya");
        m.addAttribute("names", names);
        return "iterate";
    }

    @GetMapping("/condition")
    public String conditionHandler(Model m){
        m.addAttribute("isActive",false);
        m.addAttribute("gender","F");
        return "condition";

    }

    @GetMapping("/service")
    public String serivceHandler(Model m){
        
        return "service";
    }

    
}
