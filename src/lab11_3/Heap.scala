package lab11_3

trait Heap
{
  def insert(elem: Int)
  def top(): Int
  def pop(): Int
  def check(elem: Int): Boolean
}