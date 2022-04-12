package leetcode.codingchallenge2022.apr

// 289. Game of Life
object P289 {
  def gameOfLife(board: Array[Array[Int]]): Unit = {
    def get(arr: Array[Array[Int]], i: Int, j: Int): Int = {
      arr.lift(i).flatMap(_.lift(j)).getOrElse(0)
    }
    def countNeighbor(arr: Array[Array[Int]], i: Int, j: Int): Int = {
      get(arr, i - 1, j - 1) + get(arr, i - 1, j) + get(arr, i - 1, j + 1) +
        get(arr, i, j - 1) + get(arr, i, j + 1) +
        get(arr, i + 1, j - 1) + get(arr, i + 1, j) + get(arr, i + 1, j + 1)
    }
    val prev = Array.tabulate(board.length)(board(_).clone())
    for (i <- board.indices; j <- board(i).indices) {
      val env = countNeighbor(prev, i, j)
      if (prev(i)(j) == 1) {
        board(i)(j) =
          if (env < 2) 0
          else if (env <= 3) 1
          else 0
      } else {
        if (env == 3) board(i)(j) = 1
      }
    }
  }
}
