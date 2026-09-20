
/** Member inner classes and one-off anonymous implementations. */
public final class InnerClassDemo {
    private final String outerMessage = "state from the outer object";

    private final class MemberInner {
        void show() {
            System.out.println(outerMessage);
        }
    }

    public static void main(String[] args) {
        InnerClassDemo outer = new InnerClassDemo();
        MemberInner inner = outer.new MemberInner();
        inner.show();

        Greeting greeting = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("hello from an anonymous class");
            }
        };
        greeting.sayHello();
    }

    private interface Greeting {
        void sayHello();
    }
}
