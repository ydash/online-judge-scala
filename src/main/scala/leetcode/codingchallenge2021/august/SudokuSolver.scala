package leetcode.codingchallenge2021.august

object SudokuSolver {
  def solveSudoku(board: Array[Array[Char]]): Unit = {
    solver(board)
  }

  def validate(
      board: Array[Array[Char]],
      row: Int,
      col: Int,
      x: Char
  ): Boolean =
    board.indices.forall { i =>
      board(row)(i) != x &&
      board(i)(col) != x &&
      board(3 * (row / 3) + i / 3)(3 * (col / 3) + i % 3) != x
    }

  def solver(board: Array[Array[Char]]): Boolean = {
    for (i <- board.indices; j <- board.indices if board(i)(j) == '.') {
      for (x <- '1' to '9' if validate(board, i, j, x)) {
        board(i)(j) = x
        if (solver(board)) return true
        board(i)(j) = '.'
      }
      return false
    }
    true
  }
}
