package leetcode.codingchallenge2022.may

// 647. Palindromic Substrings
object P647 {
  def countSubstrings(s: String): Int = {
    @scala.annotation.tailrec
    def countPalindrome(i: Int, j: Int, acc: Int = 0): Int =
      if (i < 0 || j >= s.length || s(i) != s(j)) acc
      else countPalindrome(i - 1, j + 1, acc + 1)

    (1 until s.length).foldLeft(s.length)((acc, i) => acc + countPalindrome(i - 1, i + 1) + countPalindrome(i - 1, i))
  }
}
