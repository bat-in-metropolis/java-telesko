# Practice through 09:00:00

Do these without using collections, streams, exception handling, or Spring.
Those topics are intentionally outside the checkpoint.

## Level 1: output prediction

Write your prediction before compiling.

### A. Numeric promotion

```java
byte a = 100;
byte b = 30;
int result = a + b;
System.out.println(result);
```

Then answer: why can `result` not be a `byte` without a cast?

### B. Integer division

```java
System.out.println(5 / 2);
System.out.println(5 / 2.0);
```

### C. Reference identity vs value equality

```java
String a = new String("java");
String b = new String("java");
System.out.println(a == b);
System.out.println(a.equals(b));
```

### D. Dynamic dispatch

```java
class Parent {
    void show() { System.out.println("parent"); }
}

class Child extends Parent {
    @Override
    void show() { System.out.println("child"); }
    void onlyChild() { System.out.println("extra"); }
}

Parent value = new Child();
value.show();
```

Which method runs? Why can `value.onlyChild()` not compile?

## Level 2: blank-file drills

1. Write `GradeCalculator` using methods, `if`/`switch`, and an enum `Grade`.
2. Write `TextStats` that counts vowels in a `String` using a loop.
3. Create a jagged `int[][]` and print the sum of every row.
4. Create an encapsulated `BankAccount` that rejects non-positive deposits.
5. Build `Shape`, `Circle`, and `Rectangle`; invoke `area()` polymorphically
   through a `Shape[]`.
6. Define a `NotificationSender` interface with email and console
   implementations. Pass the interface into a `SignupService` constructor.
7. Define a functional interface `Formatter` and implement it once with an
   anonymous class and once with a lambda.

For every drill, add a `main(String[] args)` that demonstrates at least two
cases. Do not copy the example in the notes; choose your own names and values.

## Level 3: checkpoint mini-project — shopping cart

Build a small command-line checkout using only concepts learned so far.

### Required types

- `Product`: private `name` and `priceInPaise`, validated by its constructor.
- `Cart`: owns a fixed-size `Product[]` and controls adding products.
- `DiscountPolicy`: functional interface with one method returning a discounted
  total.
- `PaymentMethod`: enum such as `CARD`, `UPI`, and `CASH`.
- `CheckoutService`: calculates the total and applies a `DiscountPolicy`.
- `CheckoutDemo`: contains `main` and prints several scenarios.

### Required demonstrations

- constructor chaining;
- encapsulation (no public mutable fields);
- an array of objects and enhanced loop;
- an interface used as a dependency;
- two discount lambdas;
- an enum used in `switch`;
- overriding `toString()` for useful output; and
- integer money representation (`paise`) to avoid floating-point surprises.

### Constraints

- No `ArrayList`, streams, exceptions, user input, database, or framework yet.
- Do not silently overwrite the cart when it is full; return a `boolean` from
  `add` for now.
- Predict the output for every scenario before execution.

### Done when

- the project compiles from a clean checkout;
- all required concepts appear for a reason;
- there are at least three checkout scenarios;
- you can explain declared vs actual type anywhere polymorphism appears; and
- you can replace the discount behavior without editing `CheckoutService`.

