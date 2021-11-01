package leetcode.codingchallenge2021.november

// 130. Surrounded Regions
object SurroundedRegions {
  def solve(board: Array[Array[Char]]): Unit = {
    val m = board.length
    val n = board.head.length
    val unSurrounded = Array.ofDim[Boolean](m, n)

    @scala.annotation.tailrec
    def aux(stack: List[(Int, Int)]): Unit = stack match {
      case Nil => ()
      case (i, j) :: rest =>
        unSurrounded(i)(j) = true
        aux(
          List((i - 1, j), (i + 1, j), (i, j - 1), (i, j + 1))
            .foldLeft(rest) { case (acc, p @ (x, y)) =>
              if (x >= 0 && x < m && y >= 0 && y < n && board(x)(y) == 'O' && !unSurrounded(x)(y)) p :: acc
              else acc
            }
        )
    }
    for (i <- IndexedSeq(0, m - 1); j <- 0 until n if board(i)(j) == 'O') aux(List(i -> j))
    for (j <- IndexedSeq(0, n - 1); i <- 0 until m - 1 if board(i)(j) == 'O') aux(List(i -> j))
    for (i <- 0 until m; j <- 0 until n if !unSurrounded(i)(j)) board(i)(j) = 'X'
  }
}
