package leetcode.codingchallenge2021.november

// 260. Single Number III
object SingleNumberIII {
  def singleNumber(nums: Array[Int]): Array[Int] = {
    nums.sortInPlace()
    var result: List[Int] = Nil
    var i = 0
    while (i < nums.length - 1) {
      if (nums(i) == nums(i + 1)) {
        i += 2
      } else {
        result = nums(i) :: result
        i += 1
      }
    }
    if (nums.length - 1 == i) result = nums.last :: result
    result.toArray
  }
}
