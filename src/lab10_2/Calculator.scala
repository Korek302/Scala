package lab10_2

import scala.collection.mutable.Stack

class Calculator
{
  var converter = new Converter
  
  def evaluate()
  {
    var l = readLine
    
    var list = l.toCharArray()
    var list2 = Array[AnyVal]()
    
    var acc = 0.0
    var k = 0
    for(k <- 0 to list.length - 1)
    {
      if(list(k) != '+' && list(k) != '-' && list(k) != '*' && list(k) != '/')
        acc = acc*10 + (list(k)-'0').toDouble
      else
      {
        list2 = list2 :+ acc
        list2 = list2 :+ list(k)
        acc = 0.0
      }
    }
    list2 = list2 :+ acc
    
    
    var onp: Array[AnyVal] = converter.convert(list2)
    
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