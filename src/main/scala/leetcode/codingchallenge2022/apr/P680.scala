package leetcode.codingchallenge2022.apr

// 680. Valid Palindrome II
object P680 {
  def validPalindrome(s: String): Boolean = {
    @scala.annotation.tailrec
    def aux(left: Int, right: Int): Boolean = {
      if (left >= right) true
      else if (s(left) != s(right)) strictValidation(s, left + 1, right) || strictValidation(s, left, right - 1)
      else aux(left + 1, right - 1)
    }
    aux(0, s.length - 1)
  }

  @scala.annotation.tailrec
  private def strictValidation(s: String, left: Int, right: Int): Boolean = {
    if (left >= right) true
    else if (s(left) != s(right)) false
    else strictValidation(s, left + 1, right - 1)
  }
}
