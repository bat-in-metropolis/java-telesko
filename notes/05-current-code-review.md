# Source restructuring and code review

## What changed

The original repository was a useful chronological scratchpad, but nearly every
experiment lived as commented code inside a 562-line `Hello.java`. It has been
replaced by a conventional source tree:

```text
src/main/java/dev/manas/learning/
```

Each concept now has a descriptive package and a small runnable demo. Supporting
domain types—such as `Human`, `Student`, `Computer`, and `Shape`—have their own
files when that separation improves the example.

The original scratchpad and calculator files were already tracked by Git, so
their exact content remains recoverable from the previous commit. No remote
push or new commit was performed.

## Why this structure is better

### 1. Every example is executable

The old active program printed only `Hello, World!`; learning a topic required
finding and uncommenting a block. Now every `*Demo` has a standard
`main(String[] args)` and can be run independently.

### 2. Package names teach architecture

Folders are not cosmetic. The package declaration gives a class its fully
qualified name:

```text
dev.manas.learning.polymorphism.PolymorphismDemo
```

This reinforces how Java organizes names and access—knowledge that transfers to
Spring packages and Android/Kotlin projects.

### 3. Examples isolate one primary idea

`TypesAndCastingDemo` focuses on numeric behavior. `PolymorphismDemo` focuses on
declared versus actual types. `LambdaDemo` places an anonymous implementation
beside equivalent lambda forms. The examples can still combine prerequisites,
but each has one reason to exist.

### 4. Names follow Java conventions

Classes use UpperCamelCase, methods and variables use lowerCamelCase, constants
use UPPER_SNAKE_CASE, and package components are lowercase. The ambiguous
lowercase class `jar` no longer competes with Java's JAR terminology.

### 5. Compilation output is separated

`javac -d out` writes bytecode under `out/` instead of placing `.class` files
beside source. That directory is ignored by Git.

## Important corrections preserved in the new examples

### Constructor chaining

The original single-argument `Human` constructors left the other field at
`null` or `0`; they did not reuse the defaults in `Human()`. The new constructors
delegate to the complete constructor with `this(...)`, giving every valid
object deliberate initial state.

### Encapsulation

`Human` keeps fields private and validates mutations. This demonstrates that
encapsulation protects invariants rather than merely wrapping fields in getters
and setters.

### Polymorphic dependency

`Developer` accepts a `Computer` instead of constructing `Laptop` or `Desktop`.
This is a small but genuine example of depending on an abstraction—the same
principle that later makes constructor injection useful in Spring.

### Enum immutability

`LaptopModel` stores price data in a final field and exposes no setter. Enum
constants model fixed configuration, so mutable prices in the original example
would make their meaning unstable across the whole process.

### Lambda checkpoint

The original code had reached the lambda lesson but did not contain a runnable
lambda. `Operation` and `LambdaDemo` now show:

- a functional interface;
- an anonymous-class implementation;
- an expression lambda; and
- a block lambda with an explicit return.

## Build and run

From the repository root:

```bash
mkdir -p out
javac -Xlint:all -d out $(find src/main/java -name '*.java')
java -cp out dev.manas.learning.AllDemos
```

The `-Xlint:all` option asks the compiler for additional warnings. The current
source compiles cleanly under JDK 17 with that option.

To run one concept:

```bash
java -cp out dev.manas.learning.functional.LambdaDemo
```

## How to add the next topic

When the course reaches exceptions, create a package such as:

```text
src/main/java/dev/manas/learning/exceptions/
```

Use separate demos for exception mechanics, custom exceptions, and
try-with-resources. Avoid turning a new `main` method into another permanent
commented notebook. If an experiment becomes obsolete, Git already preserves
its history.

