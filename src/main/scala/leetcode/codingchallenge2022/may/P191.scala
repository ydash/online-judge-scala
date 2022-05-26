package leetcode.codingchallenge2022.may

// 191. Number of 1 Bits
object P191 {
  @scala.annotation.tailrec
  def hammingWeight(n: Int, acc: Int = 0): Int = {
    if (n == 0) acc
    else hammingWeight(n >>> 1, acc + (n & 1))
  }
}
