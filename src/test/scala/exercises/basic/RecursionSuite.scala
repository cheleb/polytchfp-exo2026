package exercises.basic

import munit.FunSuite

class RecursionSuite extends FunSuite:

  test("factorial computes 0! to 5!") {
    assertEquals(Recursion.factorial(0), BigInt(1))
    assertEquals(Recursion.factorial(1), BigInt(1))
    assertEquals(Recursion.factorial(5), BigInt(120))
    assertEquals(Recursion.factorial(10), BigInt(3628800))
  }

  test("fib computes the sequence") {
    assertEquals(Recursion.fib(0), 0L)
    assertEquals(Recursion.fib(1), 1L)
    assertEquals(Recursion.fib(2), 1L)
    assertEquals(Recursion.fib(10), 55L)
  }

  test("sumUpTo works") {
    assertEquals(Recursion.sumUpTo(0), 0L)
    assertEquals(Recursion.sumUpTo(5), 15L)
    assertEquals(Recursion.sumUpTo(100), 5050L)
  }

  test("repeat builds the string") {
    assertEquals(Recursion.repeat("ab", 3), "ababab")
    assertEquals(Recursion.repeat("x", 0), "")
  }

  test("pow works") {
    assertEquals(Recursion.pow(2.0, 10), 1024.0)
    assertEquals(Recursion.pow(3.0, 0), 1.0)
    assertEquals(Recursion.pow(5.0, 2), 25.0)
  }

  test("gcd works") {
    assertEquals(Recursion.gcd(48, 18), 6)
    assertEquals(Recursion.gcd(17, 5), 1)
    assertEquals(Recursion.gcd(0, 5), 5)
  }

  test("reverse reverses a string") {
    assertEquals(Recursion.reverse("hello"), "olleh")
    assertEquals(Recursion.reverse(""), "")
  }

  test("countChar counts occurrences") {
    assertEquals(Recursion.countChar("hello", 'l'), 2)
    assertEquals(Recursion.countChar("hello", 'z'), 0)
  }

end RecursionSuite