package leetcode.codingchallenge2022.feb

// 392. Is Subsequence
object P392 {
  def isSubsequence(s: String, t: String): Boolean = {
    @scala.annotation.tailrec
    def loop(si: Int, ti: Int): Boolean = {
      if (si >= s.length) true
      else if (ti >= t.length) false
      else {
        if (s(si) == t(ti)) loop(si + 1, ti + 1)
        else loop(si, ti + 1)
      }
    }

    loop(0, 0)
  }
}
