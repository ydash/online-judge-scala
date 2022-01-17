package leetcode.codingchallenge2022.jan

// 290. Word Pattern
object P290 {
  def wordPattern(pattern: String, s: String): Boolean = {
    val wordList = s.split(" ")
    if (wordList.length != pattern.length) return false
    val p2w = collection.mutable.Map[Char, String]()
    val w2p = collection.mutable.Map[String, Char]()
    for (i <- wordList.indices) {
      p2w.get(pattern(i)).foreach(word => if (word != wordList(i)) return false)
      w2p.get(wordList(i)).foreach(p => if (p != pattern(i)) return false)
      p2w(pattern(i)) = wordList(i)
      w2p(wordList(i)) = pattern(i)
    }
    true
  }
}
