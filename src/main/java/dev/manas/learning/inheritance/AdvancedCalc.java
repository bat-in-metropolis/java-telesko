package dev.manas.learning.inheritance;

/** Adds multiplication and division to Calc. */
public class AdvancedCalc extends Calc {
    public int multiply(int left, int right) {
        return left * right;
    }

    public double divide(int left, int right) {
        return (double) left / right;
    }
}
