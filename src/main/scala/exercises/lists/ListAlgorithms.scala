package exercises.lists

/** Exercise 6 — List algorithms.
  *
  * Implement these classic list algorithms. Avoid delegating to the
  * standard library where the name is the same; build them from recursion
  * and the operations you already know.
  */
object ListAlgorithms:

  /** Partitions the list into `(matching, notMatching)`. */
  def partition[A](xs: List[A])(p: A => Boolean): (List[A], List[A]) = ???

  /** Groups consecutive equal elements: `List(1,1,2,1,1) -> List(List(1,1),List(2),List(1,1))`. */
  def groupConsecutive[A](xs: List[A]): List[List[A]] = ???

  /** Groups elements by the key produced by `f`. */
  def groupBy[A, K](xs: List[A])(f: A => K): Map[K, List[A]] = ???

  /** Returns the first element satisfying `p`, or None. */
  def find[A](xs: List[A])(p: A => Boolean): Option[A] = ???

  /** Returns true when `p` is satisfied by at least one element. */
  def exists[A](xs: List[A])(p: A => Boolean): Boolean = ???

  /** Returns true when `p` is satisfied by all elements. */
  def forall[A](xs: List[A])(p: A => Boolean): Boolean = ???

  /** Returns the number of elements satisfying `p`. */
  def count[A](xs: List[A])(p: A => Boolean): Int = ???

  /** Returns sliding windows of size `n`. `List(1,2,3,4)` with n=2 -> `List(List(1,2),List(2,3),List(3,4))`. */
  def sliding[A](xs: List[A], n: Int): List[List[A]] = ???

  /** Inserts `sep` between every pair of elements. */
  def intersperse[A](xs: List[A], sep: A): List[A] = ???

  /** Removes consecutive duplicate elements. */
  def dedupe[A](xs: List[A]): List[A] = ???

  /** Returns the list with elements in reverse order (iterative style). */
  def reverseIter[A](xs: List[A]): List[A] = ???

end ListAlgorithms