# Telusko Java learning log

This repository is a local learning workspace for Telusko's
[Complete Java Development: Spring Boot, Microservices, Spring AI](https://www.youtube.com/watch?v=q6z_UCBM5Ek).

## Current checkpoint

- Watched through: **09:00:00**
- Position in the full 63-hour compilation: about **14%**
- Position in the Core Java sequence: early **lambda expressions**
- Next new subject: lambda returns, interface types, then exceptions
- Local JDK: **OpenJDK 17.0.13 LTS**
- Verification: the current Java sources compile successfully
- Primary goal: finish Core Java quickly, then run one deep gap analysis
- Longer-term direction: full-stack development and reading Android/Kotlin code

The timestamp list originally supplied for this repository is not the video's
real chapter sequence. At 09:00:00, the course is teaching lambdas—not
encapsulation. The corrected checkpoint is in
[notes/00-checkpoint-map.md](notes/00-checkpoint-map.md).

## Study material

Read these in order:

1. [Checkpoint and mastery map](notes/00-checkpoint-map.md)
2. [Java foundations](notes/01-java-foundations.md)
3. [Object-oriented Java](notes/02-object-oriented-java.md)
4. [Abstraction through lambdas](notes/03-abstraction-to-lambdas.md)
5. [Java for a JS/TS developer](notes/04-js-to-java-bridge.md)
6. [Review of the current code](notes/05-current-code-review.md)
7. [Study system and next checkpoint](notes/06-study-system.md)
8. [Core Java fast-track](notes/07-core-java-fast-track.md)
9. [Java-to-Kotlin bridge](notes/08-java-to-kotlin-bridge.md)

Then work through [practice/README.md](practice/README.md) and take the
[9-hour diagnostic](quiz/09-hour-checkpoint.md) without running the snippets.
Use the [answer key](quiz/09-hour-answer-key.md) only after committing your
answers.

## How to use this repository

For each topic:

1. Watch 20–30 minutes.
2. Close the video and write five facts from memory.
3. Create a small runnable example without copying.
4. Predict its output before compiling it.
5. Explain one Java/TypeScript difference in your own words.
6. Commit the completed concept locally.

The examples now use the conventional `src/main/java` source layout. Compile
all of them into the ignored `out` directory:

```bash
mkdir -p out
javac -Xlint:all -d out $(find src/main/java -name '*.java')
java -cp out dev.manas.learning.AllDemos
```

Run one subject by using its fully qualified class name:

```bash
java -cp out dev.manas.learning.polymorphism.PolymorphismDemo
java -cp out dev.manas.learning.functional.LambdaDemo
```

Compiled `.class` files and `out/` are ignored by Git.

## Source-code map

```text
src/main/java/dev/manas/learning/
├── basics/          types, casting, control flow, methods
├── arrays/          primitive arrays, jagged arrays, object arrays
├── strings/         immutability, equality, StringBuilder
├── oop/             encapsulation and constructors
├── statics/         class initialization and shared state
├── inheritance/     multilevel calculator example
├── polymorphism/    interface-based dependency and dispatch
├── abstraction/     abstract class and concrete shapes
├── nested/          member inner and anonymous classes
├── enums/           fixed values with state and behavior
├── annotations/     compiler-checked metadata
└── functional/      functional interface and lambdas
```

## Definition of “learned”

A topic is not complete merely because its video was watched. For the fast
first pass, keep moving after you can explain the central idea and modify an
example. During the final Core Java audit, mark it solid only when you can:

- explain it without the instructor's wording;
- predict a short program's output;
- write a small example from a blank file;
- identify one common failure mode; and
- say when you would use it in an application.
