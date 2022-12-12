package com.techsophy
package training

//Partially applied function
object PAFs extends App{
  def fun(x:Int, y:Int):Int = ???
  val x:Int => Int = fun(5,_)

  def fun_v2(x:Int)(y:Int):Int = ???
  val y: Int => Int = fun_v2(5)

  def product(x:Int,y:Int,conn:String):Unit = ???

  def product_v2(x:Int,y:Int)(conn:String):Unit = ???


}
