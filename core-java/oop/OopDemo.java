
/** Objects, encapsulation, overloaded constructors, and this(...). */
public final class OopDemo {
    private OopDemo() {
    }

    public static void main(String[] args) {
        Human defaultHuman = new Human();
        Human namedHuman = new Human("Manas");
        Human completeHuman = new Human(29, "Navin");

        namedHuman.setAge(30);

        System.out.println(defaultHuman);
        System.out.println(namedHuman);
        System.out.println(completeHuman);
    }

    // Human is part of this OOP lesson, so it lives here instead of requiring
    // the IDE to discover another source file.
    private static final class Human {
        private static final int DEFAULT_AGE = 43;
        private static final String DEFAULT_NAME = "Aflatoon";

        private int age;
        private String name;

        private Human() {
            this(DEFAULT_AGE, DEFAULT_NAME);
        }

        private Human(int age) {
            this(age, DEFAULT_NAME);
        }

        private Human(String name) {
            this(DEFAULT_AGE, name);
        }

        private Human(int age, String name) {
            this.age = DEFAULT_AGE;
            this.name = DEFAULT_NAME;
            setAge(age);
            setName(name);
        }

        private void setAge(int age) {
            if (age >= 0) {
                this.age = age;
            }
        }

        private void setName(String name) {
            // isBlank() requires Java 11. This version remains Java 8 compatible.
            if (name != null && !name.trim().isEmpty()) {
                this.name = name;
            }
        }

        @Override
        public String toString() {
            return name + ", age " + age;
        }
    }
}
