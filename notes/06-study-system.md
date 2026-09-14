# Study system and next checkpoint

## The watch–recall–build loop

Use this 45–60 minute cycle:

1. **Watch (20–25 min):** no coding unless the instructor asks you to predict.
2. **Recall (5 min):** close the video and write the ideas from memory.
3. **Build (15–20 min):** implement a different example from a blank file.
4. **Predict (5 min):** write expected output before running it.
5. **Review (5 min):** explain why your mistakes happened.

Typing along feels productive because the code works, but it tests copying.
Blank-file recall tests whether the mental model is available when you need it.

## Spaced review

Revisit each topic:

- Day 0: initial exercise;
- Day 1: explain and rewrite the core example;
- Day 3: one output-prediction question;
- Day 7: use it inside a small program;
- Day 14: mix it with a newer topic.

Do not rewatch immediately unless you can name the exact gap. First attempt to
retrieve; the effort is part of learning.

## Recommended next checkpoint: 10:15:25

Stop just before threads. That block covers:

- lambda expressions with returns and types of interfaces;
- what exceptions are;
- `try`, `catch`, multiple catches, and hierarchy;
- `throw`, `throws`, and custom exceptions;
- `BufferedReader`, `Scanner`, and user input; and
- try-with-resources.

Before watching it, finish the lambda drill and diagnostic in this repository.
After watching it, build one command-line input program that validates a value
and closes its resource correctly.

## Weekly balance for a working frontend developer

For five study sessions per week:

| Session | Focus |
| --- | --- |
| 1 | new video + tiny exercise |
| 2 | new video + tiny exercise |
| 3 | no video; retrieval and quiz |
| 4 | new video + tiny exercise |
| 5 | integrate the week's concepts into one mini-project |

Aim for consistency over marathon viewing. A 63-hour video can represent well
over 150 hours of real learning when recall and projects are included.

## Git rhythm

Commit one coherent learning outcome, not every keystroke. Examples:

```text
notes(java): organize concepts through the 9-hour checkpoint
practice(java): add polymorphism and lambda drills
refactor(java): split course experiments by concept
```

No remote push is needed for any of this workflow.

