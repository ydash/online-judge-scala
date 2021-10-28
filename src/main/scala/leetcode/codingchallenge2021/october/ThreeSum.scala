package leetcode.codingchallenge2021.october

object ThreeSum {
  def threeSum(nums: Array[Int]): List[List[Int]] = {
    nums.sortInPlace()
    var result = Set[List[Int]]()
    for (i <- nums.indices.dropRight(2)) {
      var j = i + 1
      var k = nums.length - 1
      while (j < k) {
        val sum = nums(i) + nums(j) + nums(k)
        if (sum == 0) result += List(nums(i), nums(j), nums(k))
        if (sum <= 0) j += 1 else k -= 1
      }
    }
    result.toList
  }
}
