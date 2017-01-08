package lab10_3

class Game
{
  var board = Array(
      Array("_", "_", "_"),
      Array("_", "_", "_"),
      Array("_", "_", "_"));
  
  var currPlayer = "X";
  
  def play(mark: String, pos : List[Int]) : Boolean = 
  {
    if(mark == currPlayer && board(pos(0))(pos(1)) == "_")
    {
      board(pos(0))(pos(1)) = mark
      if(currPlayer == "X") 
        currPlayer = "O" 
      else 
        currPlayer = "X"
      
      return true
    }
    else 
    {
      return false
    }
  }
  
  def status : String =
  {
  
    def winner(line : Array[String]) =
    {
      if(!line(0).equals("_") && line(0).equals(line(1)) && line(1).equals(line(2)))
      {
        true
      }
        else 
      {
        false
      }
    }
    
    def isFull() : Boolean =
    {
      board.foreach
      {
        row => row.foreach
        {
          elem => 
            if(elem == "_")
              return false
        }
      }
      return true
    }
    
    val rows = Array(
        Array(board(0)(0), board(0)(1), board(0)(2)),
        Array(board(1)(0), board(1)(1), board(1)(2)),
        Array(board(2)(0), board(2)(1), board(2)(2)))
        
    val cols = Array(
        Array(board(0)(0), board(1)(0), board(2)(0)),
        Array(board(0)(1), board(1)(1), board(2)(1)),
        Array(board(0)(2), board(1)(2), board(2)(2)))
        
    val diags = Array(
        Array(board(0)(0), board(1)(1), board(2)(2)),
        Array(board(0)(2), board(1)(1), board(2)(0)))
        
    val lines = rows ++ cols ++ diags
    
    lines.foreach
    {
      line => if(winner(line))
      {
        return line(0) + " wins!"
      }
    }
    
    if(isFull())
      return "tie"
    
    return "unfinished"
  }
  
  
  def printBoard = 
  {
    board.foreach 
    { 
      row => println("" + row(0) + " | "
                        + row(1) + " | "
                        + row(2))
    }
  }
}