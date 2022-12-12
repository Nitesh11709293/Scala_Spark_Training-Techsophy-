

object inheritance {
  /**
   * Tester inherits the member from employee class.
   *
   * Access modifier -
   * - Private - No One can access
   * - Protected - if we make it protected then only child class can access it but not the object
   * - Public - AnyOne Can Access it
   *
   * - final -
   *  - if defined on members cannot be overridden
   *  - if defined on class then no class can inherit or cannot be extended
   */
  class Employee {
    val number:Int = 100
    def getSalary(): Boolean = true //If we make it private then not even child nor object will be able to access its value

    //if we make it protected then only child class can access it but not the object
    def calculateSalary(): Double =
      if (getSalary(): Boolean) 1000 else 0
  }

  class Tester extends Employee { // cannot extend more than one class because multiple inheritance is not supported
    def haveIRecievedMySalary(): Boolean = getSalary()
    override val number :Int =  101

    /**
     * Method Overriding
     *
     * Super keyword refers to the immediate parent
     */

    //    override def calculateSalary(): Double = 20000
    override def calculateSalary(): Double = {
      super.calculateSalary() + 11000
    }

  }

  def main(args: Array[String]): Unit = {
    new Tester().getSalary()
    println(new Tester().calculateSalary())
  }

}
