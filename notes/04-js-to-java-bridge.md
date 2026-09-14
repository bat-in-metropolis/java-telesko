# Java through a JavaScript/TypeScript lens

Use your frontend experience as leverage, but do not assume syntactic similarity
means identical behavior.

| JS/TS idea | Closest Java idea | Crucial difference |
| --- | --- | --- |
| `let n: number` | `int`, `long`, `double`, etc. | Java numeric types have distinct ranges/behavior |
| object literal | class instance | Java usually declares a nominal type first |
| `const` binding | `final` reference | neither makes a referenced object deeply immutable |
| TS `private` | Java `private` | Java access is enforced by the language/runtime model; JS `#private` is a different feature |
| duck typing | interface implementation | Java is nominal: a class declares `implements` |
| function callback | functional interface + lambda | lambda requires a target interface type |
| array | array / `ArrayList` | Java arrays are fixed-length and homogeneous |
| `===` | `==` | for Java objects, `==` checks identity, not content |
| string interpolation | concatenation / formatting | no JS template literals in Java 17 |
| `undefined` and `null` | `null` | no `undefined`; primitives cannot be `null` |
| prototype inheritance | class inheritance | Java classes have one direct superclass |
| TS overload signatures | Java overloads | Java overloads are real callable methods in bytecode |
| thrown JS value | `Throwable` hierarchy | Java distinguishes checked and unchecked exceptions |
| module import | package/import | `import` shortens type names; it does not execute a module |

## High-risk transfer mistakes

### 1. Treating `==` like `===`

```java
new String("a") == new String("a")       // false: different objects
new String("a").equals(new String("a")) // true: equal contents
```

### 2. Expecting truthiness

```java
if (count) { } // does not compile when count is int
```

Java conditions require a `boolean`. There is no truthy/falsy conversion for
numbers, strings, objects, or `null`.

### 3. Expecting flexible object shape

A variable declared `Computer` exposes the `Computer` contract even when it
refers to a `Laptop`. Java does not let callers use extra `Laptop` methods until
the reference is proven/cast to `Laptop`.

### 4. Thinking imports load code

```java
import tools.calcs.Calc;
```

This lets the source say `Calc` instead of `tools.calcs.Calc`. Class loading and
initialization are separate runtime concepts.

### 5. Treating every class as a singleton module

Static members belong to a class, but most domain behavior should live on
objects passed through explicit dependencies. This maps better to React's
preference for explicit data flow than to global mutable module state.

## Familiar frontend analogies

- A Java interface resembles the public props/behavior contract of a component,
  except implementation is nominal and available at runtime in a different way.
- Encapsulation resembles keeping state transitions behind reducer actions
  rather than allowing arbitrary mutation.
- Dynamic dispatch resembles calling a method through a stable interface while
  swapping concrete adapters.
- A functional interface is a named slot for one behavior, similar to a typed
  callback prop.
- Spring dependency injection will supply implementations to constructors much
  like an application composition root wires services and adapters together.

## Better questions to ask while learning

Instead of “what is the Java syntax for this JS code?”, ask:

1. Who owns this state?
2. Is this a primitive value or an object reference?
3. What is the declared type, and what is the runtime type?
4. Is equality about identity or value?
5. Is this shared class state or per-object state?
6. What contract should the caller depend on?

