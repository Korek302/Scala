package cw

class Time(private var hour: Int)
{
   if(hour < 0)
    hour = 0
    
  def h: Int = hour
  
  def h_=(newHour: Int)
  {
    if(newHour < 0)
      hour = 0
    else
      hour = newHour
  } 

  override def toString() = 
  {
    hour + "";
  }
}

object Time
{
  def apply(h: Int) = new Time(h);
}