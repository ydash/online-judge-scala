package leetcode.codingchallenge2022.may

// 29. Divide Two Integers
object P29 {
  def divide(dividend: Int, divisor: Int): Int =
    if (dividend == Int.MinValue && divisor == -1) Int.MaxValue
    else {
      var a = dividend.abs
      val b = divisor.abs
      var res = 0
      for (i <- (0 to 31).reverse if (a >>> i) - b >= 0) {
        res += 1 << i
        a -= b << i
      }
      val sign = if (dividend < 0 == divisor < 0) 1 else -1
      sign * res
    }
}
