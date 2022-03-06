package leetcode.codingchallenge2022.mar

// 1359. Count All Valid Pickup and Delivery Options
object P1359 {
  /*
  f(0) = 1
  f(n) = n * (2 * n - 1) * f(n - 1)
   */
  def countOrders(n: Int): Int = {
    @scala.annotation.tailrec
    def aux(i: Int, acc: Long = 1): Long =
      if (i > n) acc
      else aux(i + 1, (i * (2 * i - 1) * acc) % 1000000007)

    aux(1).toInt
  }
}
