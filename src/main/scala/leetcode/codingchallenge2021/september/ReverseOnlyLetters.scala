package leetcode.codingchallenge2021.september

object ReverseOnlyLetters {
  def reverseOnlyLetters(s: String): String = {
    val answer = new StringBuilder(s)
    var p = 0
    for (i <- s.indices.reverse if isAlphabet(s(i))) {
      while (!isAlphabet(answer(p))) p += 1
      answer(p) = s(i)
      p += 1
    }

    answer.toString()
  }

  def isAlphabet(c: Char): Boolean = ('a' to 'z' contains c) || ('A' to 'Z' contains c)
}
