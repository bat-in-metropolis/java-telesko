package dev.manas.learning.inheritance;

/** Third level of the calculator hierarchy. */
public final class ScientificCalc extends AdvancedCalc {
    public double power(int base, int exponent) {
        return Math.pow(base, exponent);
    }
}
