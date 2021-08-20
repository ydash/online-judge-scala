package leetcode.codingchallenge2021.august

object ValidSudoku {
  def isValidSudoku(board: Array[Array[Char]]): Boolean = {
    val rowIsValid = board.forall(r => validate(r.filterNot(_ == '.')))
    val colIsValid = board.indices.forall(j => validate(for (i <- board.indices; v = board(i)(j) if v != '.') yield v))
    val nineIsValid = (for (x <- Seq(0, 3, 6); y <- Seq(0, 3, 6)) yield {
      for (i <- x to x + 2; j <- y to y + 2 if board(i)(j) != '.') yield board(i)(j)
    }).forall(validate(_))

    rowIsValid && colIsValid && nineIsValid
  }

  def validate(nums: Seq[Char]): Boolean = nums.length == nums.foldLeft(Set.empty[Char]) { (acc, c) => acc + c }.size
}
