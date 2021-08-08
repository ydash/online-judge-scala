package leetcode.codingchallenge2021.august

import scala.collection.mutable.{HashMap => MutableMap, ArrayBuffer}

object MatrixRankTransform {
  def matrixRankTransform(matrix: Array[Array[Int]]): Array[Array[Int]] = {
    val m = matrix.length
    val n = matrix.head.length
    val rank = new Array[Int](m + n)
    val map = new MutableMap[Int, ArrayBuffer[(Int, Int)]]()
    for (i <- 0 until m; j <- 0 until n) map.getOrElseUpdate(matrix(i)(j), ArrayBuffer()) += ((i, j))

    for ((_, list) <- map.toSeq.sortBy(_._1)) {
      val parent = Array.tabulate(m + n)(i => i)
      val tmp = rank.clone()
      for ((_i, _j) <- list) {
        val (i, j) = (find(_i, parent), find(_j + m, parent))
        parent(i) = j
        tmp(j) = tmp(i) max tmp(j)
      }
      for ((i, j) <- list; r = tmp(find(i, parent)) + 1) {
        rank(i) = r
        rank(j + m) = r
        matrix(i)(j) = r
      }
    }

    matrix
  }

  def find(i: Int, parent: Array[Int]): Int = {
    if (parent(i) != i) parent(i) = find(parent(i), parent)
    parent(i)
  }
}
