package leetcode.codingchallenge2022.mar

// 1663. Smallest String With A Given Numeric Value
object P1663 {
  def getSmallestString(n: Int, k: Int): String = {
    val buffer = new StringBuilder()
    var sum = 0
    for (i <- 1 to n) {
      val rest = k - sum - 26 * (n - i)
      if (rest <= 0) {
        buffer += 'a'
        sum += 1
      } else {
        val c = ('a' + rest - 1).toChar
        buffer += c
        sum += (c - 'a' + 1)
      }
    }
    buffer.result()
  }
}
