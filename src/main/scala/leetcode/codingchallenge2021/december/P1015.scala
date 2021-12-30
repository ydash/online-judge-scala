package leetcode.codingchallenge2021.december

// 1015. Smallest Integer Divisible by K
object P1015 {
  def smallestRepunitDivByK(k: Int): Int =
    if (k % 2 == 0 || k % 5 == 0) -1
    else {
      var rem = 1
      for (n <- 1 to k) {
        if (rem % k == 0) return n
        rem = (rem * 10 + 1) % k
      }
      -1
    }
}
