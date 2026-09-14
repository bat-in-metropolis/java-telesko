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

Compile and run the current scratch program from the repository root:

```bash
javac Hello.java tools/calcs/*.java tools/jar.java
java Hello
```

Compiled `.class` files are already ignored by Git.

## Definition of “learned”

A topic is not complete merely because its video was watched. Mark it learned
when you can:

- explain it without the instructor's wording;
- predict a short program's output;
- write a small example from a blank file;
- identify one common failure mode; and
- say when you would use it in an application.

