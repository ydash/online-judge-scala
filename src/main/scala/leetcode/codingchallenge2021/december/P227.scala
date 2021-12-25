package leetcode.codingchallenge2021.december

object P227 {
  def calculate(s: String): Int = {
    var stack: List[Int] = Nil
    var op: Option[Char] = None

    var i = s.indexWhere(_ != ' ')
    while (i < s.length) {
      var num = 0
      if (('0' to '9') contains s(i)) {
        while (i < s.length && ('0' to '9').contains(s(i))) {
          num = num * 10 + s(i).asDigit
          i += 1
        }
        op match {
          case None      => ()
          case Some('-') => num = -num
          case Some('*') => num = stack.head * num; stack = stack.tail
          case Some('/') => num = stack.head / num; stack = stack.tail
          case _         => ()
        }
        stack = num :: stack
      } else {
        op = Option(s(i))
        i += 1
      }
      while (i < s.length && s(i) == ' ') i += 1
    }

    stack.sum
  }
}
