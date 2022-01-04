package leetcode.codingchallenge2022.jan

object P1009 {
  def bitwiseComplement(num: Int): Int = {
    var x = 1
    while (x < num) x = (x << 1) + 1
    num ^ x
  }
}
