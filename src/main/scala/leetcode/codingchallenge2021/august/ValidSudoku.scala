package leetcode.codingchallenge2021.august

import scala.collection.mutable

object ValidSudoku {
  def isValidSudoku(board: Array[Array[Char]]): Boolean = {
    val set = new mutable.HashSet[String]()
    for (i <- board.indices; j <- board.indices; v = board(i)(j) if v != '.') {
      val beforeLength = set.size
      set += s"Row($i,$v)"
      set += s"Column($j,$v)"
      set += s"Square(${i / 3},${j / 3},$v)"
      if (beforeLength + 3 != set.size) return false
    }

    true
  }
}
