package leetcode.codingchallenge2021.september

object LongestTurbulentSubarray {
  def maxTurbulenceSize(arr: Array[Int]): Int =
    if (arr.length == 1) 1
    else {
      var max, count = 1
      var slope = -arr(1) + arr(0)
      for (i <- 1 until arr.length) {
        val current = arr(i) - arr(i - 1)
        if (slope < 0 && current > 0 || slope > 0 && current < 0) {
          count += 1
        } else {
          max = max max count
          count = if (arr(i) == arr(i - 1)) 1 else 2
        }
        slope = current
      }

      max max count
    }

}
