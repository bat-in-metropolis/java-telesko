# 9-hour checkpoint and mastery map

## Corrected boundary

The supplied high-level JSON compresses and shifts the Core Java timestamps.
The detailed Telusko chapter sequence places the relevant topics here:

| Time | Topic |
| --- | --- |
| 00:00–02:51 | Setup, types, operators, conditions, and loops |
| 02:51–03:48 | Classes, objects, methods, overloading, stack/heap model |
| 03:48–04:35 | Arrays, multidimensional/jagged arrays, arrays of objects |
| 04:35–05:13 | `String`, mutability, `StringBuffer`, `StringBuilder`, `static` |
| 05:13–06:10 | Encapsulation, getters/setters, `this`, constructors, `super` |
| 06:10–07:04 | Inheritance, overriding, packages, access modifiers |
| 07:04–07:41 | Polymorphism, dynamic dispatch, `final`, `Object`, casting |
| 07:41–08:27 | Abstract classes, inner/anonymous classes, interfaces |
| 08:27–08:53 | Enums and annotations |
| 08:53–09:00 | Functional interfaces and the beginning of lambdas |

The next lesson continues lambda expressions at 09:02:51. Exceptions begin at
approximately 09:10:41. In other words, exception handling, input, threads,
collections, and streams are **not yet part of this checkpoint**.

## What the repository demonstrates

The restructured examples preserve and make runnable the concepts you had
practised in the original scratchpad:

- primitive arithmetic, casts, operators, and loops;
- methods and method calls;
- arrays, arrays of objects, and enhanced `for` loops;
- `String` and `StringBuffer` operations;
- encapsulation and overloaded constructors;
- static fields, methods, and blocks;
- single and multilevel inheritance;
- overriding and runtime polymorphism;
- abstract classes, interfaces, and anonymous classes;
- packages and access modifiers; and
- enums with fields, constructors, methods, and `switch`.

The new `functional` package closes the earlier lambda gap with equivalent
anonymous-class, expression-lambda, and block-lambda implementations.
`equals`/`hashCode` implementation and safe downcasting remain useful future
retrieval-practice targets.

## Mastery tracker

Use these meanings:

- **Seen** — recognize the syntax.
- **Usable** — can write it with documentation.
- **Solid** — can explain, predict, and write it unaided.

| Concept | Evidence now | Target |
| --- | --- | --- |
| Types, operators, control flow | runnable `basics` examples | Solid |
| Methods and overloading | `MethodsDemo`, constructors | Solid |
| Arrays and enhanced loop | `ArraysDemo` and `Student[]` | Solid |
| Strings and mutability | `StringsDemo` | Solid |
| Encapsulation | `Human` validates private fields | Solid |
| Static members | `PopulationCounter` | Solid |
| Inheritance and `super` | calculator and shape hierarchies | Solid |
| Overriding and polymorphism | `Computer`, `Developer`, shapes | Usable → Solid |
| Access control/packages | package-separated source tree | Usable → Solid |
| Abstract class/interface | `Shape`, `Computer`, `Operation` | Usable → Solid |
| Enum/annotation | `Status`, `LaptopModel`, `@Override` | Usable → Solid |
| Functional interface/lambda | three runnable implementations | Seen → Usable |

## Dependencies between ideas

```text
values + control flow
        ↓
methods → classes/objects → encapsulation
                         ↓
              inheritance + overriding
                         ↓
                  polymorphism
                         ↓
        abstract classes + interfaces
                         ↓
             functional interfaces
                         ↓
                      lambdas
```

If polymorphism feels vague, lambdas and Spring dependency injection will feel
like magic later. Spend review time on the *declared type vs actual object*
distinction before advancing.
