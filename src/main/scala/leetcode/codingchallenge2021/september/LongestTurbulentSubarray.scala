package leetcode.codingchallenge2021.september

object LongestTurbulentSubarray {
  def maxTurbulenceSize(arr: Array[Int]): Int = {
    var answer = 1
    var head = 0
    for (i <- 1 until arr.length) {
      val slope = arr(i) compare arr(i - 1)
      if (slope == 0) head = i
      else if (i == arr.length - 1 || slope * (arr(i + 1) compare arr(i)) >= 0) {
        answer = answer max (i - head + 1)
        head = i
      }
    }
    answer
  }

}
