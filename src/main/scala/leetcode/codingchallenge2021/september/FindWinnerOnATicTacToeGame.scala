package leetcode.codingchallenge2021.september

object FindWinnerOnATicTacToeGame {
  def tictactoe(moves: Array[Array[Int]]): String = {
    val row, col = new Array[Int](3)
    var ld, rd = 0

    for (k <- moves.indices) moves(k) match {
      case Array(i, j) =>
        val d = if (k % 2 == 0) 1 else -1
        col(i) += d
        row(j) += d
        if (i == j) rd += d
        if (i + j == 2) ld += d
    }

    if (row.contains(3) || col.contains(3) || ld == 3 || rd == 3) "A"
    else if (row.contains(-3) || col.contains(-3) || ld == -3 || rd == -3) "B"
    else if (moves.length == 9) "Draw"
    else "Pending"
  }
}
