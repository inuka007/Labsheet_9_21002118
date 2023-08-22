package Lab_9
object Q2 extends App{
  case class Rational(n: Int, d: Int) {
    def sub(other: Rational): Rational = new Rational(n * other.d - other.n * d, d * other.d)
  }

  val x = Rational(3, 4);
  val y = Rational(5, 8);
  val z = Rational(2, 7);

  val output = x.sub(y).sub(z)
  println("x - y - z = " + output)
}