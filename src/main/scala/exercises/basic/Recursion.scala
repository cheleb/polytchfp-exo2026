package exercises.basic

/** Exercise 3 — Methods, recursion, and tail recursion.
  *
  * Implement each function using recursion where appropriate. Prefer a
  * tail-recursive helper (`@annotation.tailrec`) for the long-running ones.
  */
object Recursion:

  /** Computes n! (factorial). 0! is 1. */
  def factorial(n: Int): BigInt = ???

  /** Computes the n-th Fibonacci number (0, 1, 1, 2, 3, 5, ...). */
  def fib(n: Int): Long = ???

  /** Sums all integers from 1 to n. */
  def sumUpTo(n: Int): Long = ???

  /** Repeats `s`, `n` times. */
  def repeat(s: String, n: Int): String = ???

  /** Computes `base` raised to the power `exp` (exp >= 0). */
  def pow(base: Double, exp: Int): Double = ???

  /** Greatest common divisor using Euclid's algorithm. */
  def gcd(a: Int, b: Int): Int = ???

  /** Reverses a string without using built-in reversal. */
  def reverse(s: String): String = ???

  /** Counts how many times `ch` appears in `s`. */
  def countChar(s: String, ch: Char): Int = ???

end Recursion