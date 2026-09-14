# Core Java fast-track for a future full-stack developer

## Purpose

The immediate goal is not encyclopedic Java knowledge. It is to acquire a
coherent language model quickly enough to:

1. read and write ordinary Java confidently;
2. understand the mechanisms Spring Boot builds on;
3. work with persistence code after learning SQL;
4. read JVM-side Android and React Native integration code; and
5. expose gaps through one serious Core Java assessment.

“Fast” should mean removing detours and duplicate practice—not skipping the
concepts on which everything else depends.

## Priority model

### P0 — must be usable before Spring Boot

- primitive and reference types, conversions, operators, control flow;
- methods, overloading, parameter passing, arrays, and strings;
- classes, constructors, encapsulation, packages, and access control;
- inheritance, composition, interfaces, polymorphism, and `Object` contracts;
- exceptions and try-with-resources;
- generics and the Collections Framework;
- functional interfaces, lambdas, method references, and streams;
- file/input-output fundamentals;
- annotations at a usage level;
- threading concepts and basic concurrency safety;
- JUnit fundamentals; and
- a Java build tool and conventional project structure.

### P1 — learn enough to recognize, deepen when a project needs it

- reflection and custom annotations;
- deeper JVM memory/class-loading behavior;
- executors, futures, locks, and concurrent collections;
- advanced generics and variance;
- date/time API details;
- serialization formats and network I/O; and
- modern Java features such as records, sealed classes, and newer `switch`.

### Defer without guilt

- Swing/AWT desktop UI;
- deep JVM tuning and garbage-collector selection;
- low-level lock-free algorithms;
- Java module-system expertise;
- competitive-programming-specific tricks; and
- memorizing every collection implementation or Stream operation.

Servlet/JSP is useful historical context for Spring MVC, but it does not need
to become a major project before starting Spring Boot. Data structures and
algorithms matter for interviews and engineering judgment, but they are a
parallel track rather than a prerequisite for building a Spring API.

## Course route from the current point

### Phase 1 — finish the current OOP/language block

Current position: lambda expressions at roughly 09:00:00.

Continue through:

- lambda returns and interface categories;
- exception hierarchy, `try`/`catch`, `throw`, `throws`;
- custom exceptions;
- user input and try-with-resources;
- threads, `Runnable`, race conditions, and thread states;
- collections (`List`, `Set`, `Map`, ordering/comparison); and
- Stream API operations.

Do one small modification per topic. Avoid building a large application while
the language model is still incomplete.

### Phase 2 — close essential gaps the video may treat briefly

Before declaring Core Java complete, verify these explicitly:

- generics: type parameters, invariance, wildcards at a basic level;
- value objects: `equals`, `hashCode`, `toString`;
- composition vs inheritance;
- immutability and defensive copies;
- `Optional` as a return-value tool, not a replacement for every null;
- basic file I/O with `Path`/`Files`;
- `java.time` basics;
- method references;
- basic executor-based concurrency; and
- records as concise immutable data carriers.

Do not automatically watch another huge course for these. Start with the
official Java documentation and one focused runnable example per gap.

### Phase 3 — testing and building

Learn enough JUnit to write:

- a normal successful assertion;
- boundary and invalid-input cases;
- an expected-exception assertion; and
- parameterized tests at a recognition level.

Then learn one build tool. For the Spring path, Maven is a reasonable first
choice because Spring Initializr generates a complete Maven project and its
dependency model is explicit. Gradle can follow when Android/Kotlin work makes
it relevant.

### Phase 4 — comprehensive Core Java audit

Take one assessment with five parts:

1. **Mental model:** explain 25 concepts without code.
2. **Output prediction:** 20 snippets covering references, overloads, dispatch,
   exceptions, generics, collections, streams, and concurrency.
3. **Compiler diagnosis:** repair 10 programs that do not compile.
4. **Blank-file implementation:** build a small domain model and processing
   pipeline without the course open.
5. **Debugging:** fix logical, equality, null, mutation, and concurrency bugs.

Classify every miss:

| Gap type | Treatment |
| --- | --- |
| forgotten syntax | one flash example; move on |
| wrong mental model | textbook review + three predictions |
| cannot design with concept | one small implementation |
| API lookup needed | normal; practise documentation navigation |
| concurrency misunderstanding | slow down; correctness matters more than speed |

After repairing the mental-model and design gaps, begin Spring Boot while
continuing minor syntax/API repair in parallel.

## What “Spring-ready” actually means

You do not need to know every Java API. You should be able to read this shape
without treating it as magic:

```java
public final class OrderService {
    private final OrderRepository repository;

    public OrderService(OrderRepository repository) {
        this.repository = repository;
    }

    public Order place(OrderRequest request) {
        Order order = new Order(request.customerId());
        return repository.save(order);
    }
}
```

You should recognize:

- the class and immutable dependency field;
- constructor injection;
- depending on a repository contract;
- parameter and return types;
- object construction; and
- method delegation.

Spring later creates and wires these objects, but ordinary Java rules still
govern the code.

## Full-stack sequencing after the audit

Use three coordinated tracks rather than waiting for complete mastery of one:

```text
Core Java audit repaired
        ├── Spring Boot: HTTP, controllers, services, validation
        ├── SQL: queries, joins, constraints, transactions, indexes
        └── Integration: JPA, migrations, API tests, React client
```

SQL should be learned before relying heavily on JPA abstractions. Otherwise it
is easy to generate queries and transactions without understanding their cost
or correctness.

