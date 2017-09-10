package tlp

/**
  * Created by ikhoon on 09/09/2017.
  */

object ValueLevel {

  sealed trait Bool
  val True: Bool = new Bool {}
  val False: Bool = new Bool {}

  val hasOption: Bool = True
}

object TypeLevel {

  sealed trait Bool
  sealed trait True extends Bool
  sealed trait False extends Bool

  type HasOption = True
}

case class Abc[B <: Int]() {
  var a: Option[String] = None
  var b: Option[Int] = None
}

  object Test {
    def main(args: Array[String]): Unit = {

    }
  }