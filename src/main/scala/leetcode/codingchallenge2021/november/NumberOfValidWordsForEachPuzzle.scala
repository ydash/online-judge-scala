package leetcode.codingchallenge2021.november

object NumberOfValidWordsForEachPuzzle {
  def findNumOfValidWords(words: Array[String], puzzles: Array[String]): List[Int] = {
    val wordBinList = words map word2bin
    for (puzzle <- puzzles.toList) yield {
      val pBin = word2bin(puzzle)
      val flBin = 1 << (puzzle.head - 'a')
      wordBinList.count { wordBin => (wordBin | pBin) == pBin && (wordBin & flBin) == flBin }
    }
  }

  private def word2bin(word: String): Int = word.foldLeft(0) { (acc, c) =>
    acc | (1 << (c - 'a'))
  }
}
