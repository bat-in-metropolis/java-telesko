package dev.manas.learning.abstraction;

public final class Circle extends Shape {
    private final double radius;

    public Circle(double radius) {
        super("circle");
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
