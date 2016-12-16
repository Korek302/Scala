package lab10_2

import scala.collection.mutable.Stack
import scala.io.StdIn

class CalculatorGUI extends Calculator
{
  def read: Array[Char] = 
  {
    val line:String = readLine()
    line.toArray
  }
  
  def convert(list: Array[Char]): Array[Char] =
  {
    var stack = new Stack[Char]
    var out = new Array[Char](list.size)
    
    var i = 0
    while(i < list.size)
    {
      val temp = list(i)
      temp match
      {
        case '+' => 
        case '-' => 
          {
          while(!stack.isEmpty && (stack.top == '+' 
				|| stack.top == '-' || stack.top == '*' 
				|| stack.top == '/' || stack.top == '^'))
				{
					out(i) = stack.pop
				}
				stack.push(list(i))
          }
				
				case '*' =>
			  case '/' =>
			    {
				while(!stack.isEmpty && (stack.top == '*' 
				|| stack.top == '/'))
				{
					out(i) = stack.pop
				}
				stack.push(list(i))
			    }
				
			  case _ =>
				out(i) = list(i)
      }
      
      i=i+1
    }
    
    var j = 0
    while(j < list.size)
    {
      out(j) = stack.pop
      
      j=j+1
    }
    
    out
  }
}