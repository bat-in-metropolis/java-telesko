package dev.manas.learning.abstraction;

/** Shares behavior while requiring each shape to supply its area formula. */
public abstract class Shape {
    private final String name;

    protected Shape(String name) {
        this.name = name;
    }

    public abstract double area();

    public void describe() {
        System.out.printf("%s area: %.2f%n", name, area());
    }
}
