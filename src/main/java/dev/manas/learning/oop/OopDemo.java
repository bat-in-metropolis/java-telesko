package dev.manas.learning.oop;

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
}
