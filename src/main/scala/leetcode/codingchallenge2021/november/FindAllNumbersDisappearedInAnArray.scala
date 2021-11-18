package leetcode.codingchallenge2021.november

object FindAllNumbersDisappearedInAnArray {
  def findDisappearedNumbers(nums: Array[Int]): List[Int] = {
    for (i <- nums.indices) {
      val n = nums(i).abs - 1
      if (nums(n) > 0) nums(n) *= -1
    }
    nums.indices.foldLeft(Nil: List[Int])((acc, i) => if (nums(i) > 0) i + 1 :: acc else acc)
  }
}
