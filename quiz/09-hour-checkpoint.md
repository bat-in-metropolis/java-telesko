# 9-hour Java diagnostic

Rules: do not run code, search the web, or open the answer key. Write an answer
and confidence from 1–5 for every question. A confident wrong answer is the most
valuable signal because it identifies a faulty mental model.

## Core model

1. What do the JDK, `javac`, bytecode, and JVM each do?
2. Name all eight primitive types. Why is `String` not one of them?
3. What prints, and why?

   ```java
   int a = 5;
   double b = 2;
   System.out.println(a / 2);
   System.out.println(a / b);
   ```

4. Explain Java's pass-by-value rule when a method receives an object.
5. What is the difference between an array variable and the array object?

## OOP

6. How is encapsulation different from blindly creating getters and setters?
7. When does Java generate a default no-argument constructor?
8. Explain overloading vs overriding, including when each is selected.
9. Given `Computer value = new Laptop()`, what are the declared and actual
   types? Which one controls callable members and which controls an overridden
   method body?
10. Why does Java allow multiple implemented interfaces but not multiple
    extended classes?
11. What is wrong with comparing ordinary string content using `==`?
12. If `final StringBuilder text = new StringBuilder()`, can `text` be appended
    to? Can `text` be assigned a different builder? Explain.

## Abstraction and modern Java

13. Give one case for an abstract class and one for an interface.
14. Why must an interface method implementation normally be `public`?
15. What can an enum do that a group of string constants cannot do as safely?
16. What does `@Override` change at runtime? What value does it provide?
17. Define a functional interface in one sentence.
18. Rewrite this anonymous implementation as a lambda:

    ```java
    Operation multiply = new Operation() {
        public int apply(int a, int b) {
            return a * b;
        }
    };
    ```

19. Why can Java infer the parameter and return types of that lambda?
20. Name two concepts from this quiz that will directly support Spring's
    dependency injection and annotation-driven programming.

## Scoring

Give yourself:

- 2 points: correct and you can explain why;
- 1 point: directionally right but incomplete;
- 0 points: wrong, guessed, or cannot explain.

Interpretation:

- **34–40:** proceed, while revisiting any low-confidence answer.
- **26–33:** proceed slowly and repeat the weak drills.
- **18–25:** spend two sessions on OOP/polymorphism before exceptions.
- **0–17:** pause the video and rebuild foundations from blank files.

The score is routing information, not a judgment. Send your answers and
confidence ratings for a personalized review.

