package exercises.basic

import munit.FunSuite

class ControlFlowSuite extends FunSuite:

  test("sign classifies numbers") {
    assertEquals(ControlFlow.sign(5), "positive")
    assertEquals(ControlFlow.sign(-3), "negative")
    assertEquals(ControlFlow.sign(0), "zero")
  }

  test("dayName returns the day or invalid") {
    assertEquals(ControlFlow.dayName(1), "Monday")
    assertEquals(ControlFlow.dayName(7), "Sunday")
    assertEquals(ControlFlow.dayName(8), "invalid")
    assertEquals(ControlFlow.dayName(0), "invalid")
  }

  test("larger returns the maximum") {
    assertEquals(ControlFlow.larger(4, 9), 9)
    assertEquals(ControlFlow.larger(10, 2), 10)
    assertEquals(ControlFlow.larger(7, 7), 7)
  }

  test("safeDiv returns None on division by zero") {
    assertEquals(ControlFlow.safeDiv(10, 2), Some(5))
    assertEquals(ControlFlow.safeDiv(10, 0), None)
  }

  test("isLeapYear follows the calendar rules") {
    assertEquals(ControlFlow.isLeapYear(2000), true)
    assertEquals(ControlFlow.isLeapYear(2024), true)
    assertEquals(ControlFlow.isLeapYear(1900), false)
    assertEquals(ControlFlow.isLeapYear(2023), false)
  }

  test("grade classifies scores") {
    assertEquals(ControlFlow.grade(18), "A")
    assertEquals(ControlFlow.grade(15), "B")
    assertEquals(ControlFlow.grade(13), "C")
    assertEquals(ControlFlow.grade(11), "D")
    assertEquals(ControlFlow.grade(8), "F")
  }

  test("bmiCategory classifies BMI") {
    assertEquals(ControlFlow.bmiCategory(18.0), "underweight")
    assertEquals(ControlFlow.bmiCategory(22.0), "normal")
    assertEquals(ControlFlow.bmiCategory(27.0), "overweight")
    assertEquals(ControlFlow.bmiCategory(32.0), "obese")
  }

end ControlFlowSuite