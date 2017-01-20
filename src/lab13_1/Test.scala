package lab13_1

object Test 
{
  def main(args: Array[String])
  {
    val mulitiplier: Multiplier = new Multiplier()
    val matrix1: Array[Array[Int]] = Array(
        Array(4, 1, 0), 
        Array(1, 2, 5))
    
    val matrix2: Array[Array[Int]] = Array(
        Array(4, 0, 5), 
        Array(1, 3, 1), 
        Array(7, 3, 9))
        
    val result: Array[Array[Int]] = mulitiplier.multiply(matrix1, matrix2)
    
    for (i <- 0 until result.length) 
    {
      System.out.print("|")
      for (j <- 0 until result(0).length) 
      {
        System.out.print(result(i)(j) + "\t")
      }
      println("|")
    }
  }
}
