package lab

object Test
{
  implicit def doubleToRectangle(d: Double) = Rectangle(d, d)

  implicit def squareToRectangle(s: Square) = Rectangle(s.getSide(), s.getSide())
  
  def main(args: Array[String])
  {
    val a = new Square(6);
    val b = new Rectangle(2.0, 3.0);
    println(a.getName())
    println(b.getName())
    println(a);
    println(b);
    println(a.area);
    println(b.areaInt);
    println(squareToRectangle(a));
    println(1.0 + b);
    println(b + a);
    println(a + b);
  }
}