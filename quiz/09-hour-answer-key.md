# 9-hour diagnostic answer key

Open this only after answering
[09-hour-checkpoint.md](09-hour-checkpoint.md).

1. The JDK supplies development tools; `javac` compiles source to bytecode;
   bytecode is the platform-neutral class instruction format; the JVM loads,
   verifies, and executes it.
2. `byte`, `short`, `int`, `long`, `float`, `double`, `char`, `boolean`.
   `String` is a class/reference type whose instances are objects.
3. `2`, then `2.5`. The first operation has two `int` operands. The second
   promotes `a` because `b` is `double`.
4. Every argument value is copied. For an object, the copied value is a
   reference. The method can mutate the same object but cannot reassign the
   caller's variable.
5. The variable stores a reference (or `null`); array creation allocates the
   fixed-length object containing its components.
6. Encapsulation protects invariants and exposes intentional operations.
   Automatic accessors may expose mutation without protecting anything.
7. Only when the class declares no constructor at all, subject to superclass
   constructor accessibility.
8. Overloading means same name/different parameter lists and is resolved at
   compile time. Overriding replaces inherited instance behavior and dispatches
   at runtime using the actual object type.
9. Declared: `Computer`; actual: `Laptop`. The declared type controls accessible
   members; the actual type chooses an overridden method implementation.
10. Multiple class inheritance creates ambiguity around inherited state and
    implementation. Interfaces allow multiple contracts; any conflicting
    default behavior must be resolved explicitly.
11. `==` compares object identity. Use `equals` for ordinary string content.
12. It can be appended to because the object remains mutable. The variable
    cannot be assigned another builder because the reference is final.
13. Abstract class: a related family sharing state/implementation. Interface:
    a capability implemented by potentially unrelated classes.
14. Interface abstract methods are public; an override cannot reduce inherited
    access.
15. An enum restricts values at compile time and supports fields, constructors,
    methods, identity comparison, and exhaustive discrete branching.
16. It changes nothing at runtime. It asks the compiler to verify the intended
    override and catches signature errors.
17. An interface with exactly one abstract method, usable as a lambda target.
18. `Operation multiply = (a, b) -> a * b;`
19. The target type `Operation` supplies the single abstract method signature.
20. Good examples: interface-based polymorphism and constructor dependencies
    support DI; annotations and runtime class metadata support annotation-driven
    configuration. Encapsulation and abstractions also help.

