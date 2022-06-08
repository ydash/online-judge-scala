package leetcode.codingchallenge2022.jun

// 1332. Remove Palindromic Subsequences
object P1332 {
  def removePalindromeSub(s: String): Int =
    if (s.isEmpty) 0
    else {
      def isPalindrome(str: String): Boolean = {
        val n = str.length
        for (i <- 0 until n / 2 if str(i) != str(n - i - 1)) return false
        true
      }
      if (isPalindrome(s)) 1 else 2
    }
}
