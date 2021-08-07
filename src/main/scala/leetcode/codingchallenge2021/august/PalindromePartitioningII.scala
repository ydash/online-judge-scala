package leetcode.codingchallenge2021.august

import scala.annotation.tailrec
import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

object PalindromePartitioningII {
  def minCut(s: String): Int = {
    val map = new mutable.HashMap[Int, ArrayBuffer[Int]]()
    for (p <- s.indices) {
      addIndicesOfPalindrome(s, p - 1, p + 1, map)
      addIndicesOfPalindrome(s, p, p + 1, map)
    }

    val dp = Array.fill(s.length)(0)
    for (i <- 1 until dp.length) {
      if (map.contains(i)) dp(i) = dp(i - 1) + 1 min map(i).map(j => if (j <= 0) 0 else dp(j - 1) + 1).min
      else dp(i) = dp(i - 1) + 1
    }

    dp.last
  }

  @tailrec
  def addIndicesOfPalindrome(str: String, left: Int, right: Int, map: mutable.HashMap[Int, ArrayBuffer[Int]]): Unit = {
    if (left >= 0 && right < str.length && str(left) == str(right)) {
      if (map.contains(right)) map(right) += left
      else map.put(right, ArrayBuffer(left))
      addIndicesOfPalindrome(str, left - 1, right + 1, map)
    }
  }
}
