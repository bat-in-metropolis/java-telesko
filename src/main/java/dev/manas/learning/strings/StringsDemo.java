package dev.manas.learning.strings;

/** String immutability, value equality, and mutable string builders. */
public final class StringsDemo {
    private StringsDemo() {
    }

    public static void main(String[] args) {
        String original = "java";
        String uppercase = original.toUpperCase();
        System.out.println("original remains: " + original);
        System.out.println("new string: " + uppercase);

        String first = new String("core");
        String second = new String("core");
        System.out.println("same reference: " + (first == second));
        System.out.println("same value: " + first.equals(second));

        StringBuilder builder = new StringBuilder("Java");
        builder.append(" → Spring");
        System.out.println("builder: " + builder);
    }
}
