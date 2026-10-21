package com.manas.singlewebapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class HomeController {

    @RequestMapping("/")
//    @ResponseBody()
    public String greet(){
        return "Welcome to spring boot";
    }

    @RequestMapping("/about")
    public String about(){
        return "Welcode to about page";
    }
}
