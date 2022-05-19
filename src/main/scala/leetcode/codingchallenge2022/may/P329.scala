package leetcode.codingchallenge2022.may

// 329. Longest Increasing Path in a Matrix
object P329 {
  def longestIncreasingPath(matrix: Array[Array[Int]]): Int = {
    val m = matrix.length
    val n = matrix.head.length
    val cache = Array.fill(m)(Array.fill(n)(0))
    def dfs(i: Int, j: Int, prev: Int): Int = {
      if (i < 0 || i >= m || j < 0 || j >= n || prev >= matrix(i)(j)) 0
      else if (cache(i)(j) > 0) cache(i)(j)
      else {
        val len = 1 + (dfs(i - 1, j, matrix(i)(j)) max
          dfs(i, j - 1, matrix(i)(j)) max
          dfs(i, j + 1, matrix(i)(j)) max
          dfs(i + 1, j, matrix(i)(j)))
        cache(i)(j) = len
        len
      }
    }
    val (x, y) = (for (i <- 0 until m; j <- 0 until n) yield (i, j)).maxBy { case (i, j) => dfs(i, j, -1) }
    cache(x)(y)
  }
}
