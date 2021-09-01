package leetcode.codingchallenge2021.september

object ArrayNesting {

  def arrayNesting(nums: Array[Int]): Int = {
    var answer = 0
    for (i <- nums.indices if nums(i) >= 0) answer = answer max count(nums(i))

    def count(start: Int): Int = {
      var current = start
      var cnt = 0

      do {
        cnt += 1
        val prev = current
        current = nums(current)
        nums(prev) = -1
      } while (current != start)

      cnt
    }

    answer
  }
}
