
/** Fixed-size arrays, enhanced loops, jagged arrays, and arrays of objects. */
public final class ArraysDemo {
    private ArraysDemo() {
    }

    public static void main(String[] args) {
        int[] oddNumbers = {1, 3, 5, 7};
        int total = 0;
        for (int number : oddNumbers) {
            total += number;
        }
        System.out.println("odd-number total: " + total);

        int[][] triangle = {
                {1},
                {2, 3},
                {4, 5, 6}
        };
        for (int row = 0; row < triangle.length; row++) {
            System.out.println("row " + row + " length: " + triangle[row].length);
        }

        Student[] students = {
                new Student(1, "Manas", 95),
                new Student(2, "Asha", 88)
        };
        for (Student student : students) {
            System.out.println(student);
        }
    }

    // Kept inside this demo so the lesson runs without package/source-path setup.
    private static final class Student {
        private final int rollNumber;
        private final String name;
        private final int marks;

        private Student(int rollNumber, String name, int marks) {
            this.rollNumber = rollNumber;
            this.name = name;
            this.marks = marks;
        }

        @Override
        public String toString() {
            return name + " (#" + rollNumber + "): " + marks;
        }
    }
}
