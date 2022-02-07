package leetcode.codingchallenge2022.feb

// 389. Find the Difference
object P389 {
  def findTheDifference(s: String, t: String): Char = (t.sum - s.sum).toChar
}
