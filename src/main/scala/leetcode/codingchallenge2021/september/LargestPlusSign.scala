package leetcode.codingchallenge2021.september

object LargestPlusSign {
  def orderOfLargestPlusSign(n: Int, mines: Array[Array[Int]]): Int = {
    val up, down, left, right = Array.fill(n)(Array.fill(n)(1))

    for (Array(x, y) <- mines) {
      up(x)(y) = 0
      down(x)(y) = 0
      left(x)(y) = 0
      right(x)(y) = 0
    }

    for (i <- 1 until n - 1; j <- 1 until n - 1) {
      if (up(i)(j) != 0) up(i)(j) = up(i - 1)(j) + 1
      if (down(n - i - 1)(j) != 0) down(n - i - 1)(j) = down(n - i)(j) + 1
      if (left(j)(i) != 0) left(j)(i) = left(j)(i - 1) + 1
      if (right(j)(n - i - 1) != 0) right(j)(n - i - 1) = right(j)(n - i) + 1
    }

    (for (i <- 0 until n; j <- 0 until n) yield up(i)(j) min down(i)(j) min left(i)(j) min right(i)(j)).max
  }
}
