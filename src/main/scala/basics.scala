package com.techsophy
package training

object basics {

  def main(args : Array[String]): Unit = {
     /*Two variable -
    --variable = var
    --values = val (not changeable)*/
    var x :Int = 10
    x = 20
    val y =  10
//    y= 20 // this will not work

    //Instruction
    var a :Int= 100
    if(15 > 20)
      {
        a -= 10;
      }
    else
      {
        a += 10;
      }

    //Expression
    val a1 = 100;
    val b1 : Int = if(15 < 20) a+10 else a1 -10
    println(b1:Int) // Error -- if we use var a and assign in b1

    // Loops - while, for, do-while
    var i : Int =  0;
    while(i < 10){
      println("While:- The value of i is :"+i)
      i += 1;
    }

    // for loop

    for(i <- 0 to 10)
      {
        println("For :- The value of i is :"+i)
      }
      calculate(5,10)

    // string interpolation
    val abc: Int = 10;
    println(s"The values of abc is : ${abc}")

    /**
     * Refrential transparency
     * - I can replace the method with certain sets of input with the resultant value
     * and the program will still be accurate
     * */

    def sum(x: Int, y: Int): Int =  x + y

    sum(5,10)
    15

    //Not a refrential transparency fxn
    def generatedId(): String = java.util.UUID.randomUUID().toString
    println(generatedId())

    /**
     * (1)Write a function which accepts an integer and returns whether it is even or odd
     * (2)find factorial of a number using while loop
     * (3)Given a number, check whether it is prime or not
     * (4)Given a number, check whether it is palindrome or not
     * (5)Create a calculator which two double values and can do -
     *   (i) Basic  +, - , division
     *   (ii) Delta value and then find the absolute value
     *   (iii) Divide x/y then return the integer part of the division
     *   (iv) Return remainder of x/y
     */



  }

  //Methods or functions
  def calculate(x: Int, y: Int): Int = {
    val z = x + y;
    println(s"Summing $x and $y is: $z")
    z
  }



}
