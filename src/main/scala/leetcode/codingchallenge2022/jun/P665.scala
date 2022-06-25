package leetcode.codingchallenge2022.jun

// 665. Non-decreasing Array
object P665 {
  def checkPossibility(nums: Array[Int]): Boolean = {
    var count = 0
    var i = 0
    while (i < nums.length - 1 && count <= 1) {
      if (nums(i) > nums(i + 1)) {
        if (i - 1 < 0 || nums(i - 1) <= nums(i + 1)) nums(i) = nums(i + 1)
        else nums(i + 1) = nums(i)
        count += 1
      }

      i += 1
    }
    count <= 1
  }
}
