package cw10_3

class Queue[+T] private (private val queue: (List[T], List[T]))
{
  def enqueue[S >: T](elem: S): Queue[S] =
  {
    queue match
    {
      case (Nil, endOfQueue) => new Queue((elem::endOfQueue).reverse, Nil)
      case (startOfQueue, endOfQueue) => new Queue(startOfQueue, elem::endOfQueue)
    }
  }
  
  def dequeue: Queue[T] =
  {
    queue match
    {
      case (Nil, _) => new Queue(Nil, Nil)
      case (h::t, endOfQueue) => 
        if(t == Nil)
          new Queue(endOfQueue.reverse, Nil)
				else 
				{
				  new Queue(t, endOfQueue)
				}
    }
  }
  
  def first: T =
  {
    queue match
    {
      case (Nil, _) => throw new EmptyQueue("module Queue: first")
      case (h::t, _) => h
    }
  }
  
  def isEmpty: Boolean =
  {
    queue._1 == Nil
  }
  
  def print
  {
    println(queue._1 + ", " + queue._2)
  }
}

object Queue
{
  def apply[T](xs: T*) = new Queue[T](xs.toList, Nil)
  def empty[T]: Queue[T] =
  {
    new Queue[T](Nil, Nil)
  }
}