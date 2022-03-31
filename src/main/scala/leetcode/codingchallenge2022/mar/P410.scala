package leetcode.codingchallenge2022.mar

// 410. Split Array Largest Sum
object P410 {
  def splitArray(nums: Array[Int], m: Int): Int = {
    val maxNum = nums.max
    val sum = nums.sum
    @scala.annotation.tailrec
    def binSearch(left: Int, right: Int): Int = {
      if (left > right) left
      else {
        val mid = (left + right) / 2
        if (numOfSplit(nums, mid) <= m) {
          binSearch(left, mid - 1)
        } else {
          binSearch(mid + 1, right)
        }
      }
    }
    binSearch(maxNum, sum)
  }

  private def numOfSplit(nums: Array[Int], limitSum: Int): Int = {
    var count = 1
    var sum = 0
    for (n <- nums) {
      if (sum + n <= limitSum) {
        sum += n
      } else {
        sum = n
        count += 1
      }
    }
    count
  }
}
