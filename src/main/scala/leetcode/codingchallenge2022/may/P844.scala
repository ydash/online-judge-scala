package leetcode.codingchallenge2022.may

// 844. Backspace String Compare
object P844 {
  def backspaceCompare(s: String, t: String): Boolean = {
    @scala.annotation.tailrec
    def backspacing(str: String, i: Int, numOfBackspace: Int = 0): Int = {
      if (i >= 0 && str(i) == '#') backspacing(str, i - 1, numOfBackspace + 1)
      else if (i >= 0 && numOfBackspace > 0) backspacing(str, i - 1, numOfBackspace - 1)
      else i
    }
    var i = s.length - 1
    var j = t.length - 1
    while (i >= 0 || j >= 0) {
      i = backspacing(s, i)
      j = backspacing(t, j)
      if (s.lift(i).getOrElse('?') == t.lift(j).getOrElse('?')) {
        i -= 1
        j -= 1
      } else {
        return false
      }
    }
    true
  }
}
