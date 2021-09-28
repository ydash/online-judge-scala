package leetcode.codingchallenge2021.september

object SortArrayByParityII {
  def sortArrayByParityII(nums: Array[Int]): Array[Int] = {
    @scala.annotation.tailrec
    def sortInPlace(i: Int, evens: List[Int], odds: List[Int]): Unit = {
      if (i < nums.length) {
        if (i % 2 == 0 && nums(i) % 2 != 0) {
          evens match {
            case Nil => sortInPlace(i + 1, evens, i :: odds)
            case j :: rest =>
              swap(i, j)
              sortInPlace(i + 1, rest, odds)
          }
        } else if (i % 2 != 0 && nums(i) % 2 == 0) {
          odds match {
            case Nil => sortInPlace(i + 1, i :: evens, odds)
            case j :: rest =>
              swap(i, j)
              sortInPlace(i + 1, evens, rest)
          }
        } else sortInPlace(i + 1, evens, odds)
      }
    }
    def swap(i: Int, j: Int): Unit = {
      val tmp = nums(i)
      nums(i) = nums(j)
      nums(j) = tmp
    }
    sortInPlace(0, List(), List())
    nums
  }
}
