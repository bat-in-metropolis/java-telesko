# Java foundations

## 1. From source to execution

```text
Hello.java --javac--> Hello.class (bytecode) --JVM--> native execution
```

- **JDK**: tools used to develop Java, including `javac` and `java`.
- **JRE**: the runtime libraries and JVM needed to run Java programs. Modern
  JDK distributions provide the runtime rather than expecting developers to
  install a separate JRE.
- **JVM**: loads, verifies, and executes bytecode. It may interpret bytecode or
  JIT-compile hot code to machine code.
- Bytecode enables the same compiled class to run on compatible JVMs.

Java is statically typed: the compiler rejects many invalid operations before
the program runs. TypeScript also checks types, but its types mostly disappear
when JavaScript is emitted; Java types remain meaningful to compilation,
bytecode, method dispatch, reflection, and runtime checks.

## 2. Program shape

```java
class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

- A class is a type and a blueprint for objects.
- `main` is the conventional application entry point.
- `public` makes it callable from outside the class.
- `static` means no `Hello` object is required.
- `void` means no value is returned.
- `String[] args` contains command-line arguments.

## 3. Values and types

Java has eight primitive types:

| Kind | Types | Important point |
| --- | --- | --- |
| whole number | `byte`, `short`, `int`, `long` | signed, fixed-size integer types |
| decimal | `float`, `double` | floating-point approximations |
| character | `char` | one UTF-16 code unit, not always a whole visible character |
| logical | `boolean` | only `true` or `false` |

Everything else is a reference type: classes, interfaces, arrays, enums, and
records. A primitive variable contains its value. A reference variable contains
a reference to an object or `null`.

```java
int count = 3;                 // primitive value
String name = "Manas";        // reference to a String object
int[] scores = {90, 95, 88};  // reference to an array object
```

Local variables must be assigned before reading them. Instance fields receive
defaults such as `0`, `false`, and `null`.

### Conversion and casting

```java
int whole = 10;
double widened = whole;       // safe widening: 10.0

double price = 19.95;
int truncated = (int) price;  // explicit narrowing: 19
```

Narrowing can lose magnitude or precision. A cast does not make the value safe:

```java
byte wrapped = (byte) 128; // -128, because byte's range was exceeded
```

Arithmetic on `byte` and `short` values is generally promoted to `int`:

```java
byte a = 10;
byte b = 20;
int sum = a + b;
```

## 4. Operators and control flow

The familiar JS operators exist, but Java operands have fixed static types.

```java
int quotient = 5 / 2;       // 2, both operands are int
double exact = 5.0 / 2;     // 2.5
boolean allowed = age >= 18 && hasAccess;
```

Use `if` for ranges or arbitrary conditions and `switch` for a known set of
discrete cases. Use the ternary operator for a small expression, not a hidden
multi-step branch.

```java
String label = score >= 50 ? "pass" : "fail";
```

Loop intent:

- `while`: repeat while a condition holds; possibly zero executions.
- `do-while`: the body must run at least once.
- traditional `for`: index/count-based iteration.
- enhanced `for`: read each array/iterable element without needing the index.

## 5. Methods and overloading

```java
int add(int left, int right) {
    return left + right;
}

double add(double left, double right) {
    return left + right;
}
```

An overload has the same method name but a different parameter list. The
compiler chooses an overload using the declared argument types. Changing only
the return type does not create a valid overload.

Unlike JS/TS, Java does not use one implementation plus optional parameters as
its normal overload model. Each Java overload has an executable body (although
one overload can delegate to another).

Java is always pass-by-value. For an object argument, the copied value is a
reference. A method can mutate the referenced object, but reassigning its local
parameter cannot replace the caller's variable.

## 6. Arrays

```java
int[] scores = new int[3];
scores[0] = 90;

Student[] students = new Student[3]; // initially {null, null, null}
```

- Arrays are objects and have fixed length.
- All elements share one declared component type.
- Indices run from `0` through `length - 1`.
- A two-dimensional array is an array whose elements are array references.
- Rows can therefore have different lengths: a jagged array.

```java
int[][] triangle = {
    {1},
    {2, 3},
    {4, 5, 6}
};
```

Unlike a JS array, a Java array is not a dynamically growing general-purpose
collection. `ArrayList` will later provide resizable list behavior.

## 7. Strings and mutability

`String` is immutable. Operations return another string; they do not alter the
original.

```java
String first = "java";
String upper = first.toUpperCase();
// first is still "java"; upper is "JAVA"
```

Compare string content with `equals`, not `==`:

```java
name.equals("Manas"); // content comparison
name == otherName;    // reference identity comparison
```

For repeated modifications:

- `StringBuilder`: mutable and normally preferred inside one thread.
- `StringBuffer`: mutable and synchronized; usually unnecessary for local work.

```java
String result = new StringBuilder()
        .append("Hello, ")
        .append(name)
        .toString();
```

## 8. Static vs instance members

- An instance field belongs to each object.
- A static field belongs to the class and is shared.
- An instance method has a `this` reference.
- A static method has no `this` and cannot directly read instance fields.
- A static initializer runs when the class is initialized, once per class
  loader—not once per object.

Prefer access through the class name:

```java
Human.species = "Homo sapiens";
Human.callingAStaticMethod();
```

Do not use `static` merely to avoid creating objects. Shared mutable static state
can make programs difficult to test and reason about.

## Memory model caution

“Locals on the stack, objects on the heap” is a useful beginner model, not a
language guarantee for every optimized value. The durable ideas are:

- each method invocation has its own local state;
- an object's lifetime is not tied to the method that created it; and
- unreachable objects become eligible for garbage collection.

