import tools.calcs.*;
import tools.*;

class Hello {

    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("Hello, World!");
        // byte num1 = 100;
        // byte num2 = 60;
        // byte result = (byte) (num1 + num2);
        // int rightResult = num1 + num2;
        // byte a = 127;
        // byte b = 1;
        // byte c = (byte) (a + b);
        // System.out.println("The number is: " + num1 + " and " + num2);
        // System.out.println("The result is: " + result);
        // System.out.println("The correct result is: " + rightResult);
        // System.out.println("The number is: " + a + " and " + b);
        // System.out.println("The result is: " + c);
        // byte b = 127;
        // byte a = 3;
        // int product = a * b;
        // float f = 5.6f;
        // int t = (int) f;
        // System.out.println("The number is: " + a);
        // System.out.println("The float value is: " + f);
        // System.out.println("The truncated value is: " + t);
        // System.out.println("The product is: " + product);
        // int num1 = 10;
        // int num2 = 20;

        // int sum = num1 + num2;
        // int difference = num1 - num2;
        // int product = num1 * num2;
        // int quotient = num1 / num2;
        // int remainder = num1 % num2;

        // System.out.println("The sum is: " + sum);
        // System.out.println("The difference is: " + difference);
        // System.out.println("The product is: " + product);
        // System.out.println("The quotient is: " + quotient);
        // System.out.println("The remainder is: " + remainder);

        // num1++;
        // System.out.println("After incrementing, num1 is: " + num1);

        // num1 += 3;
        // System.out.println("After adding 3, num1 is: " + num1);

        // num1--;
        // System.out.println("After decrementing, num1 is: " + num1);

        // num1 -= 2;
        // System.out.println("After subtracting 2, num1 is: " + num1);

        // ++num1;
        // System.out.println("After pre-incrementing, num1 is: " + num1);

        // Trying to understand the difference between pre-increment and post-increment
        // int num1 = 5;
        // int num2 = 5;

        // System.out.println("Initial values: num1 = " + num1 + ", num2 = " + num2);
        // int postIncrementResult = num1++;
        // System.out.println("After post-incrementing num1: num1 = " + num1 + ",
        // postIncrementResult = " + postIncrementResult);
        // int preIncrementResult = ++num2;
        // System.out.println("After pre-incrementing num2: num2 = " + num2 + ",
        // preIncrementResult = " + preIncrementResult);
        // int i = 1;
        // int j = 1;
        // while (i <= 5) {
        // System.out.println("The value of i is: " + i);
        // // i++;
        // ++i;
        // j++;
        // }
        // System.out.println("Exited the while loop. " + "The final value of i is: " +
        // i + " and j is: " + j);
        // Calculator calc = new Calculator();
        // int sum = calc.add(10, 20);
        // System.out.println("The sum is: " + sum);
        // String firstName = new String("Manas");
        // String lastName = new String();
        // System.out.println("firstName: " + firstName);
        // System.out.println("lastName: " + lastName);
        // System.out.println("firstName hashCode: " + firstName.hashCode());
        // System.out.println("lastName hashCode: " + lastName.hashCode());
        // System.out.println("firstName length: " + firstName.length());
        // System.out.println("firstName isEmpty: " + firstName.isEmpty());
        // System.out.println("lastName length: " + lastName.length());
        // System.out.println("lastName isEmpty: " + lastName.isEmpty());

        // Student student1 = new Student();
        // student1.rollNumber = 1;
        // student1.name = "Manas";
        // student1.marks = 95;

        // Student student2 = new Student();
        // student2.rollNumber = 2;
        // student2.name = "John";
        // student2.marks = 85;

        // Student student3 = new Student();
        // student3.rollNumber = 3;
        // student3.name = "Alice";
        // student3.marks = 90;

        // Student[] students = { student1, student2, student3 };
        // Student[] students = new Student[3];
        // students[0] = student1;
        // students[1] = student2;
        // students[2] = student3;

        // System.out.println(student1);
        // System.out.println("Student Details:" + students);
        // for(int i=0; i<students.length; i++){
        // System.out.println("Student named " + students[i].name + ", who's role number
        // is " + students[i].rollNumber + " got " + students[i].marks + " marks.");
        // }

        // Enhanced For Loop
        // for(Student student: students){
        // System.out.println("Student named " + student.name + ", who's role number is
        // " + student.rollNumber + " got " + student.marks + " marks.");
        // }

        // int nums[] = new int[4];
        // nums[0] = 1;
        // nums[1] = 3;
        // nums[2] = 5;
        // nums[3] = 7;

        // for(int i=0; i<nums.length; i++){
        // System.out.println("nums[" + i + "]: " + nums[i]);
        // }
        // int i = 0;
        // for(int n: nums){
        // System.out.println("nums[" + i + "]: " + n);
        // System.out.println(n);
        // i++;
        // }

        // String name = new String("Manas");
        // System.out.println("Hello, " + name);
        // System.out.println("Hello, " + name.toUpperCase());
        // System.out.println("Hello, " + name.toLowerCase());
        // System.out.println("Hello, " + name.concat(" Deo"));

        // StringBuffer sb0 = new StringBuffer();
        // StringBuffer sb1 = new StringBuffer("Manas");

        // System.out.println("Capacity of sb0: " + sb0.capacity() + " & Capacity of
        // sb1: " + sb1.capacity());

        // Human humanObj = new Human();
        // Human humanObj01 = new Human(99);
        // Human humanObj02 = new Human("John");
        // Human humanObj03 = new Human(83, "Jane");
        // Human.species = "Homo sapiens";

        // System.out.println(
        // "Before setting anything: Name is - " + humanObj.getName() + " & Age is - " +
        // humanObj.getAge()
        // + " and is an " + Human.species);
        // humanObj.setAge(29);
        // humanObj.setName("Manas");
        // System.out.println(
        // "After setting anything: Name is - " + humanObj.getName() + " & Age is - " +
        // humanObj.getAge());
        // System.out.println(
        // "humanObj01 only setting age: Name is - " + humanObj01.getName() + " & Age is
        // - "
        // + humanObj01.getAge());
        // System.out.println(
        // "humanObj02 only setting name: Name is - " + humanObj02.getName() + " & Age
        // is - "
        // + humanObj02.getAge());
        // System.out.println(
        // "humanObj03 only setting both age & name: Name is - " + humanObj03.getName()
        // + " & Age is - "
        // + humanObj03.getAge());
        // Human.callingAStaticMethod();
        // Human.thatParticularHuman(humanObj01);
        // Class.forName("Human");

        // new AnonymousObject().show();

        // VeryAdvCalc calculator = new VeryAdvCalc();
        // int add1 = calculator.add(3, 8);
        // int sub1 = calculator.subtract(9, 3);
        // int multiply1 = calculator.multiply(3, 4);
        // double divide1 = calculator.divide(3, 5);
        // double pwr = calculator.power(4, 3);
        // System.out.println("add1: " + add1 + " sub1: " + sub1 + " multiply1: " +
        // multiply1 + " divide1: " + divide1
        // + " power: " + pwr);
        // double divide2 = calculator.divide(8, 0);

        // F fObj = new F(3, 4);
        // H hObj = new H();
        // hObj.show();
        // hObj.config();

        // VeryAdvCalc veryAdvCalc = new VeryAdvCalc();
        // Calc calc = new Calc();
        // jar jar = new jar();
        // System.out.println(jar.marks); -- wrong

        // I j = new J();
        // j.show();

        // I i = new I() { // if we are supposed to use class only once, we can use
        // this.
        // public void show() {
        // System.out.println("I in new show");
        // }
        // };
        // i.show();

        // K k = new K(); -- cannot initialize.
        // L l = new L();

        // System.out.println(M.age);
        // // A.area = 23456; -- wrong
        // Computer lap = new Laptop();
        // Computer desk = new Desktop();

        // Developer manas = new Developer();
        // manas.devApp(lap);
        // manas.devApp(desk);

        // Status s = Status.Running;
        // System.out.println(s + " : " + s.ordinal());

        // Status[] ss = Status.values();

        // for(Status status: ss){
        // System.out.println(status);
        // }

        // switch (s) {
        // case Running:
        // System.out.println("All good!");
        // break;
        // case Failed:
        // System.out.println("Try again!");
        // break;
        // case Pending:
        // System.out.println("Please wait!");
        // break;
        // default:
        // System.out.println("Done now!");
        // break;
        // }

        // LaptopWithPrice lap = LaptopWithPrice.MacBook;
        // System.out.println(lap + " : " + lap.getPrice());

        // for(LaptopWithPrice lappy: LaptopWithPrice.values()){
        // System.out.println(lappy + " : " + lappy.getPrice());
        // }
    }
}

/**
 * Types of interface
 * -- Normal
 * -- Functional/SAM(Single Abstract Method)
 * -- Marker
 */

class Q {
    public void showTheDataWhichBelongsToThisClass() {
        System.out.println("In Q Show");
    }
}

class R extends Q {
    public void showTheDataWhichBelongToThisClass() {
        System.out.println("In R Show");
    }

    @Override // -- annotation
    public void showTheDataWhichBelongsToThisClass() {
        System.out.println("In R Show");
    }
}

enum LaptopWithPrice {
    MacBook(2200), XPS(2400), Surface(1500), ThinkPad(1200);

    private int price;

    private LaptopWithPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

enum Status {
    Running, Failed, Pending, Success; // Nothing but named constants.
}

// class Computer {
// public void code() {
// }
// }

// abstract class Computer {
// public abstract void code();
// }

interface Computer {
    void code();
}

class Laptop implements Computer {
    public void code() {
        System.out.println("Code, compile, run");
    }
}

class Desktop implements Computer {
    public void code() {
        System.out.println("Code, compile, run: Faster");
    }
}

class Developer {
    public void devApp(Computer lap) {
        lap.code();
    }
}

/**
 * class -> class --> extends
 * class -> interface --> implements
 * interface -> interface --> extends
 */

interface M {
    // int age; -- by default final and static - so predefine here only.
    // String name;

    int age = 56;
    String name = "Allen";

    void show();

    void config();
}

class N implements M {

    public void show() {
        System.out.println("in show N");
    }

    public void config() {
        System.out.println("in config N");
    }

}

interface O {
    void run();
}

class P implements M, O {
    public void show() {
        System.out.println("in show P");
    }

    public void config() {
        System.out.println("in config P");
    }

    public void run() {
        System.out.println("in show P");
    }

}

abstract class K {
    public abstract void show();
}

class L extends K {
    public void show() {
        System.out.println("in K show");
    }
}

class Calculator {
    public int add(int n1, int n2) {
        return n1 + n2;
    }
}

class Student {
    int rollNumber;
    String name;
    int marks;
}

class Human {
    private int age;
    private String name;
    static String species;

    public Human() {
        // System.out.println("We are in constructor right now");
        // Default Age and Name
        this.age = 43;
        this.name = "Aflatoon";
    }

    static {
        // System.out.println("In static one!");
    }

    public Human(int age) {
        // Setting just the age from constructor
        this.age = age;
    }

    public Human(String name) {
        // Setting just the name from constructor
        this.name = name;
    }

    public Human(int age, String name) {
        // Setting both age and name form constructor
        this.age = age;
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

    public static void callingAStaticMethod() {
        System.out.println("Why are you calling a static method?");
    }

    public static void thatParticularHuman(Human human) {
        System.out.println(
                "Before setting anything: Name is - " + human.getName() + " & Age is - " + human.getAge()
                        + " and is an " + Human.species);
    }
}

class AnonymousObject {
    AnonymousObject() {
        System.out.println("Anonymous Object just got created");
    }

    public void show() {
        System.out.println("Anonymous Object is shown now.");
    }
}

class A {
}

class B {
}

class C extends A {
}
// class D extends A,B{} -- multiple inheritance is not allowed in java

class E extends Object {
    public E() {
        super();
        System.out.println("In E");
    }

    public E(int a) {
        System.out.println("In E but with int");
    }
}

class F extends E {
    public F() {
        System.out.println("In F");
    }

    public F(int a) {
        super(a);
        System.out.println("In F but with int");
    }

    public F(int a, int b) {
        this();
        System.out.println("In F but with 2 int");
    }
}

class G {
    public void show() {
        System.out.println("printing from G show");
    }

    public void config() {
        System.out.println("printing from G config");
    }
}

class H extends G {
    public void show() {
        System.out.println("printing from H show");
    }
}

/**
 * Private - Protected - Public - Default
 * Same class - Yes - Yes - Yes - Yes
 * 
 * Same package - No - Yes - Yes - Yes
 * subclass
 * 
 * Same package - No - Yes - Yes - Yes
 * non-subclass
 * 
 * Different package - No - Yes - Yes - No
 * subclass
 * 
 * Different package - No - No - Yes - No
 * non-subclass
 */

class I {
    public void show() {
        System.out.println("Showing from I");
    }
}

class J extends I {
    public void show() {
        System.out.println("Showing from J");
    }
}