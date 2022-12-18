
import scala.annotation.tailrec
object BinarySearch{

//  def binarySearch(list: List[Int], searchElem: Int): Boolean ={
//
//    @tailrec
//    def searchFunction(list: List[Int], searchElem: Int, start: Int, end: Int): Boolean = {
//      if(start> end) return false
//      val mid=start + end / 2
//      list(mid) match {
//        case i if (i == searchElem) => true
//        case i if (i > searchElem) => searchFunction(list, searchElem,start,mid-1)
//        case _ => searchFunction(list, searchElem, mid + 1, end)
//      }
//      searchFunction(list, searchElem, 0, list.length-1)
//    }
//  }

  private def binarySearch(list: List[Int],searchElem: Int): Boolean = {

    @tailrec
    def searchElement(list: List[Int],searchElem: Int,start: Int, end: Int): Boolean =
      if (end < start) false
      else {
        val mid = (start + end) / 2
        if (searchElem == (list(mid))) true
        else if (searchElem < list(mid))
          searchElement(list,searchElem,start, mid - 1)
        else searchElement(list,searchElem,mid + 1, end)
      }

    searchElement(list,searchElem,0, list.length - 1)
  }

  def main(args: Array[String]) {
    val list1: List[Int] = List(10,22,43,2,56,79);
    val list2: List[Int] = List.empty;
    val searchKey = 22;

    if(binarySearch(list1,searchKey)) println("The element "+ searchKey + " is present in the list")
    else println("The element "+ searchKey + " is not present in the list")


  }

}
