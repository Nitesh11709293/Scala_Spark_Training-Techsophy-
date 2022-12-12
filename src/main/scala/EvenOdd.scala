package com.techsophy
package training.practice

//Write a function which accepts an integer and returns whether it is even or odd

object EvenOdd {
  def main(args: Array[String]):Unit = {
    val number = scala.io.StdIn.readInt()

    var checkInput:String = if(number % 2 == 0) "even" else "odd";
    println("Input number is "+checkInput)

    // even and odd list
    val nums = List(1,2,3,4,5,6,7,8,9,10,11,12,13)
    println("List of numbers :"+nums)
    val even_nums = nums.filter(_ % 2 == 0);
    val odd_nums =  nums.filter(_ % 2 != 0);
    println("Even number are :"+even_nums)
    println("Odd number are :"+odd_nums)

  }

}
