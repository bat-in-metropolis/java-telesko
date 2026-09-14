package tools.calcs;
public class AdvCalc extends Calc{
    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot be divided by zero");
        } else {
            return (double) a / b;
        }
    }
}
