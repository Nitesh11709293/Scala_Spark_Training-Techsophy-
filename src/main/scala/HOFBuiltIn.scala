

import scala.Console.println
import scala.collection.mutable
import scala.util.{Success, Try}

object HOFBuiltIn extends App{
  val list = List(1,2,3,4)
//  mutable.ListBuffer()
  val multiplier = new Function[Int,Double] {
    override def apply(v1: Int): Double = v1 * 10.5
  }

  println(list.map(v1 => v1 * 10.5))

  println(list.map(multiplier))

  println(list.flatMap( v1 => List(v1,v1 + 1)))

  println(list.filter(v1 => if(v1 % 2 == 0 )true else false))
  println(list.filter(v1 => v1 % 2 == 0))
  println(list.reduce((v1,v2) => v1 + v2))
  println(list.reduce(_+_))
  println(list.reduce((v1,v2) => v1 - v2))

  println(list.foldLeft("hello_")((v1:String,v2:Int) => v1 + v2 + "_"))
  println(list.foldRight("hello_")((v1:Int,v2:String) => v1 + v2 + "_"))

  //OPTIONS
  val optionValue:Option[Int] = None
  println(optionValue.map(x => x * 10))
  println(optionValue.flatMap(x => Some( x * 10)))
  println(optionValue.filter(x => x % 2 == 0))

  val optionValue1: Option[Int] = Some(5)
  println(optionValue1.map(x => x * 10))
  println(optionValue1.flatMap(x => Some(x * 10)))
  println(optionValue1.filter(x => x % 2 == 0))

  val optionValue2: Try[Int] = Success(5)
  println(optionValue2.map(x => x * 10))
  println(optionValue2.flatMap(x => Success(x * 10)))
  println(optionValue2.filter(x => x % 2 == 0))

  def someFxn():Double= ???
  def factorial(x:Int):Int = {
    if(x  <= 0) 1
    else ???
  }


}
