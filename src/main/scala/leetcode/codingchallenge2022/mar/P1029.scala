package leetcode.codingchallenge2022.mar

// 1029. Two City Scheduling
object P1029 {
  def twoCitySchedCost(costs: Array[Array[Int]]): Int = {
    costs.sortInPlaceBy { case Array(a, b) => a - b }
    val n = costs.length
    (0 until n / 2).foldLeft(0) { (acc, i) => acc + costs(i)(0) + costs(n - i - 1)(1) }
  }
}
