package leetcode.codingchallenge2021.september

object OrderlyQueue {
  def orderlyQueue(s: String, k: Int): String = {
    if (k > 1) s.sorted
    else {
      val buffer = new StringBuilder(s)
      var result = s
      val minChar = s.min
      for (i <- 1 until s.length if s(i) == minChar) {
        for (j <- 0 until (s.length - i)) buffer(j) = s(i + j)
        for (j <- 0 until i) buffer(s.length - i + j) = s(j)
        val tmp = buffer.toString()
        if (tmp < result) result = tmp
      }
      result
    }
  }
}
