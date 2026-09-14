package dev.manas.learning.polymorphism;

/** Depends on a contract rather than constructing a particular machine. */
public final class Developer {
    public void buildApplication(Computer computer) {
        computer.code();
    }
}
