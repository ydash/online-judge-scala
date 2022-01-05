package leetcode.codingchallenge2022.jan

// 131. Palindrome Partitioning
object P131 {
  def partition(s: String): List[List[String]] = {
    var result: List[List[String]] = Nil
    def loop(start: Int, acc: List[String]): Unit = {
      if (start >= s.length) {
        if (start == s.length) result = acc.reverse :: result
      } else {
        for (end <- start until s.length if isPalindrome(s, start, end)) {
          loop(end + 1, s.substring(start, end + 1) :: acc)
        }
      }
    }
    loop(0, Nil)
    result
  }

  private def isPalindrome(s: String, start: Int, end: Int): Boolean = {
    var (l, r) = (start, end)
    while (l < r) {
      if (s(l) != s(r)) return false
      l += 1
      r -= 1
    }
    true
  }
}
