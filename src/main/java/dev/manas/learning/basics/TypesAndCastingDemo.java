package dev.manas.learning.basics;

/** Primitive values, numeric promotion, widening, narrowing, and overflow. */
public final class TypesAndCastingDemo {
    private TypesAndCastingDemo() {
    }

    public static void main(String[] args) {
        byte small = 100;
        int promoted = small + 60;

        int wholeNumber = 42;
        double widened = wholeNumber;

        double decimal = 19.95;
        int narrowed = (int) decimal;

        byte maximumByte = 127;
        byte overflowed = (byte) (maximumByte + 1);

        System.out.println("promoted byte arithmetic: " + promoted);
        System.out.println("widened int: " + widened);
        System.out.println("narrowed double: " + narrowed);
        System.out.println("overflowed byte: " + overflowed);
        System.out.println("integer division: " + (5 / 2));
        System.out.println("decimal division: " + (5 / 2.0));
    }
}
