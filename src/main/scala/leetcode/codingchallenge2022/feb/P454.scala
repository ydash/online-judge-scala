package leetcode.codingchallenge2022.feb

object P454 {
  def fourSumCount(nums1: Array[Int], nums2: Array[Int], nums3: Array[Int], nums4: Array[Int]): Int = {
    val map = collection.mutable.Map[Int, Int]().withDefaultValue(0)
    for (n1 <- nums1; n2 <- nums2) map(n1 + n2) += 1
    var result = 0
    for (n3 <- nums3; n4 <- nums4) result += map(-n3 - n4)
    result
  }
}
