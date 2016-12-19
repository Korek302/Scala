package cw

class Time2(private var hour: Int, private var minute: Int)
{
  if(hour < 0 || hour > 23 || minute < 0 || minute > 59)
    throw new IllegalArgumentException
    
  def h: Int = hour
  
  def m: Int = minute
  
  def h_=(newHour: Int)
  {
    if(newHour < 0 || newHour > 23)
      throw new IllegalArgumentException
    else
      hour = newHour
  } 
  
  def m_=(newMinute: Int)
  {
    if(newMinute < 0 || newMinute > 59)
      throw new IllegalArgumentException
    else
      minute = newMinute
  }
  
  def before(other: Time2):Boolean = 
  {
    (hour - other.h) match
    {
      case 0 => minute < other.m
      case _ => hour < other.h
    }
  }

  override def toString() = 
  {
    hour + ":" + minute;
  }
}

object Time2
{
  def apply(h: Int, m:Int) = new Time2(h, m);
}