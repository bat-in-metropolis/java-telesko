# Abstraction, interfaces, enums, annotations, and lambdas

## 1. Abstract classes

An abstract class cannot be instantiated. It can combine shared state,
implemented behavior, constructors, and abstract methods.

```java
abstract class Shape {
    abstract double area();

    void describe() {
        System.out.println("Area: " + area());
    }
}
```

A concrete subclass must implement inherited abstract methods.

Use an abstract class when related implementations genuinely share state or
base behavior. Do not use inheritance only to save a few lines.

## 2. Interfaces

An interface defines a capability/contract that multiple unrelated classes can
implement.

```java
interface Computer {
    void code();
}

class Laptop implements Computer {
    @Override
    public void code() {
        System.out.println("Code on battery");
    }
}
```

Important rules at this checkpoint:

- A class can implement multiple interfaces.
- An interface can extend multiple interfaces.
- Interface fields are implicitly `public static final` constants.
- An ordinary interface method without a body is implicitly `public abstract`.
- An implementation must make that method `public`; it cannot reduce access.

Modern interfaces can also contain `default`, `static`, and private helper
methods, but their purpose remains defining a contract.

### Abstract class or interface?

| Need | Prefer |
| --- | --- |
| shared instance state or protected implementation | abstract class |
| capability shared by otherwise unrelated types | interface |
| multiple type contracts | interfaces |
| one controlled class family with common code | abstract class |

## 3. Inner and anonymous classes

An inner class is declared within another class. A non-static inner object is
associated with an outer object and can access its members.

An anonymous class creates a one-off implementation:

```java
Computer temporary = new Computer() {
    @Override
    public void code() {
        System.out.println("Temporary implementation");
    }
};
```

For a one-method interface, a lambda is usually shorter. Anonymous classes are
still useful when implementing multiple methods, adding fields, or needing a
distinct anonymous object body.

## 4. Enums

Enums model a closed, type-safe set of values:

```java
enum Status {
    PENDING, RUNNING, SUCCESS, FAILED
}
```

This is safer than arbitrary strings because the compiler knows the allowed
values. Enum constants are objects. An enum may have fields, constructors, and
methods:

```java
enum Plan {
    FREE(0), PRO(999);

    private final int monthlyPrice;

    Plan(int monthlyPrice) {
        this.monthlyPrice = monthlyPrice;
    }

    int monthlyPrice() {
        return monthlyPrice;
    }
}
```

Use `==` for enum constant comparison. It is safe because each constant is a
single defined instance.

## 5. Annotations

Annotations are metadata consumed by the compiler, tools, or frameworks. They
are not ordinary method calls.

```java
@Override
public void code() { }
```

`@Override` asks the compiler to verify that a method really overrides or
implements another method. Later, Spring uses annotations such as
`@RestController` and `@Service` to declare application structure and behavior.
Understanding annotations now will remove much of Spring's apparent magic.

## 6. Functional interfaces

A functional interface has exactly one abstract method. It may still inherit
`Object` methods or define default/static methods.

```java
@FunctionalInterface
interface Operation {
    int apply(int left, int right);
}
```

`@FunctionalInterface` is optional but valuable: the compiler prevents someone
from accidentally adding a second abstract method.

## 7. Lambda expressions

A lambda supplies the implementation of a functional interface's one abstract
method:

```java
Operation add = (left, right) -> left + right;
int result = add.apply(2, 3);
```

Equivalent anonymous-class idea:

```java
Operation add = new Operation() {
    @Override
    public int apply(int left, int right) {
        return left + right;
    }
};
```

Lambda forms:

```java
() -> System.out.println("run")
value -> value * 2
(a, b) -> a + b
(a, b) -> {
    int sum = a + b;
    return sum;
}
```

A lambda is not a free-floating JS function value. It needs a target functional
interface type so Java knows the parameter and return types.

At exactly 09:00:00, this concept has only just begun. Do not expect fluency yet;
write two examples before moving into exceptions.

