package dev.manas.learning.inheritance;

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
}
