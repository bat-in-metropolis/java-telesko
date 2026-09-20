import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodRefEx {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ram", "Lakshman", "Ravan", "Bharat", "Sita");

        // List<String> uNames = names.stream()
        // // .map(name -> name.toUpperCase())
        // .map(String::toUpperCase)
        // .toList();

        // System.out.println(uNames);
        // uNames.forEach(System.out::println);

        List<Student> students = new ArrayList<>();

        // for (String name : names) {
        // students.add(new Student(name));
        // }

        students = names.stream()
                // .map(name -> new Student(name))
                .map(Student::new)
                .toList();

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