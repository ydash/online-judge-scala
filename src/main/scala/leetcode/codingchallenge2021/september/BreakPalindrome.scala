package leetcode.codingchallenge2021.september

object BreakPalindrome {
  def breakPalindrome(palindrome: String): String = {
    for (i <- 0 until palindrome.length / 2 if palindrome(i) != 'a') return palindrome.updated(i, 'a')
    if (palindrome.length > 1) palindrome.updated(palindrome.length - 1, 'b')
    else ""
  }
}
