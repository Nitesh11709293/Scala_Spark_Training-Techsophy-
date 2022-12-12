package com.techsophy
package training

import java.lang
import scala.::
import scala.util.{Failure, Success, Try}

object Generics extends App{

  //space complexity

  class MyList[T]{ //Type-class
    def addElement(elem:T):MyList[T] = ???
  }

  class Employee

  new MyList[Int]().addElement(10)
  new MyList[String]().addElement("Hello").addElement("String")
  new MyList[Employee]().addElement(new Employee)

  List(1,2,3) //add element 4

  val original :List[Int] =List(1,2,3)
  val adding:List[Int] = 4 :: original

  //NullPointer exception -null -> Option(potentially empty)
  val employee :Employee = null

  val employee_better :Option[Employee] = None
  val employee_present :Option[Employee] = Some(new Employee)

//  val x:Employee = employee_better.get // Not a good practise

  val tryEmployee:Try[Employee] = Failure(new UnsupportedOperationException)
  var sucessEmployee :Try[Employee] = Success(new Employee)

  val leftEmployee :Either[String,Employee] =  Left("Employee doesn't exits")
  val rightEmployee :Either[String,Employee] = Right(new Employee)


  //For example

  def divide(x:Int, y:Int):Try[Int] ={
    if(y == 0) Failure(new IllegalArgumentException("Denominator should not be zero"))
    else Success(x/y)
  }

  println(s"Division result is : ${divide(10,0)}")




}
