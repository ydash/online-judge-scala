package leetcode.codingchallenge2021.december

object P227 {
  def calculate(s: String): Int = {
    var result: Int = 0
    var acc: Int = 0
    var op = '+'

    var i = s.indexWhere(_ != ' ')
    while (i < s.length) {
      var num = 0
      if (('0' to '9') contains s(i)) {
        while (i < s.length && ('0' to '9').contains(s(i))) {
          num = num * 10 + s(i).asDigit
          i += 1
        }
        op match {
          case '+' => result = result + acc; acc = num
          case '-' => result = result + acc; acc = -num
          case '*' => acc = acc * num
          case '/' => acc = acc / num
          case _   => ()
        }
      } else {
        op = s(i)
        i += 1
      }
      while (i < s.length && s(i) == ' ') i += 1
    }

    result + acc
  }
}
