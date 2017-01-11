package lab10_2

import scala.collection.mutable.Stack

class Converter
{
	def convert(l: Array[Char]):Array[AnyVal] =
  {
	  var stack = Stack[Char]()
	  var out = Array[Char]()
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
	      
	    
	    
	    /*in(i) match
	    {
	      case '+' =>
	      case '-' =>
	        while(!stack.isEmpty && (stack.top == '+' || stack.top == '-' || stack.top == '*' || stack.top == '/' ))
				  {
	          out :+ stack.pop
				  }
			  	stack.push(in(i))
			  	
	      case '*' => 
	      case '/' =>
	        while(!stack.isEmpty && (stack.top == '*' || stack.top == '/' ))
  				{
  					out :+ stack.pop;
  				}
  				stack.push(in(i))
	      
	      case _ =>
				  out :+ in(i)
	    }*/
	  }
	  
	  while(!stack.isEmpty)
			out = out :+ stack.pop
		
	  var out2 = Array[AnyVal]()
		
	  var j = 0
		for(j <- 0 to out.length - 1)
		{
			if(out(j) != '+' && out(j) != '-' && out(j) != '*' && out(j) != '/')
				out2 = out2 :+ (out(j)-'0').toDouble
			else
				out2 = out2 :+ out(j)
		}
		
		out2
  }
}
