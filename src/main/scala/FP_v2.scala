package com.techsophy
package training

import com.sun.scenario.effect.Offset

object FP_v2 extends App{

  //Partially applied function
  def productWithOffset(offset: Int, x:Int,y:Double):Double = offset + x * y

  val product:(Int,Double) => Double = productWithOffset(100,_,_)

  productWithOffset(100,5,10)

  //CURRYING FUNCTION - chain of functions / parameters such that they applied one after the other

  def productWithOffsetCurried(offset: Int)(x:Int, y:Double):Double= offset + x * y

//  val withOffSetOnly :(Int,Double) => Double => Double = productWithOffsetCurried(100)
//  val withProductTerms :Double= withOffSetOnly(10,5.0)

}
