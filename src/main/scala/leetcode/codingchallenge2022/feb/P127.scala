package leetcode.codingchallenge2022.feb

// 127. Word Ladder
object P127 {
  def ladderLength(beginWord: String, endWord: String, wordList: List[String]): Int = {
    val queue = collection.mutable.Queue[String](beginWord)
    val set = collection.mutable.Set[String](wordList: _*)
    var count = 0
    while (queue.nonEmpty) {
      count += 1
      for (_ <- queue.indices) {
        val word = queue.dequeue()
        if (word == endWord) return count
        for (i <- word.indices) {
          for (c <- 'a' to 'z') {
            val replaced = word.updated(i, c)
            if (set.contains(replaced)) {
              set -= replaced
              queue.enqueue(replaced)
            }
          }
        }
      }
    }
    0
  }
}
