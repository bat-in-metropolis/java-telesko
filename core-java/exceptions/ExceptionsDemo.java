import java.util.Scanner;

public class ExceptionsDemo {
    public static void main(String[] args) {
        demonstrateTryCatch();
        demonstrateCustomException();
        demonstrateTryWithResources();
    }

    private static void demonstrateTryCatch() {
        try {
            int divisor = 0;
            int result = 20 / divisor;
            System.out.println(result);
        } catch (ArithmeticException exception) {
            // Catch the specific failure you know how to handle.
            System.out.println("Cannot divide by zero");
        } finally {
            // finally runs whether the try block succeeds or fails.
            System.out.println("Division attempt finished");
        }
    }

    private static void demonstrateCustomException() {
        try {
            validateScore(120);
        } catch (InvalidScoreException exception) {
            System.out.println(exception.getMessage());
        }
    }

    private static void validateScore(int score) throws InvalidScoreException {
        if (score < 0 || score > 100) {
            // throw creates/signals the exception; throws declares it to the caller.
            throw new InvalidScoreException("Score must be between 0 and 100");
        }
    }

    private static void demonstrateTryWithResources() {
        // A resource implements AutoCloseable. Java closes it automatically when
        // execution leaves this block, including when an exception occurs.
        try (Scanner scanner = new Scanner("42")) {
            System.out.println("scanner value: " + scanner.nextInt());
        }
    }

    private static final class InvalidScoreException extends Exception {
        private static final long serialVersionUID = 1L;

        private InvalidScoreException(String message) {
            super(message);
        }
    }
}
