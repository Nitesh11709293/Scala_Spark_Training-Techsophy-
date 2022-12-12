package com.techsophy
package training.practice

object Calculator {
  def main(args:Array[String]):Unit={
    val num1:Double = scala.io.StdIn.readDouble()
    val num2:Double = scala.io.StdIn.readDouble()

    println("Enter : \n 1. Add \n 2. Subtract \n 3. Multiply \n 4. Division \n 5. Remainder \n 6. Division with integer part \n 7. delta subtraction ")
    var input_number: Int = scala.io.StdIn.readInt();
    while(input_number > 7 ) {
      println("You have entered invalid number , Enter again :")
      input_number = scala.io.StdIn.readInt();
    }
    while (input_number != -1)
    {
      if (input_number == 1) {
        println("Addition is :" + (num1 + num2))
      }
      else if (input_number == 2) {
        println("Subtraction is : " + (num1-num2))
      }
      else if (input_number == 3) {
        println("Multiplication is:" + (num1 * num2))
      }
      else if(input_number == 4){
        println("Division is:" + (num1 / num2))
      }
      else if(input_number == 5)  {
        println("Remainder is:" + (num1 % num2))
      }
      else if(input_number == 6)
      {
        println("Division with Integer part is:"+(num1/num2).floor)
      }
      else if(input_number == 7)
      {
        println("Delta substraction is:"+(num1 - num2).abs)
      }
      else {
        println("Invalid number, enter -1 if you want to exit :")
      }
      input_number =  scala.io.StdIn.readInt()
    }
  }

}

