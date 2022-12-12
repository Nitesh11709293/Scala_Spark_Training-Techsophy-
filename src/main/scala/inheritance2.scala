package com.techsophy
package training

object inheritance2 {

  class Employee{
    def getId:Int = 45
  }

  class Tester extends Employee
  class Developer extends Employee

  def calculateSalary(employee: Employee):Double = ???

  val tester = new Tester()
  val developer = new Developer()

//  def main(args:Array[String]):Unit={
    calculateSalary(tester)
    calculateSalary(developer)
    calculateSalary(new Employee())
//  }

  /**
   * Abstract class
   * - can have both abstract and concrete method
   * - Is-A relationship
   * - can extend single abstract class
   * - can have constructor parameter
   * - can never be instantiated
   */

  abstract class Employee_v2{
    def getId:Int // abstract method
    def getCompanyName:String = "Techsophy"
  }

  class Developer_v2 extends Employee_v2{
    override def getId: Int = 1000
  }

  /**
   * traits --
   * - Can have both abstract and concrete methods
   * - Has-A Relationship
   * - They are mostly define when we have some property
   * - Can implement any number of traits with with keyword
   * - Doesn't have constructor
   * - can never be instantiated
   */

  trait  Employee_v3 {
    def getId: Int // abstract method

    def getCompanyName: String = "Techsophy"
  }

  trait canCode{
    def writeCode():String
  }

  class Developer_v3 extends Employee_v3 with canCode {
    override def getId: Int = 1000

    override def writeCode(): String = "Developer writing code"
  }



}
