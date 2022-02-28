package leetcode.codingchallenge2022.feb

// 228. Summary Ranges
object P228 {
  def summaryRanges(nums: Array[Int]): List[String] = {
    @scala.annotation.tailrec
    def summary(i: Int, acc: List[Range]): List[String] =
      if (i >= nums.length)
        acc.reverse.map { range =>
          if (range.start == range.end) range.start.toString
          else s"${range.start}->${range.end}"
        }
      else {
        acc match {
          case Nil  =>
            summary(i + 1, (nums(i) to nums(i)) :: acc)
          case range :: _ if range.end + 1 != nums(i) =>
            summary(i + 1, (nums(i) to nums(i)) :: acc)
          case range :: rest =>
            summary(i + 1, (range.start to nums(i)) :: rest)
        }
      }
    summary(0, Nil)
  }
}
