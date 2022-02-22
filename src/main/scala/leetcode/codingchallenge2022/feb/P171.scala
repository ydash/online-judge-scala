package leetcode.codingchallenge2022.feb

// 171. Excel Sheet Column Number
object P171 {
  def titleToNumber(columnTitle: String): Int =
    columnTitle
      .foldRight((0, 1)) { case (c, (acc, base)) =>
        (acc + (c - 'A' + 1) * base, base * 26)
      }
      ._1
}
