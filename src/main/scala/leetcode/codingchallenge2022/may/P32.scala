package leetcode.codingchallenge2022.may

// 32. Longest Valid Parentheses
object P32 {
  def longestValidParentheses(s: String): Int = {
    val stack = collection.mutable.Stack[Int]()
    for (i <- s.indices) {
      if (s(i) == '(' || stack.isEmpty || s(stack.head) == ')') stack.push(i)
      else stack.pop()
    }
    var result = 0
    var i = s.length
    while (stack.nonEmpty) {
      val j = stack.pop()
      result = result max (i - j - 1)
      i = j
    }
    result max i
  }
}
