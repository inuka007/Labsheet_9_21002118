package Lab_9
object Q1 extends App{
  case class Rational(n: Int, d: Int) {
    def fraction() = {
      def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b);
      val g = gcd(n, d)
      Rational(n / g, d / g)
    }
    def neg() = Rational(-n, d).fraction();
  }

  val x = Rational(543, 23)
  printf("Negating and taking out factors from numerator and denomenator: ")
  println( x.neg()); // Rational(-3,4)
}

