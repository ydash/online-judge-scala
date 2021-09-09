package leetcode.codingchallenge2021.september

object LargestPlusSign {
  def orderOfLargestPlusSign(n: Int, mines: Array[Array[Int]]): Int = {
    val dp = Array.fill(n)(Array.fill(n)(n))

    for (Array(x, y) <- mines) {
      dp(x)(y) = 0
    }

    for (i <- 0 until n) {
      var u, d, l, r = 0
      for (j <- 0 until n; k = n - j - 1) {
        dp(j)(i) = dp(j)(i) min { u = if (dp(j)(i) == 0) 0 else u + 1; u }
        dp(k)(i) = dp(k)(i) min { d = if (dp(k)(i) == 0) 0 else d + 1; d }
        dp(i)(j) = dp(i)(j) min { l = if (dp(i)(j) == 0) 0 else l + 1; l }
        dp(i)(k) = dp(i)(k) min { r = if (dp(i)(k) == 0) 0 else r + 1; r }
      }
    }

    var res = 0
    for (i <- 0 until n; j <- 0 until n) res = res max dp(i)(j)
    res
  }
}
