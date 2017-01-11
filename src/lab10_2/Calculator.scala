package lab10_2

import scala.collection.mutable.Stack

class Calculator
{
  var converter = new Converter
  
  def evaluate()
  {
    var l = readLine
    var onp: Array[AnyVal] = converter.convert(l.toCharArray)
    
    
    println("RPN representation: " + onp.mkString(" "))
    
    var stack = Stack[Double]()
    
    var i = 0
    for(i <- 0 to onp.length - 1)
		{
			
			if(onp(i).isInstanceOf[Double])
				stack.push(onp(i).asInstanceOf[Double])
			else
			{
				if(!stack.isEmpty)
				{
					var right = stack.pop
					if(!stack.isEmpty)
					{
						var left = stack.pop
						onp(i) match
					  {
					    case '+' => stack.push(left + right)
				      case '-' => stack.push(left - right)
					   	case '*' => stack.push(left * right)
						  case '/' => stack.push(left / right)
						}
					}
				}
			}
		}
		println("Result: ")
		println(stack.pop())
  }
}