# Study system and next checkpoint

## The fast watch–recall–build loop

Because the current goal is rapid Core Java coverage followed by one detailed
test, use this 40–50 minute cycle:

1. **Watch (25–30 min):** focus on the model, not perfect notes.
2. **Recall (3 min):** close the video and name the central ideas.
3. **Modify (10 min):** change or extend a relevant runnable example.
4. **Predict (3 min):** predict the changed output before running it.
5. **Record gaps (2 min):** add uncertainty to a gap list; do not derail the
   first pass unless the next topic depends on it.

Typing along feels productive because the code works, but it mostly tests
copying. The final audit will use blank-file recall; this first pass uses small
modifications so forward momentum stays high.

## Lightweight review during the fast pass

Do not build a large spaced-repetition system yet. Use two small reviews:

- At the start of a session, explain yesterday's most important idea in two
  minutes.
- At the end of each Core Java phase, run and modify one mixed example.

Record non-blocking uncertainty. Rewatch only when the gap prevents the current
lesson from making sense. The comprehensive test comes after Core Java coverage.

## Recommended next checkpoint: 10:15:25

Stop just before threads. That block covers:

- lambda expressions with returns and types of interfaces;
- what exceptions are;
- `try`, `catch`, multiple catches, and hierarchy;
- `throw`, `throws`, and custom exceptions;
- `BufferedReader`, `Scanner`, and user input; and
- try-with-resources.

Before watching it, run `LambdaDemo` and make one change without copying. After
watching it, build one command-line input program that validates a value and
closes its resource correctly. The 20-question diagnostic is optional now and
becomes part of the later comprehensive audit.

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
