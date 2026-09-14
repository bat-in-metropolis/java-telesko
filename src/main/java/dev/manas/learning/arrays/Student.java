package dev.manas.learning.arrays;

/** A small object type used to demonstrate arrays of references. */
public final class Student {
    private final int rollNumber;
    private final String name;
    private final int marks;

    public Student(int rollNumber, String name, int marks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks = marks;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return name + " (#" + rollNumber + "): " + marks;
    }
}
