package dev.manas.learning.annotations;

/** Compiler-readable metadata using built-in annotations. */
public final class AnnotationDemo {
    private AnnotationDemo() {
    }

    public static void main(String[] args) {
        Formatter formatter = new UppercaseFormatter();
        System.out.println(formatter.format("annotation checked override"));
    }

    private interface Formatter {
        String format(String value);
    }

    private static final class UppercaseFormatter implements Formatter {
        @Override
        public String format(String value) {
            return value.toUpperCase();
        }
    }
}
