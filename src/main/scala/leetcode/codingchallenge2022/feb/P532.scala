package leetcode.codingchallenge2022.feb

// 532. K-diff Pairs in an Array
object P532 {
  def findPairs(nums: Array[Int], k: Int): Int = {
    val map = collection.mutable.Map[Int, Int]().withDefaultValue(0)
    for (n <- nums) map(n) += 1
    var result = 0
    for ((n, count) <- map if (k != 0 && map.contains(n + k)) || (k == 0 & count > 1)) {
      result += 1
    }
    result
  }
}
