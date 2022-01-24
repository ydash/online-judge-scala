package leetcode.codingchallenge2022.jan

// 520. Detect Capital
object P520 {
  def detectCapitalUse(word: String): Boolean = word.forall(isCapital) || word.tail.forall(!isCapital(_))

  private def isCapital(c: Char): Boolean = 'A' <= c && c <= 'Z'
}
