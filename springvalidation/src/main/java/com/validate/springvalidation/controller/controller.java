package com.validate.springvalidation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.validate.springvalidation.entity.LoginData;

@Controller
public class controller {
    

    @GetMapping("/form")
    public String form(Model m){

        m.addAttribute("loginData", new LoginData());
        return "form";
    }

    //handler for processing form

    @GetMapping("/success")
    public String processForm(@ModelAttribute("loginData") LoginData loginData){
        System.out.println(loginData);
        return "success";
    }
}
