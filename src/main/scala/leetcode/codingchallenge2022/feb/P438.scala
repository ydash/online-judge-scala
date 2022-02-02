package leetcode.codingchallenge2022.feb

// 438. Find All Anagrams in a String
object P438 {
  def findAnagrams(s: String, p: String): List[Int] = {
    val n = s.length
    val pCount = p.foldLeft(Map.empty[Char, Int]) { (acc, c) => acc + (c -> (1 + acc.getOrElse(c, 0))) }
    val sCount = new Array[Int]('z' - 'a' + 1)
    val result = collection.mutable.ListBuffer[Int]()
    var i, j = 0
    while (i < n && j < n) {
      if (!pCount.contains(s(j))) {
        for (i <- sCount.indices) sCount(i) = 0
        i = j + 1
      } else if (sCount(s(j) - 'a') < pCount(s(j))) {
        sCount(s(j) - 'a') += 1
      } else {
        while (s(i) != s(j)) {
          sCount(s(i) - 'a') -= 1
          i += 1
        }
        i += 1
      }
      if (j - i + 1 == p.length) result += i
      j += 1
    }
    result.toList
  }
}
