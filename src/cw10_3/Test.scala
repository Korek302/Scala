package cw10_3

object test
{
  def main(args: Array[String])
  {
    var t = Queue('a')
    t.enqueue('g', t)
    println(t.enqueue('g').enqueue('z').enqueue('t').enqueue('b').dequeue.first)
    println(t.isEmpty)
    println(t.dequeue.isEmpty)
    println(t.dequeue.dequeue.isEmpty)
    
    var queueOfPoints = Queue(new Point())
    println(queueOfPoints)
    val queueOfPixels = Queue(new Pixel(2,3))
    println(queueOfPixels)
    queueOfPoints = queueOfPixels
    println(queueOfPoints)
    println(queueOfPoints.first)
    println(queueOfPoints.first.asInstanceOf[Pixel])
  }
}