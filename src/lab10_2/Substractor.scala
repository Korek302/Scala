package lab10_2

class Substractor(value:Operand) extends Operator(value:Operand)
{
  def operation = value.getArg1-value.getArg2
}