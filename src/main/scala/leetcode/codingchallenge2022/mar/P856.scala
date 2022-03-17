package leetcode.codingchallenge2022.mar

// 856. Score of Parentheses
object P856 {
  def scoreOfParentheses(s: String): Int = s.indices
    .foldLeft((1, 0)) { case ((score, sum), i) =>
      val updatedScore = if (s(i) == '(') score << 1 else score >> 1
      (updatedScore, if (s(i) == '(' && s(i + 1) == ')') sum + (updatedScore >> 1) else sum)
    }
    ._2
}
