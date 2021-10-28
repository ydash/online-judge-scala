package leetcode.codingchallenge2021.october

object ThreeSum {
  def threeSum(nums: Array[Int]): List[List[Int]] = {
    nums.sortInPlace()
    var result = List[List[Int]]()
    for (
      i <- nums.indices.dropRight(2).takeWhile(nums(_) <= 0)
      if i == 0 || nums(i) != nums(i - 1)
    ) {
      var j = i + 1
      var k = nums.length - 1
      while (j < k) {
        nums(i) + nums(j) + nums(k) match {
          case 0 =>
            result = List(nums(i), nums(j), nums(k)) :: result
            while (j < k && nums(j) == nums(j + 1)) j += 1
            while (j < k && nums(k) == nums(k - 1)) k -= 1
            j += 1; k -= 1
          case sum if sum < 0 => j += 1
          case _              => k -= 1
        }
      }
    }
    result
  }
}
