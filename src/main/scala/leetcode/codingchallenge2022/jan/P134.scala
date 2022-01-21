package leetcode.codingchallenge2022.jan

// 134. Gas Station
object P134 {
  def canCompleteCircuit(gas: Array[Int], cost: Array[Int]): Int = {
    val n = gas.length
    var start, tank, suffix = 0
    for (i <- 0 until n) {
      tank += gas(i) - cost(i)
      if (tank < 0) {
        start = i + 1
        suffix += tank
        tank = 0
      }
    }
    if (tank + suffix < 0) -1 else start
  }
}
