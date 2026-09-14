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

The existing code provides evidence that you have practiced:

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

The code does not yet show a lambda expression, an explicit functional
interface, `equals`/`hashCode` implementations, or a downcast example. These
are the best immediate retrieval-practice targets.

## Mastery tracker

Use these meanings:

- **Seen** — recognize the syntax.
- **Usable** — can write it with documentation.
- **Solid** — can explain, predict, and write it unaided.

| Concept | Evidence now | Target |
| --- | --- | --- |
| Types, operators, control flow | several commented experiments | Solid |
| Methods and overloading | `Calculator.add`, constructors | Solid |
| Arrays and enhanced loop | primitive and `Student[]` examples | Solid |
| Strings and mutability | `String`/`StringBuffer` experiments | Solid |
| Encapsulation | `Human` private fields and accessors | Solid |
| Static members | `Human.species`, static block/method | Solid |
| Inheritance and `super` | calculator hierarchy, `E`/`F` | Solid |
| Overriding and polymorphism | `G`/`H`, `Computer` implementations | Usable → Solid |
| Access control/packages | `tools` and `tools.calcs` | Usable → Solid |
| Abstract class/interface | `K`/`L`, `Computer`, `M`, `O` | Usable → Solid |
| Enum/annotation | `Status`, `LaptopWithPrice`, `@Override` | Usable → Solid |
| Functional interface/lambda | no runnable example yet | Seen → Usable |

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

