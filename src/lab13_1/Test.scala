package list12

object Test 
{
  def main(args: Array[String])
  {
    val matrix1: Array[Array[Int]] = Array(Array(3, 6, 7), Array(1, 7, 0))
    val matrix2: Array[Array[Int]] = Array(Array(4, 2, 5), Array(1, 0, 1), Array(2, 3, 9))
    val result: Array[Array[Int]] = Array.ofDim[Int](matrix1.length, matrix2.length)
    val rows: Array[Row] = Array.ofDim[Row](matrix1.length)
    
    for (i <- 0 until matrix1.length) 
    {
      rows(i) = new Row(matrix1, matrix2, result, i)
    }

    for (t <- rows) 
    {
      t.start()
    }

    for (t <- rows) 
    {
      t.join()
    }
    
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
