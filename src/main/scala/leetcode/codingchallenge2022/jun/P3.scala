package leetcode.codingchallenge2022.jun

// 3. Longest Substring Without Repeating Characters
object P3 {
  def lengthOfLongestSubstring(s: String): Int = {
    val seen = collection.mutable.Map[Char, Int]().withDefaultValue(-1)
    var i = 0
    var result = 0
    for (j <- s.indices) {
      val c = s(j)
      i = seen(c) + 1 max i
      result = result max (j - i + 1)
      seen += (c -> j)
    }
    result
  }
}
