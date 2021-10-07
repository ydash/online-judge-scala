package leetcode.codingchallenge2021.october

import scala.collection.mutable

object WordSearch {
  def exist(board: Array[Array[Char]], word: String): Boolean = {
    val m = board.length
    val n = board.head.length
    val chars = word.toList
    for (i <- board.indices; j <- board(i).indices if board(i)(j) == chars.head) {
      if (backtracking(chars.drop(1), i: Int, j: Int, mutable.Set(i -> j))) return true
    }

    def backtracking(chars: List[Char], i: Int, j: Int, visited: mutable.Set[(Int, Int)]): Boolean =
      chars match {
        case Nil => true
        case c :: tail =>
          for {
            (x, y) <- Array((i - 1, j), (i + 1, j), (i, j - 1), (i, j + 1))
            if x < m && x >= 0 && y < n && y >= 0
            if board(x)(y) == c
            if !visited.contains(x -> y)
          } {
            visited += (x -> y)
            if (backtracking(tail, x, y, visited)) return true
            visited -= (x -> y)
          }
          false
      }

    false
  }
}
