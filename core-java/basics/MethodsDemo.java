
/** Method calls and compile-time overload selection. */
public final class MethodsDemo {
    private MethodsDemo() {
    }

    public static void main(String[] args) {
        System.out.println("int overload: " + add(2, 3));
        System.out.println("double overload: " + add(2.5, 3.5));
    }

    private static int add(int left, int right) {
        return left + right;
    }

    private static double add(double left, double right) {
        return left + right;
    }
}
