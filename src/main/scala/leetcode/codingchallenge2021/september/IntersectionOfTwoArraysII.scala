package leetcode.codingchallenge2021.september

object IntersectionOfTwoArraysII {
  def intersect(nums1: Array[Int], nums2: Array[Int]): Array[Int] = {
    val seen = new Array[Int](1001)
    for (n <- nums1) seen(n) += 1
    for (n <- nums2 if seen(n) > 0) yield {
      seen(n) -= 1
      n
    }
  }
}
