package lab

case class Rectangle(private var side1: Double = 0.0, private var side2: Double = 0.0) extends Square(side1)
{
  if(side1 < 0 || side2 < 0) 
    throw new NegativeValue
    
  def getSide1() = side1
  
  def getSide2() = side2
    
  override def area = side1*side2
  
  override def areaInt = (side1*side2).toInt
  
  def + (other: Rectangle)=
  {
    new Rectangle(side1 + other.side1, side2 + other.side2)
  }
  
  override def + (other: Square)=
  {
    new Rectangle(side1 + other.getSide(), side2 + other.getSide())
  }
  
  override def toString = "Rect["+side1 + " " + side2+"]"
}