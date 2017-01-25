package list12

class Row(private var matrix1: Array[Array[Int]],
          private var matrix2: Array[Array[Int]],
          private var result: Array[Array[Int]],
          private var index: Int)
    extends Thread 
{

  override def run()
  {
    if (matrix1(0).length == matrix2.length) 
    {
      for (j <- 0 until matrix2(0).length; k <- 0 until matrix1(0).length)
        result(index)(j) += (matrix1(index)(k) * matrix2(k)(j))
    } 
    else
      println("The number of columns of the 1st matrix does not match the number of rows of the 2nd matrix")
  }
}
