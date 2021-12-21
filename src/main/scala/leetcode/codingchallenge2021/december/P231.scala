package leetcode.codingchallenge2021.december

// 231. Power of Two
object P231 {
  def isPowerOfTwo(n: Int): Boolean = {
    def powOfTwo(x: Long = 1): LazyList[Long] = x #:: powOfTwo(x << 1)
    powOfTwo().dropWhile(_ < n).head == n
  }
}
