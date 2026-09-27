package exercises.typeclasses

/** Exercise 8 — The `Ord` typeclass.
  *
  * Extends `Eq` with a total ordering. Implement the trait, instances for
  * primitive types, and the combinators.
  */
object Ord:

  import Eq.*

  /** The typeclass. `compare` returns negative / zero / positive. */
  trait Ord[A] extends Eq[A]:
    def compare(left: A, right: A): Int

    def lessThan(left: A, right: A): Boolean = compare(left, right) < 0
    def greaterThan(left: A, right: A): Boolean = compare(left, right) > 0
    def lessOrEqual(left: A, right: A): Boolean = compare(left, right) <= 0
    def greaterOrEqual(left: A, right: A): Boolean = compare(left, right) >= 0
    def min(left: A, right: A): A = if compare(left, right) <= 0 then left else right
    def max(left: A, right: A): A = if compare(left, right) >= 0 then left else right

    def equal(left: A, right: A): Boolean = compare(left, right) == 0

  def apply[A](using ev: Ord[A]): Ord[A] = ev

  given Ord[Int] with
    def compare(left: Int, right: Int): Int = left.compare(right)

  given Ord[String] with
    def compare(left: String, right: String): Int = left.compareTo(right)

  given Ord[Double] with
    def compare(left: Double, right: Double): Int = left.compare(right)

  given [A: Ord, B: Ord]: Ord[(A, B)] with
    def compare(left: (A, B), right: (A, B)): Int =
      val c = summon[Ord[A]].compare(left._1, right._1)
      if c != 0 then c else summon[Ord[B]].compare(left._2, right._2)

  given [A: Ord]: Ord[List[A]] with
    def compare(left: List[A], right: List[A]): Int =
      val pairs = left.zip(right)
      val head = pairs.collectFirst { case (a, b) if a !== b => a.compare(b) }
      head.getOrElse(left.length.compare(right.length))

  /** Build an `Ord` from a comparison function. */
  def from[A](f: (A, A) => Int): Ord[A] =
    new Ord[A]:
      def compare(left: A, right: A): Int = f(left, right)

  /** Syntax: `a < b`, `a > b`, `a <= b`, `a >= b`. */
  extension [A](left: A)
    def compare(right: A)(using ev: Ord[A])= ev.compare(left, right) 
    def <(right: A)(using ev: Ord[A]): Boolean = ev.lessThan(left, right)
    def >(right: A)(using ev: Ord[A]): Boolean = ev.greaterThan(left, right)
    def <=(right: A)(using ev: Ord[A]): Boolean = ev.lessOrEqual(left, right)
    def >=(right: A)(using ev: Ord[A]): Boolean = ev.greaterOrEqual(left, right)

end Ord