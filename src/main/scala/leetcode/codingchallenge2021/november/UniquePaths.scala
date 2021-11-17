package leetcode.codingchallenge2021.november

object UniquePaths {
  def uniquePaths(_m: Int, _n: Int): Int = {
    val m = (_m max _n) - 1
    val n = (_m min _n) - 1
    (m + 1 to m + n).zip(1 to n).foldLeft(1L) { case (acc, (i, j)) => acc * i / j }.toInt
  }
}
