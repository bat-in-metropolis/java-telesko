import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsDemo {
    public static void main(String[] args) {
        demonstrateList();
        demonstrateSet();
        demonstrateMap();
        demonstrateSorting();
    }

    private static void demonstrateList() {
        // List preserves order and allows duplicates. ArrayList grows dynamically,
        // unlike a fixed-size Java array.
        List<String> names = new ArrayList<>();
        names.add("Manas");
        names.add("Navin");
        names.add("Manas");
        System.out.println("list: " + names);
    }

    private static void demonstrateSet() {
        // Set keeps unique values. HashSet does not promise insertion order.
        Set<String> uniqueNames = new HashSet<>(Arrays.asList("Manas", "Navin", "Manas"));
        System.out.println("set: " + uniqueNames);
    }

    private static void demonstrateMap() {
        // Unlike a general JavaScript object, Map is specifically a key-value collection.
        // put() with an existing key replaces that key's previous value.
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Manas", 97);
        scores.put("Navin", 47);
        scores.put("Navin", 78);

        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            System.out.println(entry.getKey() + " scored " + entry.getValue());
        }
    }

    private static void demonstrateSorting() {
        List<Student> students = new ArrayList<>();
        students.add(new Student(17, "Ritesh"));
        students.add(new Student(15, "Jai"));
        students.add(new Student(19, "Aahi"));

        // Comparable defines the type's natural ordering.
        Collections.sort(students);
        System.out.println("natural order by age: " + students);

        // Comparator supplies another ordering without changing Student.compareTo().
        students.sort(Comparator.comparing(Student::getName));
        System.out.println("alternate order by name: " + students);
    }

    private static final class Student implements Comparable<Student> {
        private final int age;
        private final String name;

        private Student(int age, String name) {
            this.age = age;
            this.name = name;
        }

        private String getName() {
            return name;
        }

        @Override
        public int compareTo(Student other) {
            return Integer.compare(age, other.age);
        }

        @Override
        public String toString() {
            return name + " (" + age + ")";
        }
    }
}
