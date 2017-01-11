package lab10_2

object Test
{
  def main(args: Array[String])
  {
    var c1 = new Calculator
    
    println("CALCULATOR")
    println("Avaliable actions: ")
		println("+ - add")
		println("- - substract")
		println("* - multiply")
		println("/ - divide")
		System.out.println("Enter expression: ")
    
		c1.evaluate
  }
}