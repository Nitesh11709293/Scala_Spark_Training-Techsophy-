

object OOP {
  class Employee(empId: Int, val deptId: Int, firstName: String) {

    /**
     * Auxiliary constructor - always have to call another auxiliary or primary constructor
     *
     * @param empId
     * @param firstName
     */

    def this(empId: Int, firstName: String) = {
      this(empId, 0, firstName)
    }

    def this(firstName: String) = {
      this(-1, firstName)
    }

    def printdeptId(): String = s"My department name is: $deptId"

    override def toString: String =
      s"Employee[empId=$empId,deptId=$deptId,firstName=$firstName]"
  }

  def main(args: Array[String]): Unit = {
    //    val deptId: Int = _deptId   // one way of using as a class member
    val emp1: Employee = new Employee(101, 11, "Rupali")
    emp1.deptId // class member
    println(emp1)
  }


  //  emp1.empId // is a constructor  parameter, but not class member , hence not accessible from object


}
