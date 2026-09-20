# Java backend learning

This is my long-term, topic-oriented repository for learning the Java backend
stack used by the FMS-GPS project at work.

The goal is practical:

> Read, explain, debug, test, and safely change the existing Java + Spring Boot
> backend without relying on vibe coding.

The repository is organized by technology—not by a particular YouTube course.
The detailed priorities come from [learning-plan.md](learning-plan.md), which is
based on the real work codebase.

## Current checkpoint

```text
Core Java through Java 8: COMPLETE
Gradle:                     IN PROGRESS
Spring Core:                NOT STARTED
Spring Boot / REST:         NOT STARTED
```

## Learning progress

- [x] Java syntax, classes, objects, and OOP
- [x] Exceptions and try-with-resources
- [x] Basic multithreading
- [x] Collections: `List`, `Set`, and `Map`
- [x] Comparator and Comparable
- [x] Lambdas and functional interfaces
- [x] Streams, including parallel streams
- [x] Optional
- [x] Method and constructor references
- [ ] Gradle fundamentals — **currently learning**
- [ ] Spring Core and dependency injection
- [ ] Spring MVC and REST
- [ ] SQL and MySQL
- [ ] JPA and Hibernate
- [ ] JUnit 4 and Mockito
- [ ] Redis
- [ ] Kafka
- [ ] Docker and Kubernetes basics

## Where to go

| I want to revise… | Open… |
| --- | --- |
| Core Java overview | [core-java/README.md](core-java/README.md) |
| Inheritance or polymorphism | [core-java/inheritance-polymorphism](core-java/inheritance-polymorphism) |
| Interfaces or abstraction | [core-java/interfaces-abstraction](core-java/interfaces-abstraction) |
| Exceptions | [core-java/exceptions](core-java/exceptions) |
| Collections | [core-java/collections](core-java/collections) |
| Lambdas | [core-java/functional](core-java/functional) |
| Streams | [core-java/streams](core-java/streams) |
| Optional | [core-java/optional](core-java/optional) |
| Method references | [core-java/method-references](core-java/method-references) |
| Threads and synchronization | [core-java/multithreading](core-java/multithreading) |
| Gradle | [gradle/README.md](gradle/README.md) |
| Spring Core later | [spring/README.md](spring/README.md) |
| Spring Boot and REST later | [spring-boot/README.md](spring-boot/README.md) |
| SQL, JPA, testing, Redis, Kafka | [backend-notes/README.md](backend-notes/README.md) |

## Java versions: keep these separate

| Context | Java version |
| --- | --- |
| FMS-GPS work backend | **Java 8** |
| Current Gradle learning project | **Java 21** |

Core Java examples in this repository intentionally remain Java 8 compatible
where practical. Newer features such as `var`, records, sealed classes, pattern
matching, `String.isBlank()`, and `Stream.toList()` are unavailable in the Java
8 work project.

The Gradle sample intentionally targets Java 21 because that is what was chosen
during `gradle init`. It does not change the work backend's Java version.

## How to use the repository

Most Core Java folders contain one obvious `*Demo.java` with a `main` method.
Open that file and use the IDE's **Run** button. The examples intentionally do
not form one production application.

The Gradle sample is different: it is a real generated Gradle project, so run
its wrapper commands from inside that project. See [gradle/README.md](gradle/README.md).

For work-focused learning, use this loop:

```text
Learn one concept
  → find it in FMS-GPS
  → trace one real use
  → explain it without AI
  → make one small safe change or test
```
