package leetcode.codingchallenge2022.feb

// 39. Combination Sum
object P39 {
  def combinationSum(candidates: Array[Int], target: Int): List[List[Int]] = {
    var result: List[List[Int]] = Nil
    def loop(i: Int, sum: Int, acc: List[Int]): Unit = {
      if (sum == target) result = acc :: result
      else if (i < candidates.length && sum < target) {
        loop(i, sum + candidates(i), candidates(i) :: acc)
        loop(i + 1, sum, acc)
      }
    }
    loop(0, 0, Nil)
    result
  }
}
