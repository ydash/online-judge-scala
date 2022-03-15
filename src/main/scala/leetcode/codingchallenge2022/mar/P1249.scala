package leetcode.codingchallenge2022.mar

// 1249. Minimum Remove to Make Valid Parentheses
object P1249 {

  def minRemoveToMakeValid(s: String): String = {
    val lst = collection.mutable.ListBuffer[Int]()
    for (i <- s.indices) {
      if (s(i) == '(') {
        lst += i
      } else if (s(i) == ')') {
        if (lst.isEmpty || s(lst.last) != '(') lst += i
        else lst.dropRightInPlace(1)
      }
    }
    val set = lst.toSet
    val buffer = new StringBuilder()
    for (i <- s.indices if !set.contains(i)) buffer += s(i)
    buffer.toString()
  }
}
