import scala.annotation.tailrec

object Practise1 extends App {

    // n = 10
    // 10 + 9 + 8 + 7 + .... + 1 (base condition)
    /**
     * Recursion - Uses stack frames
     *
     * findSum(10)
     * 10 + findSum(9)
     * 10 + 9 + findSum(8)
     * 10 + 9 + 8 + findSum(7)
     * 10 + 9 + 8.... + findSum(1)
     * 10 + 9 + 8.... + 1
     */
    def findSum(num: Long): Long = {
      if (num == 1) 1 // base condition
      else num + findSum(num-1)
    }

    /**
     * Recursion - Uses stack frames
     *
     * factorial_v1(10)
     * 10 * factorial_v1(9)
     * 10 * 9 * factorial_v1(8)
     * 10 * 9 * 8 * factorial_v1(7)
     * 10 * 9 * 8.... * factorial_v1(1)
     * 10 * 9 * 8.... * 1
     */
    def factorial_v1(num: BigInt): BigInt = {
      if (num <= 0) 1
      else num * factorial_v1(num-1)
    }

    /**
     * Tail Recursion - Uses single stack frame only
     * Scala compiler converts the tail-recursive methods into a while loop.
     *
     * factorial_v1(10, 1)
     * factorial_v1(9, 10 * 1)
     * factorial_v1(8, 10 * 9 * 1)
     * factorial_v1(7, 10 * 9 * 8 * 1)
     * factorial_v1(1, 10 * 9 * 8...* 1)
     * 10 * 9 * 8... * 1
     */
    @tailrec def factorial_v2(num: BigInt, acc: BigInt): BigInt = {
      if (num <= 0) acc
      else factorial_v2(num-1, acc * num)
    }

    def factorial(num: BigInt): BigInt = {
      @tailrec def inner(num: BigInt, acc: BigInt): BigInt = {
        if (num <= 0) acc
        else inner(num - 1, acc * num)
      }

      inner(num, 1)
    }

//    println(factorial(10000))

  def fibo_v1(length: Int): Int = {
    if (length ==0 ) 0
    else if (length == 1 || length==2) 1
    else fibo_v1(length - 1)+fibo_v1(length-2)
  }

  var series_length=10;
  println("Fibonacci Series upto length : " + series_length);
  for (w <- 0 until series_length) {
    print(fibo_v1(w)+ " ");
  }


  @tailrec def fibo_v2(num: Int, acc1: Int, acc2: Int): Int = {
    if (num <= 0) acc2
    else fibo_v2(num - 1, acc1=acc1+acc2,acc2 =acc1)
  }
  println()
  println("Version2")
  println(fibo_v2(10,1,0))

  for (w <- 0 until series_length) {
    print(fibo_v2(w,1,0) + " ");
  }


  var k=5
  var m=k;
  var factorial_result=1;
  while(k>0)
    {
       factorial_result=factorial_result*k;
       k=k-1;
    }

  println()

  println("Factorial of " +m + " is : " + factorial_result)


  @tailrec
  private def findLastElement[A](ls: List[A]): A = ls match {
    case h :: Nil => h
    case _ :: tail => findLastElement(tail)
    case _ => throw new NoSuchElementException
  }
  println(findLastElement(List(1, 1, 2, 3, 5, 6)));


}
