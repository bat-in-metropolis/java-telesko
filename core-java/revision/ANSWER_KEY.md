# Core Java diagnostic answer key

Open this only after answering [README.md](README.md).

1. The JDK provides development tools; `javac` compiles source into bytecode;
   bytecode is the platform-neutral class format; the JVM loads and executes it.
2. `byte`, `short`, `int`, `long`, `float`, `double`, `char`, and `boolean`.
   `String` is a class/reference type.
3. `5 / 2` uses integer operands and produces `2`; `5 / 2.0` promotes the
   operation to floating point and produces `2.5`.
4. Every argument value is copied. For an object, that copied value is a
   reference, so caller and method can refer to the same mutable object.
5. Encapsulation protects invariants through intentional operations. Blind
   setters can expose every field without protecting anything.
6. Only when the class declares no constructor, and only if the required
   superclass constructor is accessible.
7. Overloading: same name, different parameters, compile-time selection.
   Overriding: inherited instance behavior replaced, runtime dispatch.
8. Declared type: `Computer`; actual type: `Laptop`. The declared type controls
   callable members; actual type chooses overridden implementation.
9. `==` compares object identity. `String.equals()` compares contents.
10. Equal objects must produce equal hash codes so hash-based collections can
    place and find them consistently.
11. Use an interface for a capability/contract potentially shared by unrelated
    classes; use an abstract class when a related family shares state or base
    implementation.
12. It has exactly one abstract method. Default/static methods do not invalidate
    functional-interface status.
13. `throw` signals an exception now; `throws` declares possible propagation in
    a method signature.
14. It closes `AutoCloseable` resources automatically on success or failure and
    handles cleanup exceptions more reliably than handwritten `finally` code.
15. `List`: ordered and duplicates allowed. `Set`: unique values. `Map`:
    key-value associations and not a subtype of `Collection`.
16. `Comparable` defines a type's natural ordering; `Comparator` supplies an
    external/alternative ordering.
17. Intermediate operations describe work but normally do not execute until a
    terminal operation requests a result.
18. A terminal operation consumes the stream; obtain a new stream from the
    source for another pipeline.
19. Useful for an intentionally optional return value. Often overused as fields,
    parameters, or wrappers around every possibly-null expression.
20. `String::toUpperCase`.
21. Two or more threads access shared mutable state and the result depends on
    timing/interleaving.
22. It makes the counter's read-modify-write increment mutually exclusive for
    threads using the same counter monitor.
23. Examples: interfaces, polymorphism, constructors, annotations, reflection,
    and object lifecycles.
24. Examples include `var`, records, sealed classes, `String.isBlank()`,
    `Stream.toList()`, and modern pattern matching.

