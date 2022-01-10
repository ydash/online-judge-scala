package leetcode.codingchallenge2022.jan

// 67. Add Binary
object P67 {
  def addBinary(a: String, b: String): String = {
    val sb = new StringBuilder()
    var carry = 0
    for (i <- 0 until (a.length max b.length)) {
      val x = a.lift(a.length - i - 1).map(_.asDigit).getOrElse(0)
      val y = b.lift(b.length - i - 1).map(_.asDigit).getOrElse(0)
      val sum = x + y + carry
      carry = sum / 2
      sb += (sum % 2 + '0').toChar
    }
    if (carry == 1) sb += '1'
    sb.reverseInPlace()
    sb.toString()
  }
}
