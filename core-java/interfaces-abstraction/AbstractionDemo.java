
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

    private abstract static class Shape {
        private final String name;

        private Shape(String name) {
            this.name = name;
        }

        protected abstract double area();

        private void describe() {
            System.out.printf("%s area: %.2f%n", name, area());
        }
    }

    private static final class Circle extends Shape {
        private final double radius;

        private Circle(double radius) {
            super("circle");
            this.radius = radius;
        }

        @Override
        protected double area() {
            return Math.PI * radius * radius;
        }
    }

    private static final class Rectangle extends Shape {
        private final double width;
        private final double height;

        private Rectangle(double width, double height) {
            super("rectangle");
            this.width = width;
            this.height = height;
        }

        @Override
        protected double area() {
            return width * height;
        }
    }
}
