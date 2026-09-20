import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Hello {
    public static void main(String[] args) {
        // A objA01 = new A() {
        // public void show(int i) {
        // System.out.println("in Show but from Hello obj01 " + i);
        // }
        // };
        // objA01.show(5);

        // A objA02 = (int i) -> System.out.println("in Show but from Hello obj02 " +
        // i);

        // objA02.show(7);

        // C objC = new C() {
        // public int add(int i, int j) {
        // return i + j;
        // }
        // };
        // System.out.println(objC.add(3, 9));

        // C objC2 = (int i, int j) -> i + j;
        // System.out.println(objC2.add(13, 9));

        /**
         * -- Exception --
         * Type of errors
         * 1. Compile Time Error
         * 2. Runtime Error -> Exception handling
         * 3. Logical Error
         */

        // System.out.Println("Compile Time Error"); - Compile Time Error And
        // Syntactical Error

        // int i = 0;
        // int j = 0;
        // int nums[] = new int[5];
        // String str = null;

        // try {
        // // j = 20 / i;
        // System.out.println(str.length());
        // System.out.println(nums[1]);
        // System.out.println(nums[5]);
        // } catch (ArithmeticException e) {
        // System.out.println("Cannot divide by zero");
        // } catch (ArrayIndexOutOfBoundsException e) {
        // System.out.println("Index is out of limit of array");
        // } catch (Exception e) {
        // System.out.println("Something went wrong... " + e);
        // }
        // // System.out.println(j);
        // System.out.println("Bye");

        /**
         * Object
         * - Throwable
         * -- Error(Can't be handled)
         * -- Exceptions(Can be handled in catch block)
         * 
         * -- Error
         * --- Thread Death
         * --- IO Error
         * --- Virtual Machine Error
         * --- Out of Memory
         * 
         * -- Exceptions
         * --- Runtime Exceptions | Unchecked Exception(Not mandatory to handle)
         * --- SQL Exceptions | Checked Exception(JVM Forces us to handle checked ones)
         * --- IO Exception | Checked Exception
         * 
         * --- Runtime Exceptions
         * ---- ArithmeticException
         * ---- ArrayIndexOutOfBoundsException
         * ---- NullPointerException...
         */

        // int i = 24;
        // int j = 0;

        // try {
        // j = 20 / i;
        // if (j == 0)
        // // throw new ArithmeticException("Why do you want to print zero??");
        // throw new ManasExceptions("Why are you running?? ehhh...");
        // } catch (ManasExceptions e) {
        // j = 32;
        // System.out.println(e);
        // } catch (ArithmeticException e) {
        // j = 12;
        // System.out.println("Cannot divide by zero");
        // } catch (Exception e) {
        // System.out.println("Something went wrong... " + e);
        // }
        // System.out.println(j);
        // System.out.println("Bye");

        // D objD = new D();
        // objD.show();

        // E objE = new E();
        // try {
        // objE.show();
        // } catch (ClassNotFoundException e) {
        // e.printStackTrace();
        // }

        // try {
        // System.out.println("Enter a number between 0 to 9");
        // int num = System.in.read();
        // System.out.println(num - 48);
        // } catch (IOException e) {
        // e.printStackTrace();
        // }

        // BufferedReader bf = null;

        // try {
        // System.out.println("Enter a number: ");

        // InputStreamReader in = new InputStreamReader(System.in);
        // bf = new BufferedReader(in);

        // int num = Integer.parseInt(bf.readLine());

        // System.out.println(num);
        // } catch (NumberFormatException e) {
        // e.printStackTrace();
        // } catch (IOException e) {
        // e.printStackTrace();
        // } finally {
        // if (bf != null) {
        // try {
        // bf.close();
        // } catch (IOException e) {
        // e.printStackTrace();
        // }
        // }
        // }

        // System.out.println("Enter a number: ");
        // try (Scanner sc = new Scanner(System.in)) {
        // int num = sc.nextInt();

        // System.out.println(num);
        // }

        // or

        // Scanner sc = null;

        // try {
        // sc = new Scanner(System.in);

        // System.out.print("Enter a number: ");
        // int num = sc.nextInt();

        // System.out.println("You entered: " + num);

        // } catch (Exception e) {
        // e.printStackTrace();

        // } finally {
        // if (sc != null) {
        // sc.close();
        // }
        // }

        // G objG = new G();
        // F objF = new F();

        // System.out.println(objF.getPriority());
        // objF.setPriority(Thread.MAX_PRIORITY);
        // System.out.println(objF.getPriority());

        // objG.start();
        // try {
        // Thread.sleep(5);
        // } catch (InterruptedException e) {
        // e.printStackTrace();
        // }
        // objF.start();

        // Runnable objH = new H();
        // Runnable objI = new I();

        // Runnable obj1 = new Runnable() { // what is the correct name of writing code
        // in this way??
        // public void run() {
        // for (int i = 0; i <= 5; i++) {
        // System.out.println("There?");
        // try {
        // Thread.sleep(10);
        // } catch (InterruptedException e) {
        // e.printStackTrace();
        // }
        // }
        // }
        // };

        // Runnable objLambda = () -> {
        // for (int i = 0; i <= 5; i++) {
        // System.out.println("Hey?");
        // try {
        // Thread.sleep(10);
        // } catch (InterruptedException e) {
        // e.printStackTrace();
        // }
        // }
        // };

        // Thread tH = new Thread(objH);
        // Thread tI = new Thread(objI);
        // Thread tObj1 = new Thread(obj1);
        // Thread tObjLambda = new Thread(objLambda);

        // tH.start();
        // tI.start();
        // tObj1.start();
        // tObjLambda.start();

        /**
         * Race Condition
         */

        // Counter counter = new Counter();
        // Runnable obj1 = () -> {
        // for (double i = 0; i < 1000; i++) {
        // counter.increment();
        // }
        // };

        // Runnable obj2 = () -> {
        // for (double i = 0; i < 1000; i++) {
        // counter.increment();
        // }
        // };

        // Thread thread1 = new Thread(obj1);
        // Thread thread2 = new Thread(obj2);

        // thread1.start();
        // thread2.start();

        // try {
        // thread1.join();
        // } catch (InterruptedException e) {
        // e.printStackTrace();
        // }
        // try {
        // thread2.join();
        // } catch (InterruptedException e) {
        // e.printStackTrace();
        // }

        // System.out.println(counter.getCount());

        /**
         * Thread States
         * 
         * New --[start()]--> Runnable --[run()]--> Running --[stop()]--> Dead[can come
         * here using stop() from Runnable & Running too]
         * ^ /
         * \ [sleep(), wait()]
         * [notify()] /
         * \ \/
         * Waiting
         * 
         */

        /**
         * Collection
         * 
         * Collection API - concept
         * Collection - interface
         * Collections - class
         * 
         * Collection
         * - List - ArrayList, LinkedList
         * - Queue - DeQueue
         * - Set - HashSet, LinkedHashSet
         * 
         * There is Map as well
         */

        // // Collection<Integer> numbers = new ArrayList<Integer>();
        // List<Integer> numbers = new ArrayList<Integer>();
        // // Set<Integer> numbers = new HashSet<Integer>();
        // for (int i = 0; i < 9; i++) {
        // numbers.add(i);
        // }
        // numbers.add(5);
        // // numbers.add("7");
        // System.out.println(numbers);
        // // System.out.println(numbers.length);
        // Iterator<Integer> values = numbers.iterator();

        // while (values.hasNext()) {
        // System.out.println(values.next());
        // }

        // for (int n : numbers) {
        // System.out.println(n);
        // }

        /**
         * Map
         */

        /**
         * Need to check the difference between 'int' vs 'Integer'??
         */
        // Map<String, Integer> students = new HashMap<>();
        // students.put("Manas", 97);
        // students.put("Navin", 47);
        // students.put("Harsh", 87);
        // students.put("Dev", 59);
        // students.put("Navin", 78);

        // System.out.println(students);
        // System.out.println(students.keySet());

        // for (String student : students.keySet()) {
        // System.out.println(student + " : " + students.get(student));
        // }

        /**
         * Sorting
         */

        // Comparator<Integer> comp = new Comparator<Integer>() {
        // public int compare(Integer i, Integer j) {
        // if (i % 10 > j % 10)
        // return 1;
        // else
        // return -1;
        // }
        // };

        // List<Integer> numbers = new ArrayList<>();
        // numbers.add(35);
        // numbers.add(4);
        // numbers.add(11);
        // numbers.add(73);
        // numbers.add(28);

        // System.out.println(numbers);

        // Collections.sort(numbers);

        // System.out.println(numbers);

        // Collections.sort(numbers, comp);

        // System.out.println(numbers);

        // Comparator<String> stud = new Comparator<String>() {
        // public int compare(String student1, String student2) {
        // if (student1.length() > student2.length())
        // return 1;
        // else
        // return -1;
        // }
        // };

        // List<String> students = new ArrayList<>();
        // students.add("Manas");
        // students.add("Ravan");
        // students.add("Ram");
        // students.add("Lakshman");
        // students.add("Bharat");

        // System.out.println(students);

        // Collections.sort(students);

        // System.out.println(students);

        // Collections.sort(students, stud);

        // System.out.println(students);

        // List<Student> studentsList = new ArrayList<>();
        // studentsList.add(new Student(12, "Aadi"));
        // studentsList.add(new Student(17, "Ritesh"));
        // studentsList.add(new Student(15, "Jai"));
        // studentsList.add(new Student(19, "Aahi"));

        // for (Student student : studentsList) {
        // System.out.println(student.toString());
        // }

        // Collections.sort(studentsList);

        // for (Student student : studentsList) {
        // System.out.println(student.toString());
        // }

        /**
         * Stream API
         */
        // List<Integer> nums = Arrays.asList(9, 2, 4, 1);
        // nums.forEach(n -> System.out.println(n));
        // int sum = 0;
        // for (int num : nums) {
        // if (num % 2 == 0) {
        // num *= 2;
        // sum += num;
        // }
        // }
        // System.out.println(nums);
        // System.out.println(sum);

        // Consumer<Integer> con = new Consumer<Integer>() {
        // public void accept(Integer n) {
        // System.out.println(n);
        // }
        // };

        // Consumer<Integer> conLambda = n -> System.out.println("L: " + n);

        // nums.forEach(con);
        // nums.forEach(conLambda);
        // nums.forEach(n -> System.out.println(n));

        // Stream<Integer> stream1 = nums.stream();

        // // stream1.forEach((Integer n) -> System.out.println(n));
        // Stream<Integer> stream2 = stream1.map(n -> n * n);
        // stream2.forEach((Integer n) -> System.out.println(n));

        // // System.out.println(stream2);
        // System.out.println(nums);

        // Predicate<Integer> predicate1 = new Predicate<Integer>() {
        //     public boolean test(Integer n) {
        //         if (n % 2 == 0)
        //             return true;
        //         else
        //             return false;
        //     }
        // };

        // Predicate<Integer> predicate2 = n -> n % 2 == 0;

        // Function<Integer, Integer> map1 = new Function<Integer, Integer>() {
        //     public Integer apply(Integer n) {
        //         return n * n;
        //     }
        // };

        // Function<Integer, Integer> map2 = (Integer n) -> n * n;

        // int result = nums.stream().filter(predicate2).map(map2).reduce(0, (c, e) -> c + e);
        // System.out.println(result);

        /**
         * Optional
         */
    }
}

class Student implements Comparable<Student> {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Student: [age: " + this.age + ", name: " + this.name + "]";
    }

    public int compareTo(Student that) {
        System.out.println("Student compareTo: this.age: " + this.age + " that.age: " + that.age);
        if (this.age > that.age)
            return 1;
        else
            return -1;
    }
}

class Counter {
    double count;

    public double getCount() {
        return count;
    }

    public synchronized void increment() {
        count++;
    }
}

class H implements Runnable {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class I implements Runnable {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class G extends Thread {
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.println("G");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class F extends Thread {
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.println("F");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

/**
 * try-with-resources
 * --> try-with-resources is a java syntax that automatically closes a resource
 * when we are done using them.
 * --> What is 'resource' here??
 * -> file, DB connection, Sockets, Scanner, BufferReader, Streams
 * 
 * Syntax
 * try (ResourceType resource = new ResourceType()) {
 * // use resource here
 * }
 * 
 * ----> Need to understand Closeable and AutoClosable too
 */

class D {
    public void show() {
        try {
            Class.forName("calc");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found! in D : " + e);
        }
    }
}

class E {
    public void show() throws ClassNotFoundException {
        Class.forName("calc");
    }
}

class ManasExceptions extends Throwable {
    public ManasExceptions(String str) {
        super(str);
    }
}

@FunctionalInterface
interface A {
    void show(int i);
}

class B implements A {
    public void show(int i) {
        System.out.println("in Show B");
    }
}

interface C {
    int add(int i, int j);
}