package leetcode.codingchallenge2021.september

import scala.collection.mutable

object SumOfDistancesInTree {
  def sumOfDistancesInTree(n: Int, edges: Array[Array[Int]]): Array[Int] = {
    val adj = Array.fill(n)(mutable.Set[Int]())
    val ans = new Array[Int](n)
    val count = Array.fill(n)(1)

    for (Array(x, y) <- edges) {
      adj(x) += y
      adj(y) += x
    }

    def dfs(current: Int, parent: Int = -1): Unit = {
      for (child <- adj(current) if child != parent) {
        dfs(child, current)
        count(current) += count(child)
        ans(current) += ans(child) + count(child)
      }
    }

    def dfs2(current: Int, parent: Int = -1): Unit = {
      for (child <- adj(current) if child != parent) {
        ans(child) = ans(current) - count(child) + n - count(child)
        dfs2(child, current)
      }
    }

    dfs(0)
    dfs2(0)

    ans
  }
}
