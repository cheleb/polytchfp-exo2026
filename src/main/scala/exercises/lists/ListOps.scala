package exercises.lists

/** Exercise 5 — map, filter, fold.
  *
  * Implement the classic higher-order list operations from scratch.
  * Do not delegate to the standard library's `map`, `filter`, or `foldLeft`.
  */
object ListOps:

  /** Applies `f` to every element, preserving order. */
  def map[A, B](xs: List[A])(f: A => B): List[B] = ???

  /** Keeps only the elements for which `p` returns true. */
  def filter[A](xs: List[A])(p: A => Boolean): List[A] = ???

  /** Folds the list from left to right, starting with `zero`. */
  def foldLeft[A, B](xs: List[A])(zero: B)(f: (B, A) => B): B = ???

  /** Folds the list from right to left. */
  def foldRight[A, B](xs: List[A])(zero: B)(f: (A, B) => B): B = ???

  /** Flattens a list of lists into a single list. */
  def flatten[A](xss: List[List[A]]): List[A] = ???

  /** Flat-maps each element through `f`. */
  def flatMap[A, B](xs: List[A])(f: A => List[B]): List[B] = ???

  /** Returns the sum of all integers. */
  def sum(xs: List[Int]): Int = ???

  /** Returns the product of all integers. */
  def product(xs: List[Int]): Int = ???

  /** Returns the maximum element, or None for an empty list. */
  def max(xs: List[Int]): Option[Int] = ???

end ListOps