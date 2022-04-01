package leetcode.codingchallenge2022.apr

// 344. Reverse String
object P344 {
  def reverseString(s: Array[Char]): Unit = {
    for (i <- 0 until s.length / 2) {
      val tmp = s(i)
      val j = s.length - i - 1
      s(i) = s(j)
      s(j) = tmp
    }
  }
}
