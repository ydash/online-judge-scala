package leetcode.codingchallenge2022.jan

// 189. Rotate Array
object P189 {
  def rotate(nums: Array[Int], k: Int): Unit =
    if (nums.length == k || k == 0) ()
    else {
      val n = if (nums.length % k == 0) k else gcd(nums.length, k)
      for (i <- 0 until n) {
        rotate(nums, k, i)
      }
    }

  def rotate(nums: Array[Int], k: Int, start: Int): Unit = {
    val m = nums.length
    var current = start
    var replaced = nums(current)
    do {
      val next = (current + k) % m
      val tmp = nums(next)
      nums(next) = replaced
      current = next
      replaced = tmp
    } while (current != start)
  }

  @scala.annotation.tailrec
  private def gcd(a: Int, b: Int): Int =
    if (b == 0) a
    else gcd(b, a % b)
}
