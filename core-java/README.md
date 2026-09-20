# Core Java revision guide

Status: **Core Java through Java 8 essentially complete.**

This section is deliberately simple. Each folder represents a topic, and each
important topic has an obvious runnable demo. Each `.java` lesson is
self-contained, so running it does not depend on another source file, package,
or source-root configuration. These are learning examples, not one application
and not a Gradle multi-module build.

## Running an example

The easiest option is to open the demo file and click the IDE's **Run** button.

If you want to use the terminal, enter the topic folder first. For example:

```bash
cd core-java/streams
javac StreamsDemo.java
java StreamsDemo
```

Generated `.class` files are ignored by Git.

## Topic index

| Topic | Folder | Main class to run |
| --- | --- | --- |
| Types, loops, methods, arrays, strings, static | [basics](basics) | `TypesAndCastingDemo`, `ArraysDemo`, etc. |
| Classes, encapsulation, constructors, inner classes | [oop](oop) | `OopDemo`, `InnerClassDemo` |
| Inheritance and runtime polymorphism | [inheritance-polymorphism](inheritance-polymorphism) | `CalculatorDemo`, `PolymorphismDemo` |
| Interfaces and abstract classes | [interfaces-abstraction](interfaces-abstraction) | `AbstractionDemo` |
| Enums and annotations | [enums-annotations](enums-annotations) | `EnumDemo`, `AnnotationDemo` |
| Exceptions and try-with-resources | [exceptions](exceptions) | `ExceptionsDemo` |
| List, Set, Map, Comparator, Comparable | [collections](collections) | `CollectionsDemo` |
| Functional interfaces and lambdas | [functional](functional) | `LambdaDemo` |
| filter, map, reduce, sorted, parallel streams | [streams](streams) | `StreamsDemo`, `ParallelStreamsDemo` |
| Missing values without raw null | [optional](optional) | `OptionalDemo` |
| Method and constructor references | [method-references](method-references) | `MethodReferenceDemo` |
| Thread, Runnable, join, synchronized | [multithreading](multithreading) | `MultithreadingDemo` |
| Exercises and diagnostic questions | [revision](revision) | README only |

## Mental model: source to execution

```text
.java source --javac--> .class bytecode --JVM--> running program
```

- **JDK**: the development kit, including `javac` and `java`.
- **JVM**: loads and executes Java bytecode.
- **Primitive variable**: directly contains a primitive value.
- **Reference variable**: contains a reference to an object or `null`.
- Java is always pass-by-value. Passing an object copies the reference value;
  both references can still point to the same mutable object.

Unlike TypeScript, Java types are not merely removed before execution. They
affect compilation, overload selection, runtime casts, reflection, and method
dispatch.

## Basics worth remembering

- Java has eight primitives: `byte`, `short`, `int`, `long`, `float`, `double`,
  `char`, and `boolean`.
- Integer division truncates: `5 / 2` is `2`; `5 / 2.0` is `2.5`.
- Narrowing casts can lose information.
- Arrays are fixed-size objects; `ArrayList` is a resizable collection.
- `String` is immutable.
- For object content, use `equals()` rather than `==`. For ordinary objects,
  `==` asks whether two references point to the same object.
- Java conditions require `boolean`; there is no JavaScript-style truthiness.
- `final` prevents reassignment of a variable; it does not deeply freeze the
  referenced object, similar to the limitation of JavaScript `const`.

## OOP, inheritance, and polymorphism

- A class defines state and behavior; an object is one instance.
- Encapsulation protects valid state. It does not mean “generate a setter for
  every field.”
- `this(...)` delegates to another constructor in the same class.
- `super(...)` invokes a superclass constructor.
- **Overloading**: same method name, different parameter list; selected at
  compile time.
- **Overriding**: subclass/implementation replaces inherited behavior; selected
  at runtime for instance methods.

```java
Computer computer = new Laptop();
computer.code();
```

`Computer` is the declared type and controls which methods can be called.
`Laptop` is the actual type and controls which overridden implementation runs.
This distinction is foundational for Spring dependency injection.

## Abstract classes and interfaces

An abstract class can share state, constructors, and implemented behavior while
requiring subclasses to implement abstract methods.

An interface defines a contract/capability. A class can implement multiple
interfaces, allowing callers to depend on behavior rather than one concrete
class.

```java
interface NotificationSender {
    void send(String message);
}
```

Spring service and repository abstractions rely heavily on this way of thinking.

## Exceptions

- `try`: code that may fail.
- `catch`: handles a compatible failure.
- `finally`: cleanup that runs after `try`/`catch`.
- `throw`: create/signal one exception now.
- `throws`: declare that a method may pass an exception to its caller.
- checked exception: compiler requires handling or declaration.
- unchecked exception: subclass of `RuntimeException`; compiler does not force
  handling.
- try-with-resources closes `AutoCloseable` resources automatically.

Catch only failures you can meaningfully handle. Avoid swallowing exceptions
without context.

## Collections and generics

- `List<T>`: ordered, duplicates allowed.
- `Set<T>`: unique values.
- `Map<K, V>`: key-value associations; not a subtype of `Collection`.
- `Comparable<T>`: natural ordering owned by the type.
- `Comparator<T>`: an alternative ordering supplied from outside.
- Generics such as `List<String>` provide compile-time type safety. Java
  generics do not accept primitives directly, so use wrappers such as `Integer`.

Unlike a general JavaScript object, Java `Map` is specifically a key-value data
structure with a collection API.

## Lambdas and functional interfaces

A functional interface has exactly one abstract method. A lambda supplies that
method's behavior:

```java
Operation multiply = (left, right) -> left * right;
```

The syntax resembles a JS arrow function, but Java needs a target type such as
`Operation`, `Predicate<T>`, `Function<T, R>`, or `Consumer<T>`.

## Streams

A Stream describes a processing pipeline; it does not store the data.

- `filter`: keep matching elements.
- `map`: transform each element.
- `sorted`: produce an ordered stream.
- `reduce`: combine elements into one result.
- intermediate operations are lazy.
- terminal operations trigger work.
- a Stream is single-use.
- the original collection is not modified by the pipeline.

This resembles JS array transformations, but Java Streams are lazy until a
terminal operation such as `collect`, `count`, or `reduce` runs.

Parallel streams are not automatically faster. Thread coordination, ordering,
shared state, and the amount of work per element all matter.

## Optional

`Optional<T>` represents a result that may be present or absent. It makes a
missing return value explicit instead of returning raw `null`.

Useful operations include `orElse`, `orElseGet`, `map`, `filter`, and
`ifPresent`. Do not use `Optional` for every field or parameter merely to avoid
learning null handling.

## Method references

Method references are shorter lambdas when an existing method already performs
the required work:

```java
name -> name.toUpperCase()  // lambda
String::toUpperCase        // equivalent method reference

name -> new Student(name)  // lambda
Student::new               // constructor reference
```

## Multithreading

- `Runnable` describes work.
- `Thread` executes work.
- `start()` begins concurrent execution; calling `run()` directly does not
  start a new thread.
- `join()` waits for a thread to finish.
- shared mutable state can create race conditions.
- `synchronized` can protect a critical section, but advanced concurrency is
  intentionally postponed for the work roadmap.

## Java 8 compatibility

The FMS-GPS backend targets Java 8. When reading newer tutorials, watch for
features unavailable at work:

| Feature | Introduced | Java 8 alternative |
| --- | --- | --- |
| `var` | Java 10 | write the explicit type |
| `String.isBlank()` | Java 11 | `trim().isEmpty()` |
| records | Java 16 | ordinary class |
| `Stream.toList()` | Java 16 | `collect(Collectors.toList())` |
| sealed classes | Java 17 | ordinary inheritance + access control |
| modern pattern matching | newer Java | explicit cast/branching |

These features are valid in Java 21 experiments, but they cannot be copied into
the Java 8 work backend.
