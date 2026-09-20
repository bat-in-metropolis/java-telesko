import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MethodReferenceDemo {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ram", "Lakshman", "Ravan", "Bharat", "Sita");

        // String::toUpperCase is the method-reference version of:
        // name -> name.toUpperCase()
        List<String> upperNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        upperNames.forEach(System.out::println);

        List<Student> students = new ArrayList<>();

        // for (String name : names) {
        // students.add(new Student(name));
        // }

        students = names.stream()
                // Student::new is the constructor-reference version of:
                // name -> new Student(name)
                .map(Student::new)
                // Stream.toList() is Java 16+. Collectors.toList() works in Java 8.
                .collect(Collectors.toList());

        System.out.println(students);
    }
}

class Student {
    int age;
    String name;

    public Student() {
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Student(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

}
