package leetcode.codingchallenge2022.jun

// 120. Triangle
object P120 {
  def minimumTotal(triangle: List[List[Int]]): Int = {
    val dp = triangle.last.toArray
    for (lst <- triangle.reverse.drop(1); (n, i) <- lst.zipWithIndex) {
      dp(i) = (dp(i) min dp(i + 1)) + n
    }
    dp(0)
  }
}
