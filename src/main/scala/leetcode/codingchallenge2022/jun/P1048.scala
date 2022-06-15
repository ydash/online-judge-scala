package leetcode.codingchallenge2022.jun

// 1048. Longest String Chain
object P1048 {
  def longestStrChain(words: Array[String]): Int = {
    val dp = collection.mutable.Map[String, Int]().withDefaultValue(0)
    words.sortInPlaceBy(_.length)
    var result = 1
    for (s <- words) {
      val sb = new collection.mutable.StringBuilder(s)
      for (i <- s.indices) {
        sb.deleteCharAt(i)
        dp(s) = dp(s) max (dp(sb.toString()) + 1)
        result = dp(s) max result
        sb.insert(i, s(i))
      }
    }
    result
  }
}
