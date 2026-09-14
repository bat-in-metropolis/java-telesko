# Object-oriented Java

## 1. Class, object, state, behavior

```java
class BankAccount {
    private String owner;
    private int balanceInPaise;

    BankAccount(String owner) {
        this.owner = owner;
    }

    void deposit(int amountInPaise) {
        if (amountInPaise > 0) {
            balanceInPaise += amountInPaise;
        }
    }

    int getBalanceInPaise() {
        return balanceInPaise;
    }
}
```

- The class defines possible state and behavior.
- `new BankAccount(...)` constructs an object.
- Each object has its own instance field values.
- Methods maintain the object's rules.

## 2. Encapsulation

Encapsulation is not “generate getters and setters for everything.” It means the
object controls access to its state so invalid states are harder to create.

```java
void setAge(int age) {
    if (age < 0) {
        return; // exception handling comes next in the course
    }
    this.age = age;
}
```

If callers should never change a value directly, keep the field `private`. If a
setter cannot enforce a meaningful rule and mutation is unnecessary, omit it.

## 3. Constructors, `this`, and `super`

A constructor initializes a new object. It has the class name and no return
type.

```java
class User {
    private String name;
    private int age;

    User(String name) {
        this(name, 0);
    }

    User(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
```

- `this.field` selects the current object's field.
- `this(...)` calls another constructor in the same class.
- `super(...)` calls a superclass constructor.
- A `this(...)` or `super(...)` constructor invocation must be first.
- If no constructor is declared, the compiler may provide a no-argument default
  constructor. Once any constructor is declared, that automatic constructor is
  no longer provided.

## 4. Inheritance and overriding

```java
class Calc {
    int add(int a, int b) { return a + b; }
}

class AdvancedCalc extends Calc {
    int multiply(int a, int b) { return a * b; }
}
```

Inheritance expresses an **is-a** relationship and reuses a type contract. A
class can extend one direct superclass. All classes ultimately derive from
`Object`.

Overriding supplies subclass behavior for an inherited instance method:

```java
class Desktop implements Computer {
    @Override
    public void code() {
        System.out.println("Compile faster");
    }
}
```

Use `@Override`: it makes the compiler catch misspellings or signature mistakes.
An override is selected at runtime based on the actual object's class.

### Overload vs override

| | Overload | Override |
| --- | --- | --- |
| Meaning | same name, different parameters | replace inherited behavior |
| Selection | compile time | runtime for instance methods |
| Inheritance required | no | yes |
| Parameters | must differ | same signature |

## 5. Polymorphism and dynamic dispatch

```java
Computer machine = new Laptop();
machine.code();
```

Two types matter:

- **Declared type**: `Computer`; controls what members the compiler permits.
- **Actual type**: `Laptop`; controls which overridden implementation runs.

This is the foundation of dependency injection. `Developer` can depend on the
`Computer` contract and work with a `Laptop` or `Desktop` without changing.

```java
class Developer {
    void build(Computer computer) {
        computer.code();
    }
}
```

## 6. Access control

| Modifier | Same class | Same package | Subclass in another package | Unrelated class in another package |
| --- | ---: | ---: | ---: | ---: |
| `private` | yes | no | no | no |
| package-private (no keyword) | yes | yes | no | no |
| `protected` | yes | yes | yes, through inheritance rules | no |
| `public` | yes | yes | yes | yes |

`protected` across packages is subtler than “subclasses can access it”: access
is tied to inheritance and the qualifying reference. Prefer `private` plus a
carefully designed API unless extension is intentional.

## 7. `Object`, equality, and identity

Every class inherits methods from `Object`, including:

- `toString()` — human-readable representation;
- `equals(Object)` — logical equality contract;
- `hashCode()` — hash-based collection contract; and
- `getClass()` — runtime class information.

Unless overridden, `equals` behaves like identity. If two distinct objects with
the same field values should be equal, override both `equals` and `hashCode`.
This will matter when using `HashSet` and `HashMap` later.

## 8. Upcasting and downcasting

```java
Computer computer = new Laptop(); // upcast; safe and implicit
Laptop laptop = (Laptop) computer; // downcast; checked at runtime
```

A cast changes what the compiler knows about a reference; it does not transform
the object. A wrong downcast throws `ClassCastException`.

```java
if (computer instanceof Laptop) {
    Laptop laptop = (Laptop) computer;
}
```

Frequent downcasting is often a design smell: the shared interface may be
missing the behavior the caller actually needs.

## 9. `final`

- final variable: assigned once.
- final method: cannot be overridden.
- final class: cannot be extended.

For a reference, `final` prevents reassignment; it does not make the referenced
object immutable. This is closer to JavaScript's `const` binding than to a deep
freeze.

