package tlp

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

/**
  * Created by ikhoon on 10/09/2017.
  */
trait Applicative[F[_]] {
  def pure[A](a: A): F[A]

  def ap[A, B](fa: F[A])(ff: F[A => B]): F[B]
}

object Applicative {
  val futureAp = new Applicative[Future] {
    def pure[A](a: A) = Future.successful(a)

    def ap[A, B](fa: Future[A])(ff: Future[(A) => B]): Future[B] =
      ff.zip(fa).map { case (f, a) => f(a)}
  }
}
