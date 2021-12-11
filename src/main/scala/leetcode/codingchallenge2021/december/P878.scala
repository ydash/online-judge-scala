package leetcode.codingchallenge2021.december

// 878. Nth Magical Number
object P878 {
  def nthMagicalNumber(n: Int, a: Int, b: Int): Int =
    if (a > b) nthMagicalNumber(n, b, a)
    else {
      val c = lcm(a, b)
      @scala.annotation.tailrec
      def binSearch(left: Long, right: Long): Int =
        if (left > right) (left % (1e9 + 7).toInt).toInt
        else {
          val m = (left + right) / 2
          val count = m / a + m / b - m / c
          if (count < n) binSearch(m + 1, right)
          else binSearch(left, m - 1)
        }
      binSearch(a, a.toLong * n)
    }

  @scala.annotation.tailrec
  private def gcd(a: Int, b: Int): Int =
    if (b == 0) a
    else gcd(b, a % b)

  private def lcm(a: Int, b: Int): Int = (a * b) / gcd(a, b)
}
