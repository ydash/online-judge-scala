package leetcode.codingchallenge2022.may

// 474. Ones and Zeroes
object P474 {
  def findMaxForm(strs: Array[String], m: Int, n: Int): Int = {
    def count(str: String): (Int, Int) = str.foldLeft(0 -> 0) { case ((z, o), c) =>
      if (c == '0') (z + 1, o) else (z, o + 1)
    }
    val dp = Array.ofDim[Int](m + 1, n + 1)
    for (str <- strs) {
      val (z, o) = count(str)
      for (i <- (z to m).reverse; j <- (o to n).reverse) {
        dp(i)(j) = dp(i)(j) max dp(i - z)(j - o) + 1
      }
    }
    dp(m)(n)
  }
}
