package exercises.typeclasses

/** Exercise 7 — The `Eq` typeclass.
  *
  * A typeclass for values that can be compared for equality.
  * Implement the trait, instances, and the `===`/`!==` syntax.
  */
object Eq:

  /** The typeclass. */
  trait Eq[A]:
    def equal(left: A, right: A): Boolean

  /** Summon an `Eq[A]` from the given context. */
  def apply[A](using ev: Eq[A]): Eq[A] = ev

  /** Instances. */
  given Eq[Int] with
    def equal(left: Int, right: Int): Boolean = left == right

  given Eq[String] with
    def equal(left: String, right: String): Boolean = left == right

  given Eq[Double] with
    def equal(left: Double, right: Double): Boolean = left == right

  given [A: Eq, B: Eq]: Eq[(A, B)] with
    def equal(left: (A, B), right: (A, B)): Boolean =
      left._1 === right._1 && left._2 === right._2

  given [A: Eq]: Eq[List[A]] with
    def equal(left: List[A], right: List[A]): Boolean =
      left.length == right.length && left.zip(right).forall((a, b) => a === b)

  /** Build an `Eq` for any type that already has `==`. */
  def byEquals[A]: Eq[A] =
    new Eq[A]:
      def equal(left: A, right: A): Boolean = left == right

  /** Syntax: `a === b` and `a !== b` once an `Eq[A]` is in scope. */
  extension [A](left: A)
    def ===(right: A)(using ev: Eq[A]): Boolean = ev.equal(left, right)
    def !==(right: A)(using ev: Eq[A]): Boolean = !ev.equal(left, right)

end Eq