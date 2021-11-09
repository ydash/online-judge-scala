package leetcode.codingchallenge2021.november

object NumberOfValidWordsForEachPuzzle {
  def findNumOfValidWords(words: Array[String], puzzles: Array[String]): List[Int] = {
    val ws = words map word2bin
    val ps = (puzzles map word2bin).zip(puzzles map { p => 1 << (p.head - 'a') })
    for ((puzzle, firstLetter) <- ps.toList)
      yield ws.count { word => (word | puzzle) == puzzle && (word & firstLetter) == firstLetter }
  }

  private def word2bin(word: String): Int = word.foldLeft(0) { (acc, c) =>
    acc | (1 << (c - 'a'))
  }
}
