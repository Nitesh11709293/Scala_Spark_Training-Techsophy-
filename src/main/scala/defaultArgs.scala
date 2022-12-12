package com.techsophy
package training

object defaultArgs {
  class Employee(name:String,deptId:Int = 0,empId:Int = -1)

  val emp1:Employee = new Employee(empId = 101,name= "Tester") //Named Arguments

}
