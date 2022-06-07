package leetcode.codingchallenge2022.jun

// 88. Merge Sorted Array
object P88 {
  def merge(nums1: Array[Int], m: Int, nums2: Array[Int], n: Int): Unit = {
    var i = m - 1
    var j = n - 1
    for (p <- (0 until m + n).reverse) {
      if (i < 0 || (j >= 0 && nums2(j) > nums1(i))) {
        nums1(p) = nums2(j)
        j -= 1
      } else {
        nums1(p) = nums1(i)
        i -= 1
      }
    }
  }
}
