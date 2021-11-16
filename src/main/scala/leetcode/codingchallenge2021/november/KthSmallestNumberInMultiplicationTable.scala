package leetcode.codingchallenge2021.november

object KthSmallestNumberInMultiplicationTable {
  def findKthNumber(m: Int, n: Int, k: Int): Int = {
    def count(x: Int): Int = (1 to m).foldLeft(0)((acc, i) => acc + ((x / i) min n))

    var l, ans = 0
    var r = m * n
    while (l <= r) {
      val mid = (l + r) / 2
      if (count(mid) < k) l = mid + 1
      else {
        r = mid - 1
        ans = mid
      }
    }
    ans
  }
}
