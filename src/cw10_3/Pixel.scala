package cw10_3

import java.awt.Color
class Pixel(
xp:Double=0.0,
yp:Double=0.0,
var color:Color = Color.BLACK
) extends Point(xp, yp) {
override def toString = super.toString + " " + color
}