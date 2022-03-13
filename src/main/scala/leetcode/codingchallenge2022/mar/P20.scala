package leetcode.codingchallenge2022.mar

// 20. Valid Parentheses
object P20 {
  def isValid(s: String): Boolean = {
    var stack: List[Char] = Nil
    for (c <- s) {
      c match {
        case ')' | '}' | ']' =>
          if (stack.headOption.fold(false)(isPair(_, c))) stack = stack.tail
          else return false
        case _ => stack = c :: stack
      }
    }
    stack.isEmpty
  }

  private def isPair(op: Char, close: Char): Boolean =
    (op == '(' && close == ')') || (op == '{' && close == '}') || (op == '[' && close == ']')
}
