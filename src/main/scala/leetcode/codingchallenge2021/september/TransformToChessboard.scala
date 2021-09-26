package leetcode.codingchallenge2021.september

object TransformToChessboard {
  def movesToChessboard(board: Array[Array[Int]]): Int = {
    val n = board.length
    for {
      i <- board.indices
      j <- board.indices
      if (board(0)(0) ^ board(i)(0) ^ board(0)(j) ^ board(i)(j)) == 1
    } return -1

    var rowOnes, colOnes, rowSwap, colSwap = 0
    for (i <- board.indices) {
      rowOnes += board(0)(i)
      colOnes += board(i)(0)
      if (board(i)(0) == i % 2) rowSwap += 1
      if (board(0)(i) == i % 2) colSwap += 1
    }
    if (rowOnes != n / 2 && rowOnes != (n + 1) / 2) return -1
    if (colOnes != n / 2 && colOnes != (n + 1) / 2) return -1

    if (n % 2 == 0) {
      colSwap = colSwap min n - colSwap
      rowSwap = rowSwap min n - rowSwap
    } else {
      if (colSwap % 2 == 1) colSwap = n - colSwap
      if (rowSwap % 2 == 1) rowSwap = n - rowSwap
    }
    (colSwap + rowSwap) / 2
  }
}
