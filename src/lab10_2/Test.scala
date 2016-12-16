package lab10_2

object Test
{
  def main(args: Array[String])
  {
    val a = new Operand(2, 3)
    
    val b = new Adder(a)
    
    println(b.operation)
    
    val c = new CalculatorGUI
    
    val list = c.read
    
    println(list.deep.mkString(""))
  }
}