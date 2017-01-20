package lab13_1

class Multiplier 
{
  def multiply(matrix1: Array[Array[Int]], matrix2: Array[Array[Int]]): Array[Array[Int]] = 
  {
    val result: Array[Array[Int]] = Array.ofDim[Int](matrix1.length, matrix2.length)
    val rows: Array[Row] = new Array[Row](matrix1.length)
    for (i <- 0 until matrix1.length) 
    {
      rows(i) = new Row(matrix1, matrix2, result, i)
      rows(i).start()
    }
    result
  }
}
