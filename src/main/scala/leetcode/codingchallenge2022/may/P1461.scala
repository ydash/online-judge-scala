package leetcode.codingchallenge2022.may

// 1461. Check If a String Contains All Binary Codes of Size K
object P1461 {
  def hasAllCodes(s: String, k: Int): Boolean =
    if (s.length - k + 1 < (1 << k)) false
    else {
      val lim = 1 << k
      val (_, pattern) = s.foldLeft(0 -> Set[Int]()) { case ((prev, seen), c) =>
        val tmp = (prev << 1) + c.asDigit
        val current = if (tmp < lim) tmp else tmp - lim
        (current, seen + current)
      }
      pattern.size == 1 << k
    }
}
