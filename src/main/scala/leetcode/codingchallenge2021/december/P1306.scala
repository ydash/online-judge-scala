package leetcode.codingchallenge2021.december

// 1306. Jump Game III
object P1306 {
  def canReach(arr: Array[Int], start: Int): Boolean = {
    val visited = new Array[Boolean](arr.length)
    def dfs(i: Int): Boolean =
      if (i < 0 || i >= arr.length || visited(i)) false
      else if (arr(i) == 0) true
      else {
        visited(i) = true
        dfs(i - arr(i)) || dfs(i + arr(i))
      }

    dfs(start)
  }
}
