package com.manas.myapp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Desktop implements Computer {
    public void compile(){
        System.out.println("Working on 404 bugs, but with Desktop");
    }
}
