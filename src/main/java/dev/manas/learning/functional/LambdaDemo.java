package dev.manas.learning.functional;

/** The same behavior expressed as an anonymous class and as lambdas. */
public final class LambdaDemo {
    private LambdaDemo() {
    }

    public static void main(String[] args) {
        Operation anonymousAdd = new Operation() {
            @Override
            public int apply(int left, int right) {
                return left + right;
            }
        };

        Operation lambdaMultiply = (left, right) -> left * right;

        Operation blockSubtract = (left, right) -> {
            int result = left - right;
            return result;
        };

        System.out.println("anonymous add: " + anonymousAdd.apply(8, 3));
        System.out.println("lambda multiply: " + lambdaMultiply.apply(8, 3));
        System.out.println("block lambda subtract: " + blockSubtract.apply(8, 3));
    }
}
