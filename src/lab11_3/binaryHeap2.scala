package lab11_3

class binaryHeap2
{
  private var list = Array[Int]()
  private var last: Int = 0
  
  private def swap(i1: Int, i2: Int)
  {
    var temp = list(i1)
    list.update(i1, list(i2))
    list.update(i2, temp)
  }
  
  private def maxHeap(list: Array[Int], i: Int)
  {
    var largest = 0
    var left = 2*i + 1
    var right = 2*i + 2
    if(left <= last && list(left) - list(i) > 0)
			largest = left
    else
      largest = i
    if(right <= last && list(right) - list(largest) > 0)
      largest = right
    if(largest != i)
		{
			swap(i, largest)
			maxHeap(list, largest)
		}
  }
  
  private def buildHeap(list: Array[Int])
  {
    last = list.length - 1
    
    var i = 0
    for(i <- last to 0)
    {
      maxHeap(list, i)
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
    buildHeap(list)
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
    swap(0, list.length-1)
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