package leetcode.codingchallenge2022.mar

// 799. Champagne Tower
object P799 {
  def champagneTower(poured: Int, query_row: Int, query_glass: Int): Double = {
    val tower = Array.tabulate(query_row + 2)(i => new Array[Double](i + 1))
    tower(0)(0) = poured
    for (i <- 0 to query_row; j <- 0 to i if tower(i)(j) > 1) {
      val spilled = (tower(i)(j) - 1) / 2
      tower(i)(j) = 1
      tower(i + 1)(j) += spilled
      tower(i + 1)(j + 1) += spilled
    }
    tower(query_row)(query_glass)
  }
}
