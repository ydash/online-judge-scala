package leetcode.codingchallenge2022.may

// 1461. Check If a String Contains All Binary Codes of Size K
object P1461 {
  def hasAllCodes(s: String, k: Int): Boolean =
    if (s.length - k + 1 < (1 << k)) false
    else {
      val pattern = (0 to s.length - k).foldLeft(Set[Int]()) { (acc, i) =>
        acc + Integer.parseInt(s.substring(i, i + k), 2)
      }
      pattern.size == 1 << k
    }
}
