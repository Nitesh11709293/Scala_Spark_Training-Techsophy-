package problems

object AddWithoutOperator extends App{

  def Add_v1(x : Int, y :Int): Int ={
    if(y==0) x
    else
      {
        Add_v1(x^y, (x&y) <<1)
      }
  }
  println(Add_v1(100,20))

}
