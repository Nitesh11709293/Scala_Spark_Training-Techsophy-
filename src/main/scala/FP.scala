package com.techsophy
package training

object FP extends App {

  /**
   * 1. High order function - can accept another functio as input parameter OR can return another functions
   */

  def transform(x: Int, f: Int => Int): Int = f(x)

  def combine(x: Int, y: Int, f: (Int, Int) => String): String = f(x, y)

  val squareFxn = (v1: Int) => v1 * v1
  val multiplyFxn = (v1: Int, v2: Int) => s"$v1 * $v2 = ${v1 * v2}"

  println(transform(10, squareFxn))
  println(combine(10, 20, multiplyFxn))

  /**
   * Calculator - sum, divide, multiply, subtract
   */

  def calculator(v1: Int, v2: Int, inputFxn: String) =
    if (inputFxn == "+") v1 + v2
    else if (inputFxn == "-") v1 - v2
    else if (inputFxn == "/") v1 / v2
    else if (inputFxn == "*") v1 * v2

  println(calculator(10,20,"/"))
  def calculater_v2(v1:Int,v2:Int,f:(Int,Int) => Int ):Int = f(v1,v2)

  /**
   * 2. Partial function - accepts subset of the range of possible values
   */

  def fun(x:Int):Double = ???

//  val pf =  new PartialFunction[Int,Double] {
//    override def isDefinedAt(x: Int): Boolean =
//      x == 1|| x == 2 || x == 3|| x == 4|| x ==5
//
//    override def apply(v1: Int): Double = {
//      if(v1 == 1) 100.0
//      else if(v1 == 2) 200.0
//      else if(v1 ==3) 300.0
//      else if(v1 ==4) 400.0
//      else if(v1 == 5) 500.0
//    }
//  }

  val pf_2 :PartialFunction[Int,Double] = {
    case 1 => 100.0
    case 2 => 200.0
    case 3 => 300.0
    case 4 => 400.0
    case 5 => 500.0
    case x if x % 2 == 0 => -2.0
    case x if x % 2 != 0 => -1.0
  }


  println(pf_2(2))
  println(pf_2(4))
  println(pf_2(6)) // To run this use it --
  //this
  if (pf_2.isDefinedAt(6)) println(pf_2(6)) else println(pf_2(1))

  println(pf_2(6))
  println(pf_2(7))


}
