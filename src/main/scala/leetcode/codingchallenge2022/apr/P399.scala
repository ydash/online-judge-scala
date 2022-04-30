package leetcode.codingchallenge2022.apr

import collection.mutable

// 399. Evaluate Division
object P399 {
  def calcEquation(
      equations: List[List[String]],
      values: Array[Double],
      queries: List[List[String]]
  ): Array[Double] = {
    val map = mutable.Map[String, mutable.Map[String, Double]]()
    def update(x: String, y: String, value: Double): Unit = {
      if (!map.contains(x)) map += (x -> mutable.Map.empty)
      map(x) += (y -> value)
      map(x) += (x -> 1d)
    }
    for ((List(a, b), i) <- equations.zipWithIndex) {
      update(a, b, values(i))
      update(b, a, 1 / values(i))
    }
    def dfs(x: String, y: String, acc: Double): Unit = {
      for (m <- map.get(y); (z, v) <- m if !map(x).contains(z)) {
        map(x) += (z -> acc * v)
        dfs(x, z, acc * v)
      }
    }
    for (x <- map.keys; y <- map(x).keys if x != y) dfs(x, y, map(x)(y))
    for (List(a, b) <- queries.toArray) yield map.get(a).flatMap(_.get(b)).getOrElse(-1d)
  }
}
