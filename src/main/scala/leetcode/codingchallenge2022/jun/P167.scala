package leetcode.codingchallenge2022.jun

// 167. Two Sum II - Input Array Is Sorted
object P167 {
  def twoSum(numbers: Array[Int], target: Int): Array[Int] = {
    @scala.annotation.tailrec
    def aux(i: Int, j: Int): Array[Int] = {
      if (numbers(i) + numbers(j) == target) Array(i + 1, j + 1)
      else if (numbers(i) + numbers(j) < target) aux(i + 1, j)
      else aux(i, j - 1)
    }
    aux(0, numbers.length - 1)
  }
}
