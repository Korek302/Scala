package lab11_3

class BinaryHeap extends Heap
{
  private var list = Array[Int]()
  
  private def swap(i1: Int, i2: Int)
  {
    var temp = list(i1)
    list.update(i1, list(i2))
    list.update(i2, temp)
  }
	
  def swim(i: Int)
  {
    var parent = 0
    var j = i
    while(j != 0 && list((j - 1)/2) - list(j) < 0)
    {
      parent = (j - 1)/2
      swap(j, parent)
			j = parent
    }
  }
  
	def sink(i: Int)
	{
	  var isDone = false
	  var child = 2*i + 1
	  while(!isDone && child < list.length)
	  {
	    if(child < list.length - 1 && list(child + 1) - list(child) > 0)
				child += 1;
			if(list(child) - list(i) > 0)
				swap(i, child);
			else
				isDone = true;
	  }
	}
  
  override
  def toString(): String =
  {
    var out: String = "["
    if(!list.isEmpty)
    {
      var i = 0
      for(i <- 0 to list.length - 2)
      {
        out = out + list(i) + ", "
      }
      out = out + list(list.length - 1)
    }
    out = out + "]"
    out
  }
  
  def insert(elem: Int)
  {
    list = list :+ elem
    swim(list.length - 1)
  }
  
  def top(): Int =
  {
    if(list.isEmpty)
      throw new EmptyHeapException("top")
      
    list(0)
  }
  
  def pop(): Int =
  {
    if(list.isEmpty)
      throw new EmptyHeapException("pop")
    
    var out = list(0)
    if(list.length > 1)
		{
      swap(0, list.length-1)
      sink(0)
		}
    list = list.slice(0, list.length-1)
    out
  }
  
  def check(elem: Int): Boolean =
  {
    var out = false
    if(!list.isEmpty)
    {
      var i = 0
      for(i <- i to list.length - 1)
      {
        if(list(i) == elem)
          out = true
      }
    }
    out
  }
}