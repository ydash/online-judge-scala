package leetcode.codingchallenge2021.november

object FindAllNumbersDisappearedInAnArray {
  def findDisappearedNumbers(nums: Array[Int]): List[Int] = {
    var result = Set(1 to nums.length: _*)
    for (n <- nums) {
      result = result - n
    }
    result.toList
  }
}
