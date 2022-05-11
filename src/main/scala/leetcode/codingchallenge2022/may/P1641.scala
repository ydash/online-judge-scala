package leetcode.codingchallenge2022.may

// 1641. Count Sorted Vowel Strings
object P1641 {
  def countVowelStrings(n: Int): Int = {
    @scala.annotation.tailrec
    def aux(n: Int, a: Int, e: Int, i: Int, o: Int, u: Int): Int =
      if (n == 0) a + e + i + o + u
      else aux(n - 1, a, a + e, a + e + i, a + e + i + o, a + e + i + o + u)
    aux(n - 1, 1, 1, 1, 1, 1)
  }
}
