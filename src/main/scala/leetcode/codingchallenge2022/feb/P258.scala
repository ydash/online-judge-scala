package leetcode.codingchallenge2022.feb

// 258. Add Digits
object P258 {
  def addDigits(num: Int): Int = {
    var current = num
    var next = 0
    while (current >= 10) {
      while (current > 0) {
        next += current % 10
        current /= 10
      }
      current = next
      next = 0
    }
    current
  }
}
