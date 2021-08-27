package leetcode.codingchallenge2021.august

object LongestUncommonSubsequenceII {

  @scala.annotation.tailrec
  def isSubsequenceOf(si: String, sj: String): Boolean = (si, sj) match {
    case ("", _) => true
    case (_, "") => false
    case _       => isSubsequenceOf(if (si.head == sj.head) si.tail else si, sj.tail)
  }

  def findLUSlength(strs: Array[String]): Int = {
    strs.sortInPlaceBy(-_.length)

    for (
      i <- strs.indices
      if strs.indices
        .filterNot(i == _)
        .forall(j => strs(i) != strs(j) && !isSubsequenceOf(strs(i), strs(j)))
    ) return strs(i).length

    -1
  }
}
