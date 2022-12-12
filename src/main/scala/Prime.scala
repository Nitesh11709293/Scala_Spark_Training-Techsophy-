
//Given a number, check whether it is prime or not
object Prime {
  def main(args:Array[String]):Unit={
    var num = scala.io.StdIn.readInt();
    var res : String = ""

    for(i <- 2 to  num / 2)
    {
      res =  if(num % i == 0) "not prime" else ""
    }
    res = if (res != "not prime") "prime" else "not prime"
    println(res)
  }
}
