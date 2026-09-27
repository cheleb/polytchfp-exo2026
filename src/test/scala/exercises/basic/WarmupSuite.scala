package exercises.basic

import munit.FunSuite

class WarmupSuite extends FunSuite:

  test("theAnswer is 42") {
    assertEquals(Warmup.theAnswer, 42)
  }

  test("isFun is true") {
    assertEquals(Warmup.isFun, true)
  }

  test("greet concatenates with a space") {
    assertEquals(Warmup.greet("Hello", "world"), "Hello world")
  }

  test("fullTitle interpolates a title") {
    assertEquals(Warmup.fullTitle("Ada", "Lovelace"), "Ada Lovelace")
  }

  test("add works") {
    assertEquals(Warmup.add(2, 3), 5)
  }

  test("max returns the larger value") {
    assertEquals(Warmup.max(7, 3), 7)
    assertEquals(Warmup.max(2, 9), 9)
  }

  test("abs handles positive and negative values") {
    assertEquals(Warmup.abs(5), 5)
    assertEquals(Warmup.abs(-5), 5)
  }

  test("courseName is set") {
    assertEquals(Warmup.courseName, "Functional Programming")
  }

end WarmupSuite