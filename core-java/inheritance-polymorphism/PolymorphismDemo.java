
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

    private interface Computer {
        void code();
    }

    private static final class Laptop implements Computer {
        @Override
        public void code() {
            System.out.println("Code, compile, run on a portable machine");
        }
    }

    private static final class Desktop implements Computer {
        @Override
        public void code() {
            System.out.println("Code, compile, run with more performance");
        }
    }

    private static final class Developer {
        // Depending on Computer lets the same method accept any implementation.
        private void buildApplication(Computer computer) {
            computer.code();
        }
    }
}
