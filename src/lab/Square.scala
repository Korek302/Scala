package lab

class Square(private var side: Double = 0.0)
{
  if(side < 0) 
    throw new NegativeValue
  
  def getSide() = side
  
  def areaInt = (side*side).toInt
    
  def area = side*side
  
  def getName() = this.getClass.getSimpleName
  
  def + (other: Square)=
  {
    new Square(side + other.side)
  }
  
  override def toString = "Square["+side+"]"
}