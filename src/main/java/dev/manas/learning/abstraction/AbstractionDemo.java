package dev.manas.learning.abstraction;

/** Shared abstract behavior plus polymorphic concrete implementations. */
public final class AbstractionDemo {
    private AbstractionDemo() {
    }

    public static void main(String[] args) {
        Shape[] shapes = {new Circle(2), new Rectangle(3, 4)};
        for (Shape shape : shapes) {
            shape.describe();
        }
    }
}
