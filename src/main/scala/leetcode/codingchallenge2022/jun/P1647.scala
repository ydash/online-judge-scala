package leetcode.codingchallenge2022.jun

// 1647. Minimum Deletions to Make Character Frequencies Unique
object P1647 {
  def minDeletions(s: String): Int = {
    val freq = new Array[Int](26)
    for (c <- s) freq(c - 'a') += 1
    val seen = collection.mutable.Set[Int]()
    var result = 0
    for (count <- freq if count > 0) {
      var x = count
      while (seen.contains(x)) {
        x -= 1
        result += 1
      }
      if (x > 0) seen += x
    }
    result
  }
}
