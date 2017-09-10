package tlp

/**
  * Created by ikhoon on 24/08/2017.
  */
object typeclass {

  case class Point(x: Int, y: Int)
  trait Adder[A] {
    def zero: A
    def add(x: A, y: A): A
  }

  def sum[A](xs: List[A])(implicit adder: Adder[A]): A =
    xs.foldLeft(adder.zero)(adder.add)

  implicit val intAdder = new Adder[Int] {
    def zero: Int = 0
    def add(x: Int, y: Int) = x + y
  }

  implicit val pointAdder = new Adder[Point] {
    def zero = Point(0, 0)
    def add(a: Point, b: Point) = Point(a.x + b.x, a.y + b.y)
  }

  implicit val doubleAdder = new Adder[Double] {
    def zero: Double = 0.0
    def add(x: Double, y: Double) = x + y
  }

  def main(args: Array[String]): Unit = {
    println(sum(List(Point(1, 10), Point(5, 5))))
  }
}
