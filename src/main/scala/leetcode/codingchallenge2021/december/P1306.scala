package leetcode.codingchallenge2021.december

// 1306. Jump Game III
object P1306 {
  def canReach(arr: Array[Int], start: Int): Boolean = {
    def dfs(i: Int): Boolean =
      if (i < 0 || i >= arr.length || arr(i) < 0) false
      else {
        arr(i) = -arr(i)
        arr(i) == 0 || dfs(i - arr(i)) || dfs(i + arr(i))
      }

    dfs(start)
  }
}
