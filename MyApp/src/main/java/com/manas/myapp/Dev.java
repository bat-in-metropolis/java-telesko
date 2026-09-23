package com.manas.myapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {
//    Laptop laptop; -- this will give null pointer error.
//    Laptop laptop = new Laptop();

//    @Autowired //Field injection
//    private Laptop laptop;

    // Constructor Injection
//    public Dev(Laptop laptop){
//        this.laptop = laptop;
//    }

    // Setter Injection
//    @Autowired
//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }

    @Autowired
    @Qualifier("laptop")
    private Computer comp;

    public void build(){
//        laptop.compile();
        comp.compile();
        System.out.println("Working on an awesome project");
    }
}
