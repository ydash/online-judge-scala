package leetcode.codingchallenge2021.october

object WordSearch {
  def exist(board: Array[Array[Char]], word: String): Boolean = {
    val m = board.length
    val n = board.head.length
    val chars = word.toList
    for (i <- board.indices; j <- board(i).indices) {
      if (backtracking(chars, i, j)) return true
    }

    def backtracking(chars: List[Char], i: Int, j: Int): Boolean =
      chars match {
        case Nil => true
        case c :: tail =>
          if (i >= m || i < 0 || j >= n || j < 0 || board(i)(j) != c) false
          else {
            val tmp = board(i)(j)
            board(i)(j) = '.'
            if (
              backtracking(tail, i - 1, j) || backtracking(tail, i + 1, j) ||
              backtracking(tail, i, j - 1) || backtracking(tail, i, j + 1)
            ) return true

            board(i)(j) = tmp
            false
          }
      }

    false
  }
}
