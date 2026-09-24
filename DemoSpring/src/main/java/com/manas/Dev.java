package com.manas;

public class Dev {

    private int age;
//    private Laptop laptop;
    private Computer comp;

    public Dev(){
        System.out.println("Dev class");
    }

//    public Laptop getLaptop() {
//        return laptop;
//    }
//
//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }

    public Dev(int age) {
        this.age = age;
        System.out.println("Dev constructor int age");
    }

//    public Dev(Laptop laptop) {
//        this.laptop = laptop;
//    }

    public int getAge() {
        return age;
    }

    public Computer getComp() {
        return comp;
    }

    public void setComp(Computer comp) {
        this.comp = comp;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void build(){
        System.out.println("Working on an awesome project");
//        laptop.compile();
        comp.compile();
    }
}
