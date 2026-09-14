package dev.manas.learning.polymorphism;

public final class Laptop implements Computer {
    @Override
    public void code() {
        System.out.println("Code, compile, run on a portable machine");
    }
}
