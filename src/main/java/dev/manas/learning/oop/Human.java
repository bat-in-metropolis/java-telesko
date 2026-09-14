package dev.manas.learning.oop;

/** Encapsulated state with constructor chaining and validation. */
public final class Human {
    private static final int DEFAULT_AGE = 43;
    private static final String DEFAULT_NAME = "Aflatoon";

    private int age;
    private String name;

    public Human() {
        this(DEFAULT_AGE, DEFAULT_NAME);
    }

    public Human(int age) {
        this(age, DEFAULT_NAME);
    }

    public Human(String name) {
        this(DEFAULT_AGE, name);
    }

    public Human(int age, String name) {
        this.age = DEFAULT_AGE;
        this.name = DEFAULT_NAME;
        setAge(age);
        setName(name);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isBlank()) {
            this.name = name;
        }
    }

    @Override
    public String toString() {
        return name + ", age " + age;
    }
}
