
/** Single and multilevel inheritance in use. */
public final class CalculatorDemo {
    private CalculatorDemo() {
    }

    public static void main(String[] args) {
        ScientificCalc calculator = new ScientificCalc();
        System.out.println("inherited add: " + calculator.add(3, 8));
        System.out.println("inherited multiply: " + calculator.multiply(3, 4));
        System.out.println("own power: " + calculator.power(4, 3));
    }

    private static class Calc {
        protected int add(int left, int right) {
            return left + right;
        }

        protected int subtract(int left, int right) {
            return left - right;
        }
    }

    private static class AdvancedCalc extends Calc {
        protected int multiply(int left, int right) {
            return left * right;
        }

        protected double divide(int left, int right) {
            return (double) left / right;
        }
    }

    // ScientificCalc inherits methods through two levels:
    // ScientificCalc -> AdvancedCalc -> Calc.
    private static final class ScientificCalc extends AdvancedCalc {
        private double power(int base, int exponent) {
            return Math.pow(base, exponent);
        }
    }
}
