package leetcode.codingchallenge2021.november

object HammingDistance {
  def hammingDistance(x: Int, y: Int): Int = {
    @scala.annotation.tailrec
    def countOne(n: Int, acc: Int = 0): Int = {
      if (n == 0) acc
      else countOne(n >> 1, if ((n & 1) == 1) acc + 1 else acc)
    }
    countOne(x ^ y)
  }
}
