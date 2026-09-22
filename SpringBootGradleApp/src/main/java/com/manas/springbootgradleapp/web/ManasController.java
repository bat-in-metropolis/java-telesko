package com.manas.springbootgradleapp.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ManasController {
    @GetMapping("/")
    public String getInfo(){
        return "Manas Deo";
    }
}
