package leetcode.codingchallenge2022.feb

// 567. Permutation in String
object P567 {
  def checkInclusion(s1: String, s2: String): Boolean = {
    val count1, count2 = new Array[Int]('z' - 'a' + 1)
    for (c <- s1) count1(c - 'a') += 1
    var start = 0
    for (current <- s2.indices) {
      val c = s2(current)
      val i = c - 'a'
      if (count2(i) < count1(i)) {
        count2(i) += 1
      } else if (count1(i) > 0) {
        while (s2(start) != c) {
          count2(s2(start) - 'a') -= 1
          start += 1
        }
        start += 1
      } else {
        for (j <- start until current) count2(s2(j) - 'a') = 0
        start = current + 1
      }
      if (current + 1 - start == s1.length) return true
    }
    false
  }
}
