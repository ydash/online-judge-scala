package leetcode.codingchallenge2021.december

// 231. Power of Two
object P231 {
  def isPowerOfTwo(n: Int): Boolean = n > 0 && (n & (n - 1)) == 0
}
