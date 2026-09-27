package exercises.typeclasses

/** Exercise 9 — The `Show` typeclass.
  *
  * A typeclass for converting values to human-readable strings.
  * Implement the trait, instances, and the `show` syntax.
  */
object Show:

  /** The typeclass. */
  trait Show[A]:
    def show(a: A): String

  def apply[A](using ev: Show[A]): Show[A] = ev

  given Show[Int] with
    def show(a: Int): String = a.toString

  given Show[String] with
    def show(a: String): String = a

  given Show[Double] with
    def show(a: Double): String = a.toString

  given Show[Boolean] with
    def show(a: Boolean): String = a.toString

  given [A: Show, B: Show]: Show[(A, B)] with
    def show(a: (A, B)): String = s"(${summon[Show[A]].show(a._1)}, ${summon[Show[B]].show(a._2)})"

  given [A: Show]: Show[List[A]] with
    def show(a: List[A]): String = s"[${a.map(summon[Show[A]].show(_)).mkString(", ")}]"

  given [A: Show]: Show[Option[A]] with
    def show(a: Option[A]): String = a match
      case Some(x) => s"Some(${summon[Show[A]].show(x)})"
      case None    => "None"

  /** Build a `Show` from a formatting function. */
  def from[A](f: A => String): Show[A] =
    new Show[A]:
      def show(a: A): String = f(a)

  /** Syntax: `a.show` once a `Show[A]` is in scope. */
  extension [A](a: A)
    def show(using ev: Show[A]): String = ev.show(a)

end Show