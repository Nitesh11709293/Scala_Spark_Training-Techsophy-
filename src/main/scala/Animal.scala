package com.techsophy
package training

class  Animal {

  def eat(food:String):Unit = println(s"Eating: $food")

}

//Companion object - when class and object share the same name
object Animal{
  //static member - class level member
  val numberOfLegs = 4
}
