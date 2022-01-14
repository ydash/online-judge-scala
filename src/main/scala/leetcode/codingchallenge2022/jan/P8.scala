package leetcode.codingchallenge2022.jan

// 8. String to Integer (atoi)
object P8 {
  def myAtoi(s: String): Int = {
    var i = s.indexWhere(_ != ' ')
    if (i == -1) return 0
    val sign = if (s(i) == '-') -1 else 1
    if (Seq('+', '-') contains s(i)) i += 1
    var acc = 0L
    while (i < s.length && s(i).isDigit && acc <= Int.MaxValue) {
      acc = acc * 10 + s(i).asDigit
      i += 1
    }
    ((sign * acc max Int.MinValue) min Int.MaxValue).toInt
  }
}
