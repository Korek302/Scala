package lab11_3

object Test
{
  def main(args: Array[String])
  {
    var heap = new BinaryHeap
    heap.insert(8)
    heap.insert(4)
    heap.insert(2)
    heap.insert(3)
    heap.insert(7)
    heap.insert(9)
    heap.insert(1)
    heap.insert(5)
    heap.insert(6)
    heap.insert(0)
    
    println(heap.toString())
    println(heap.top())
    println(heap.pop())
    println(heap.toString())
    println(heap.check(7))
    println(heap.check(11))
  }
}