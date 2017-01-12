package lab10_2

import scala.collection.mutable.Stack

class Converter
{
	def convert(l: Array[AnyVal]):Array[AnyVal] =
  {
	  var stack = Stack[AnyVal]()
	  var out = Array[AnyVal]()
	  var in = l
	  
	  var i = 0
	  for(i <- 0 to in.length - 1)
	  {
	    if(in(i) == '+' || in(i) == '-')
	    {
	      while(!stack.isEmpty && (stack.top == '+' || stack.top == '-' || stack.top == '*' || stack.top == '/' ))
				  {
	          out = out :+ stack.pop
				  }
			  	stack.push(in(i))
	    }
	    else if(in(i) == '*' || in(i) == '/')
	    {
	      while(!stack.isEmpty && (stack.top == '*' || stack.top == '/' ))
  				{
  					out = out :+ stack.pop
  				}
  				stack.push(in(i))
	    }
	    else
	      out = out :+ in(i)
	  }
	  
	  while(!stack.isEmpty)
			out = out :+ stack.pop
		
		out
  }
}
