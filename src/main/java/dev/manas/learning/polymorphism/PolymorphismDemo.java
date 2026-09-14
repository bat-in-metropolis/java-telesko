package dev.manas.learning.polymorphism;

/** Declared interface types and runtime method dispatch. */
public final class PolymorphismDemo {
    private PolymorphismDemo() {
    }

    public static void main(String[] args) {
        Computer portable = new Laptop();
        Computer powerful = new Desktop();

        Developer developer = new Developer();
        developer.buildApplication(portable);
        developer.buildApplication(powerful);
    }
}
