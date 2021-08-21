package leetcode.codingchallenge2021.august

object SudokuSolver {
  def solveSudoku(board: Array[Array[Char]]): Unit = {
    val set = (for (i <- board.indices; j <- board.indices if board(i)(j) != '.') yield (i, j)).foldLeft(Set[String]()) { case (acc, (i, j)) =>
      val x = board(i)(j)
      acc + s"r($i,$x)" + s"c($j,$x)" + s"b(${i / 3},${j / 3},$x)"
    }
    val emptyCells = for (i <- board.indices; j <- board.indices if board(i)(j) == '.') yield (i, j)
    solver(board, emptyCells, set)
  }

  def solver(board: Array[Array[Char]], emptyCells: Seq[(Int, Int)], set: Set[String]): Boolean = emptyCells match {
    case Nil => true
    case (i, j) +: rest =>
      for {
        x <- '1' to '9'
        r = s"r($i,$x)"
        c = s"c($j,$x)"
        b = s"b(${i / 3},${j / 3},$x)"
        if !set.contains(r) && !set.contains(c) && !set.contains(b) && solver(board, rest, set + r + c + b)
      } {
        board(i)(j) = x
        return true
      }
      false
  }
}
