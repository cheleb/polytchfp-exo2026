package exercises.lists

/** Exercise 4 — List construction and deconstruction.
  *
  * Work with the basic structure of immutable linked lists:
  * `Nil` is the empty list, `head :: tail` prepends an element.
  */
object ListBasics:

  /** Returns the first element, or None if the list is empty. */
  def head[A](xs: List[A]): Option[A] = ???

  /** Returns the rest of the list, or None if the list is empty. */
  def tail[A](xs: List[A]): Option[List[A]] = ???

  /** Returns the last element, or None if the list is empty. */
  def last[A](xs: List[A]): Option[A] = ???

  /** Returns the list without its first element. */
  def init[A](xs: List[A]): List[A] = ???

  /** Returns true when the list is empty. */
  def isEmpty[A](xs: List[A]): Boolean = ???

  /** Reverses a list without using `reverse`. */
  def reverse[A](xs: List[A]): List[A] = ???

  /** Zips two lists into a list of pairs. Stops at the shorter one. */
  def zip[A, B](xs: List[A], ys: List[B]): List[(A, B)] = ???

  /** Takes the first n elements. */
  def take[A](xs: List[A], n: Int): List[A] = ???

  /** Drops the first n elements. */
  def drop[A](xs: List[A], n: Int): List[A] = ???

  /** Returns the element at index n, or None. */
  def get[A](xs: List[A], n: Int): Option[A] = ???

end ListBasics