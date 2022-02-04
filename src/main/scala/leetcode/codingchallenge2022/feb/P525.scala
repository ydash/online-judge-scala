package leetcode.codingchallenge2022.feb

// 525. Contiguous Array
object P525 {
  def findMaxLength(nums: Array[Int]): Int = {
    var sum, result = 0
    val cache = collection.mutable.Map[Int, Int](0 -> -1)
    for (i <- nums.indices) {
      sum += (if (nums(i) == 0) -1 else 1)
      if (cache.contains(sum)) result = result max i - cache(sum)
      else cache += (sum -> i)
    }
    result
  }
}
