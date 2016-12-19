package cw

class Time3(private var minute: Int)
{
  if(minute < 0 || minute > 1439)
    throw new IllegalArgumentException
    
  def this(h:Int, m:Int)
  {
    this(h*60 + m)
  }
  
  def m: Int = minute
  
  def m_=(newMinute: Int)
  {
    if(newMinute < 0 || newMinute > 1439)
      throw new IllegalArgumentException
    else
      minute = newMinute
  }
  
  def before(other: Time3):Boolean = 
  {
      minute < other.m
  }

  override def toString() = 
  {
    minute/60 + ":" + minute%60;
  }
}

object Time3
{
  def apply(m:Int) = new Time3(m);
  def apply(h: Int, m:Int) = new Time3(h*60 + m);
}