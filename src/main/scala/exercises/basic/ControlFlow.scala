package exercises.basic

/** Exercise 2 — Control flow and pattern matching.
  *
  * Implement the functions below using `if/else`, `match`, or the
  * expression-oriented style you prefer. The tests describe the expected
  * behaviour.
  */
object ControlFlow:

  /** Returns "positive", "negative", or "zero". */
  def sign(n: Int): String = ???

  /** Returns the day name for a number 1..7, or "invalid" otherwise. */
  def dayName(n: Int): String = ???

  /** Returns the larger of two integers. */
  def larger(a: Int, b: Int): Int = ???

  /** A safe division: returns `None` when dividing by zero. */
  def safeDiv(a: Int, b: Int): Option[Int] = ???

  /** Returns `true` when the year is a leap year.
    *
    * A year is a leap year if it is divisible by 4, except when it is
    * divisible by 100, unless it is also divisible by 400.
    */
  def isLeapYear(year: Int): Boolean = ???

  /** Classifies a grade: "A" (>=16), "B" (>=14), "C" (>=12), "D" (>=10), "F" otherwise. */
  def grade(score: Int): String = ???

  /** Returns the body mass index category.
    *
    * BMI categories: <18.5 "underweight", <25 "normal", <30 "overweight",
    * otherwise "obese".
    */
  def bmiCategory(bmi: Double): String = ???

end ControlFlow