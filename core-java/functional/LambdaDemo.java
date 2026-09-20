
/** The same behavior expressed as an anonymous class and as lambdas. */
public final class LambdaDemo {
    private LambdaDemo() {
    }

    public static void main(String[] args) {
        // Before lambdas, a one-method interface needed this anonymous class syntax.
        Operation anonymousAdd = new Operation() {
            @Override
            public int apply(int left, int right) {
                return left + right;
            }
        };

        // A lambda supplies the behavior for Operation.apply().
        // Similar to a JS callback, but Java needs a target functional-interface type.
        Operation lambdaMultiply = (left, right) -> left * right;

        // Braces are useful when the lambda needs multiple statements and an explicit return.
        Operation blockSubtract = (left, right) -> {
            int result = left - right;
            return result;
        };

        System.out.println("anonymous add: " + anonymousAdd.apply(8, 3));
        System.out.println("lambda multiply: " + lambdaMultiply.apply(8, 3));
        System.out.println("block lambda subtract: " + blockSubtract.apply(8, 3));
    }

    // @FunctionalInterface asks the compiler to enforce one abstract method.
    @FunctionalInterface
    private interface Operation {
        int apply(int left, int right);
    }
}
