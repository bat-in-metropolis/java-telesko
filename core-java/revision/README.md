# Core Java revision

Use this after the first Core Java pass. Do not judge progress only by whether
the video was watched.

## Quick diagnostic

Answer without running code. Give yourself 2 points for a correct explanation,
1 for an incomplete answer, and 0 for a guess.

1. What do the JDK, `javac`, bytecode, and JVM each do?
2. Name the eight primitive types. Why is `String` not one of them?
3. Why do `5 / 2` and `5 / 2.0` produce different results?
4. Explain pass-by-value when a method receives an object reference.
5. How is encapsulation different from blindly creating getters/setters?
6. When does Java supply a default no-argument constructor?
7. Explain overloading versus overriding.
8. For `Computer value = new Laptop()`, identify the declared and actual types.
9. What is wrong with using `==` for ordinary String content?
10. Why should `equals()` and `hashCode()` normally be overridden together?
11. When would you choose an interface over an abstract class?
12. What makes an interface functional?
13. What is the difference between `throw` and `throws`?
14. Why is try-with-resources preferable to manual cleanup?
15. Compare `List`, `Set`, and `Map`.
16. Compare `Comparable` and `Comparator`.
17. Why are Stream intermediate operations called lazy?
18. Why can a Stream not normally be reused?
19. When is `Optional<T>` useful, and when is it overused?
20. Rewrite `name -> name.toUpperCase()` as a method reference.
21. What is a race condition?
22. What does `synchronized` protect in the multithreading demo?
23. Name two Java features Spring dependency injection builds on.
24. Which common modern Java features cannot be used in a Java 8 codebase?

Check [ANSWER_KEY.md](ANSWER_KEY.md) only after committing your answers.

## Blank-file drills

1. Build an encapsulated `BankAccount` with meaningful operations.
2. Create `Shape`, `Circle`, and `Rectangle`, then call `area()` through a
   `Shape` reference.
3. Create an interface with two implementations and pass it into a service
   constructor.
4. Validate input with a custom exception and try-with-resources.
5. Store objects in a `List`, remove duplicates with a `Set`, and index them
   with a `Map`.
6. Sort the objects once with `Comparable` and once with `Comparator`.
7. Use a Stream to filter, transform, sort, and reduce the objects.
8. Return an `Optional` from a search method.
9. Replace suitable lambdas with method/constructor references.
10. Safely increment one counter from two threads and wait for both to finish.

## Final practical test

Build a small command-line order or shopping-cart application from a blank
folder. It should use:

- encapsulated domain objects;
- an interface with interchangeable implementations;
- enums;
- collections and generics;
- a custom exception;
- Stream transformations;
- Optional for one search result; and
- method references where they improve readability.

Then explain every design choice without the course or AI open. Any concept you
cannot explain becomes a focused repair task rather than a reason to restart
the whole course.

