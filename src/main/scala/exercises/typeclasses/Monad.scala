package exercises.typeclasses

/** Exercise 11 — The `Monad` typeclass.
  *
  * A Monad is a Functor that also supports `pure` (lift a value) and
  * `flatMap` (flatten a nested effect). Implement the trait, instances
  * for `Option` and `List`, and the combinators.
  */
object Monad:

  import Functor.*

  /** The typeclass. Must satisfy the monad laws. */
  trait Monad[F[_]] extends Functor[F]:
    def pure[A](a: A): F[A]
    def flatMap[A, B](fa: F[A])(f: A => F[B]): F[B]

    def map[A, B](fa: F[A])(f: A => B): F[B] =
      flatMap(fa)(a => pure(f(a)))

    /** `flatten` collapses `F[F[A]]` into `F[A]`. */
    def flatten[A](ffa: F[F[A]]): F[A] = flatMap(ffa)(identity)

    /** `void` discards the value, replacing it with `()`. */
    override def void[A](fa: F[A]): F[Unit] = map(fa)(_ => ())

  def apply[F[_]](using ev: Monad[F]): Monad[F] = ev

  given Monad[Option] with
    def pure[A](a: A): Option[A] = Some(a)
    def flatMap[A, B](fa: Option[A])(f: A => Option[B]): Option[B] = fa.flatMap(f)

  given Monad[List] with
    def pure[A](a: A): List[A] = List(a)
    def flatMap[A, B](fa: List[A])(f: A => List[B]): List[B] = fa.flatMap(f)

  /** Sequence: collect the results of a list of monadic values into one. */
  def sequence[F[_], A](fas: List[F[A]])(using m: Monad[F]): F[List[A]] =
    fas.foldLeft(m.pure(List.empty[A])) { (acc, fa) =>
      m.flatMap(acc)(as => m.map(fa)(b => as :+ b))
    }

  /** Replicate an effect `n` times, collecting results. */
  def replicateM[F[_], A](n: Int, fa: F[A])(using m: Monad[F]): F[List[A]] =
    sequence(List.fill(n)(fa))

  /** Syntax: `fa.flatMap(f)` once a `Monad[F]` is in scope. */
  extension [F[_], A](fa: F[A])
    def flatMap[B](f: A => F[B])(using ev: Monad[F]): F[B] = ev.flatMap(fa)(f)

end Monad