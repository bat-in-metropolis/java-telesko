# Review of the current workspace

## Status

All current sources compile with JDK 17:

```bash
javac Hello.java tools/calcs/*.java tools/jar.java
```

The repository is useful as a chronological scratchpad. `Hello.java` contains
many course experiments, while `tools.calcs` demonstrates packages and
multilevel inheritance.

## What is already good

- You typed variations instead of keeping only the instructor's final example.
- The byte overflow and decimal-to-integer experiments probe behavior directly.
- Both indexed and enhanced loops are represented.
- `Human` demonstrates private fields, accessors, overloaded constructors,
  static members, and `this`.
- `Calc → AdvCalc → VeryAdvCalc` makes multilevel inheritance concrete.
- `Developer` depends on `Computer`, demonstrating useful polymorphism.
- `LaptopWithPrice` correctly demonstrates that enums can carry behavior/state.
- `@Override` appears in code, allowing signature verification.

## Corrections and cautions

### 1. The runnable program currently teaches only “Hello World”

Nearly every experiment inside `main` is commented. That preserves history but
makes retrieval practice hard. New exercises should be separate small classes
with runnable `main` methods instead of repeatedly commenting/uncommenting a
562-line file.

### 2. `jar` should be `Jar` (and preferably a descriptive name)

Java class names conventionally use UpperCamelCase. `jar` also looks like the
JAR archive/tool concept. A name such as `AccessModifierDemo` would communicate
the example's intent.

### 3. `tools.jar.main` is not a standard entry point

It is currently:

```java
public static void main()
```

For `java tools.jar` to launch it, use:

```java
public static void main(String[] args)
```

It compiles today; it simply is not recognized as the normal launcher entry
point.

### 4. Partial `Human` constructors leave other fields at language defaults

`Human(int age)` sets `age` but leaves `name == null`; it does not reuse the
values assigned by `Human()`. Likewise, `Human(String name)` leaves `age == 0`.
If the intended defaults are `43` and `"Aflatoon"`, delegate explicitly with
`this(...)` or use field initializers.

### 5. Unused imports and `throws`

The active `Hello.main` does not need wildcard imports or
`throws ClassNotFoundException`. They remain from commented examples. This is
fine in a scratch file, but production code should remove unused declarations.

### 6. The access-modifier example is harder to read than necessary

`Score` inherits a primitive field named `marks`, then declares another field
also named `marks` whose type is `Marks`. The expression `marks.marks` compiles
but mixes field hiding and protected access. Use distinct names when the goal is
to learn one rule at a time.

### 7. `divide` correctly rejects zero but exception handling is ahead

Throwing `ArithmeticException` is reasonable. Catching, custom exceptions, and
checked-vs-unchecked distinctions begin after this checkpoint, so treat this as
a preview.

## Recommended source structure from now on

Keep `Hello.java` as the historical scratchpad. Put new work in one file or
package per concept:

```text
practice/
  basics/
  oop/
  lambdas/
  checkpoint/
```

Use descriptive classes such as `CastingDemo`, `PolymorphismDemo`, and
`DiscountPolicyDemo`. Once Maven or Gradle appears in the course, move toward
the conventional `src/main/java` and `src/test/java` layout.

