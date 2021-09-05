package leetcode.codingchallenge2021.september

object OrderlyQueue {
  def orderlyQueue(s: String, k: Int): String = {
    if (k > 1) s.sorted
    else {
      var result = s
      val minChar = s.min
      for {
        i <- 1 until s.length if s(i) == minChar
        tmp = s.substring(i) + s.substring(0, i) if tmp < result
      } result = tmp
      result
    }
  }
}
