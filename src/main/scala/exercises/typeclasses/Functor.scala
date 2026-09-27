package exercises.typeclasses

/** Exercise 10 — The `Functor` typeclass.
  *
  * A Functor is anything that can be "mapped over": `F[A]` becomes `F[B]`
  * by applying a function `A => B`. Implement the trait, instances for
  * `Option`, `List`, and `Function1`, and the combinators.
  */
object Functor:

  /** The typeclass. `F[_]` is a type constructor (e.g. `Option`, `List`). */
  trait Functor[F[_]]:
    def map[A, B](fa: F[A])(f: A => B): F[B]

    /** `void` discards the value, replacing it with `()`. */
    def void[A](fa: F[A]): F[Unit] = map(fa)(_ => ())

    /** Replace the value with a constant. */
    def replace[A, B](fa: F[A])(b: B): F[B] = map(fa)(_ => b)

    /** Lift through a function, like `map` but with the function first. */
    def lift[A, B](f: A => B): F[A] => F[B] = fa => map(fa)(f)

  def apply[F[_]](using ev: Functor[F]): Functor[F] = ev

  given Functor[Option] with
    def map[A, B](fa: Option[A])(f: A => B): Option[B] = fa.map(f)

  given Functor[List] with
    def map[A, B](fa: List[A])(f: A => B): List[B] = fa.map(f)

  given [A]: Functor[[B] =>> A => B] with
    def map[C, D](fa: A => C)(f: C => D): A => D = fa.andThen(f)

  /** Syntax: `fa.map(f)` once a `Functor[F]` is in scope. */
  extension [F[_], A](fa: F[A])
    def map[B](f: A => B)(using ev: Functor[F]): F[B] = ev.map(fa)(f)

  /** Composition of functors: map over the inner functor. */
  def compose[F[_], G[_]](using ff: Functor[F], fg: Functor[G]): Functor[[X] =>> F[G[X]]] =
    new Functor[[X] =>> F[G[X]]]:
      def map[A, B](fa: F[G[A]])(f: A => B): F[G[B]] = ff.map(fa)(ga => fg.map(ga)(f))

end Functor