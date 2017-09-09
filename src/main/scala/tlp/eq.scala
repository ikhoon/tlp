package tlp

/**
  * Created by ikhoon on 09/09/2017.
  */
object eq {

  implicit class StrictEq[A](a: A) {
    def ===(b: A): Boolean = a == b
  }

  10 === 10
//  10 === "10"
}
