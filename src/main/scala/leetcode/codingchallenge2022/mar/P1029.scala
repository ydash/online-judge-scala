package leetcode.codingchallenge2022.mar

// 1029. Two City Scheduling
object P1029 {
  def twoCitySchedCost(costs: Array[Array[Int]]): Int = {
    val n = costs.length / 2
    val dp = new Array[Int](n + 1)
    for (i <- 0 to n; j <- 0 to n) {
      if (i == 0 && j == 0) dp(j) = 0
      else if (i == 0) dp(j) = dp(j - 1) + costs(j - 1)(1)
      else if (j == 0) dp(j) = dp(j) + costs(i - 1)(0)
      else dp(j) = dp(j) + costs(i + j - 1)(0) min dp(j - 1) + costs(i + j - 1)(1)
    }
    dp(n)
  }
}
