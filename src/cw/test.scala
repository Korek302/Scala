package cw

object test
{
  def main(args: Array[String])
  {
    println(Time(2).toString())
    var a = Time(2)
    a.h = a.h - 3
    println(a.toString() + " " + a.h)
    
    val h0 = Time2(23, 46)
    val h1 = Time2(22, 45)
    println(h0.toString())
    println(h1.toString())
    println(h0.before(h1))
    
    val h2 = Time3(23, 46)
    val h3 = Time3(22, 45)
    println(h2.toString())
    println(h3.toString())
    println(h2.before(h3))
    
    val h4 = new Time3(23, 46)
    val h5 = new Time3(22, 45)
    println(h4.toString())
    println(h5.toString())
    println(h4.before(h5))
    
    val h6 = new Time3(60)
    val h7 = new Time3(1365)
    println(h6.toString())
    println(h7.toString())
    println(h7.before(h6))
  }
}