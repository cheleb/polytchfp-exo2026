# Functional Programming in Scala — Exercise Set Design

## 1. Overview

This document describes a self-contained exercise set for beginner Scala students
learning functional programming. The progression moves from basic Scala through
list algorithms, typeclasses built from scratch, and deep ZIO effects.

Each exercise is delivered as a stub Scala file plus a test suite (MUnit for
basic Scala, ZIO Test for effects). Students edit `src/main` and run
`sbt test`. Exercises are self-contained. No solutions are provided.

## 2. Tooling and environment

- Build tool: sbt, Scala 3.9.0
- IDE: local (VS Code with Metals, or IntelliJ)
- Basic Scala tests: MUnit (`org.scalameta" %% "munit" % "1.3.6" % Test`)
- Effects tests: ZIO Test (`dev.zio" %% "zio-test" % "2.1.26" % Test`,
  `dev.zio" %% "zio-test-sbt" % "2.1.26" % Test`)
- Runtime dependency for exercises: `dev.zio" %% "zio" % "2.1.26"`

## 3. Exercise plan

### Phase 1 — Basic Scala (MUnit)
1. Warm-up: values, types, methods, string interpolation
2. Control flow and pattern matching
3. Methods, recursion, tail recursion

### Phase 2 — Lists (MUnit)
4. Construction and deconstruction
5. map / filter / fold
6. List algorithms: reverse, zip, partition, groupBy, take/drop, find

### Phase 3 — Typeclasses, built from scratch (MUnit)
7. Eq
8. Ord
9. Show
10. Functor
11. Monad

### Phase 4 — ZIO effects (ZIO Test)
12. Effect construction
13. map / flatMap / for-comprehensions
14. Error handling
15. Fibers
16. Ref
17. Queue
18. Schedule
19. ZStream

## 4. Usability summary

Each exercise is a stub file plus a MUnit/ZIO test suite. Students edit
`src/main`, run `sbt test`. Exercises are self-contained. No solutions are
provided.