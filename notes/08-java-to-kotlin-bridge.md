# From Core Java to reading Kotlin and React Native Android code

## The accurate relationship

Java and Kotlin are separate languages. Kotlin was designed for strong Java
interoperability and normally targets the JVM on Android, so they share a large
runtime and library ecosystem. Java knowledge transfers strongly, but Kotlin is
not merely shorter Java.

Core Java gives you the hard-to-see foundations behind Kotlin code:

- objects, classes, constructors, interfaces, inheritance, and dispatch;
- JVM types, bytecode, packages, visibility, and annotations;
- Java/Android library APIs;
- generics and collections;
- exceptions and resource ownership;
- lambdas and single-abstract-method interfaces; and
- threads and shared mutable state.

## Syntax bridge

### Variables and types

```java
// Java
final String name = "Manas";
int count = 1;
```

```kotlin
// Kotlin
val name: String = "Manas" // read-only binding
var count: Int = 1         // reassignable binding
```

Kotlin frequently infers the type. `val` resembles a final Java local/reference,
not a deeply immutable object.

### Classes and properties

```java
// Java
public final class User {
    private final String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
```

```kotlin
// Kotlin
class User(val name: String)
```

Kotlin properties generate/access getter-like JVM behavior. When Kotlin calls
conventional Java getters and setters, they can often appear as property access.

### Inheritance and overriding

```java
// Java classes and methods are extendable unless final.
class Parent {
    public void show() { }
}
```

```kotlin
// Kotlin classes and methods are final unless explicitly open.
open class Parent {
    open fun show() {}
}

class Child : Parent() {
    override fun show() {}
}
```

Your Java understanding of overriding and dynamic dispatch remains valid; the
default extensibility is different.

### Interfaces and lambdas

```java
@FunctionalInterface
interface Listener {
    void onValue(String value);
}

Listener listener = value -> System.out.println(value);
```

```kotlin
fun interface Listener {
    fun onValue(value: String)
}

val listener = Listener { value -> println(value) }
```

Kotlin also has first-class function types such as `(String) -> Unit`, so not
every callback needs a declared interface.

## The major differences to learn after Core Java

### 1. Nullability is part of Kotlin's type system

```kotlin
var required: String = "value"
var optional: String? = null

val length = optional?.length       // safe call; result is Int?
val fallback = optional ?: "empty"  // Elvis operator
```

Java reference types may contain `null` unless constrained by convention or
annotations. Java values seen from Kotlin may become *platform types*, for
which Kotlin cannot fully guarantee null-safety. This is especially important
when reading Android libraries written in Java.

### 2. Expressions replace some statements

Kotlin `if`, `when`, and `try` can produce values:

```kotlin
val label = if (score >= 50) "pass" else "fail"

val message = when (status) {
    Status.RUNNING -> "working"
    Status.SUCCESS -> "done"
    else -> "waiting"
}
```

### 3. Data classes generate value-object methods

```kotlin
data class User(val id: Long, val name: String)
```

This supplies value-oriented `equals`, `hashCode`, `toString`, copying, and
component functions. Understanding Java's `Object` contracts explains why this
feature matters.

### 4. Top-level and extension functions

Kotlin permits functions outside classes and can make a function callable with
receiver syntax:

```kotlin
fun String.initial(): Char = first()
```

An extension does not truly insert a virtual method into `String`; it is
resolved statically. Do not confuse it with Java overriding.

### 5. No checked-exception requirement

Kotlin can throw and catch exceptions, but the compiler does not force callers
to catch or declare checked exceptions. Java's exception hierarchy remains
useful for understanding library behavior and Java interoperability.

### 6. Coroutines are not ordinary Java threads

Kotlin coroutines provide structured, suspendable concurrency. Core Java thread
knowledge helps with race conditions and thread confinement, but `suspend` does
not mean “start a new thread.” Learn coroutines as a separate model after basic
Kotlin syntax.

## Reading a React Native Android module

Current React Native Native Modules/TurboModules use a typed JS/TS specification
and Android implementations written in Java or Kotlin. When opening native-side
code, read it in this order:

1. **Package and imports:** identify Android, React Native, project, and Kotlin
   coroutine dependencies.
2. **Superclass/interfaces:** determine the contract the module must satisfy.
3. **Constructor parameters:** locate the application/context dependencies.
4. **Annotations and overrides:** find exported or framework lifecycle methods.
5. **JS boundary types:** locate values, promises/callbacks, maps, and arrays
   crossing between runtimes.
6. **Threading:** identify whether work touches UI, JS, native-module, or worker
   execution.
7. **Nullability and platform types:** inspect `?`, `?.`, `?:`, `!!`, and values
   coming from Java APIs.
8. **Resource/lifecycle ownership:** check listeners, activities, contexts, and
   cleanup.

Your TypeScript experience helps with the JS specification. Core Java supplies
the class/interface/runtime model. Kotlin then becomes a smaller, focused
language bridge rather than a fresh start from zero.

## What Java will not teach you automatically

Before editing production Kotlin, deliberately learn:

- nullable vs non-null types and platform types;
- `val`/`var`, properties, primary/secondary constructors;
- `open`, `override`, and sealed/data classes;
- `object` declarations and companion objects;
- function types, scope functions, and extension functions;
- read-only vs mutable Kotlin collection interfaces;
- smart casts and `when`;
- coroutines, dispatchers, structured concurrency, and cancellation; and
- Gradle Kotlin DSL at a reading level.

That is a much shorter follow-on curriculum once Core Java is solid.

