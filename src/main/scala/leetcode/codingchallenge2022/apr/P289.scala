package leetcode.codingchallenge2022.apr

// 289. Game of Life
object P289 {
  def gameOfLife(board: Array[Array[Int]]): Unit = {
    def get(arr: Array[Array[Int]], i: Int, j: Int): Int = {
      arr.lift(i).flatMap(_.lift(j)).getOrElse(0) % 10
    }
    def countNeighbor(arr: Array[Array[Int]], i: Int, j: Int): Int = {
      get(arr, i - 1, j - 1) + get(arr, i - 1, j) + get(arr, i - 1, j + 1) +
        get(arr, i, j - 1) + get(arr, i, j + 1) +
        get(arr, i + 1, j - 1) + get(arr, i + 1, j) + get(arr, i + 1, j + 1)
    }
    for (i <- board.indices; j <- board(i).indices) {
      val env = countNeighbor(board, i, j)
      if (board(i)(j) == 1 && (env == 2 || env == 3) || board(i)(j) == 0 && env == 3) board(i)(j) += 10
    }
    for (i <- board.indices; j <- board(i).indices) board(i)(j) /= 10
  }
}
