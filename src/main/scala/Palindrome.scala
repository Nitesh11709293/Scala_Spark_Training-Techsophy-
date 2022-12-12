

//Given a number, check whether it is palindrome or not

object Palindrome {
  def main(args:Array[String]):Unit= {
    var num = scala.io.StdIn.readInt();
    var checkNum:Int = num
    var pal: Int = 0;
    while(num != 0)
    {
      var rem:Int = num % 10
      pal = pal * 10 + rem
      num = num / 10
    }

    println(pal)
    var isPalindrome : String = if(pal == checkNum) s"Given ${checkNum} is Palindrome" else s"Given ${checkNum} is not Palindrome"
    println(isPalindrome)
  }
}
