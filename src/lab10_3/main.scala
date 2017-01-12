package lab10_3

object main
{
  def main(args: Array[String])
  {
    val game = new Game
    
    while(game.status == "unfinished")
    {
      game.printBoard
      println(game.currPlayer + "'s turn.\n")
      var valid = false
      do 
      {
        val row = readInt
        val col = readInt
        valid = game.play(game.currPlayer , List(row,col))
      } while(valid == false)
    }
    game.printBoard
    println(game.status)
  }
}