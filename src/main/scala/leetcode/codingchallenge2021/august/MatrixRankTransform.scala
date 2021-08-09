package leetcode.codingchallenge2021.august

import util.DisjointSet

import scala.collection.mutable.{ArrayBuffer, HashMap => MutableMap}

object MatrixRankTransform {
  def matrixRankTransform(matrix: Array[Array[Int]]): Array[Array[Int]] = {
    val m = matrix.length
    val n = matrix.head.length
    val rank = new Array[Int](m + n)
    val map = new MutableMap[Int, ArrayBuffer[(Int, Int)]]()
    for (i <- 0 until m; j <- 0 until n) map.getOrElseUpdate(matrix(i)(j), ArrayBuffer()) += ((i, j))

    for ((_, list) <- map.toSeq.sortBy(_._1)) {
      val ds = new DisjointSet(m + n)
      val tmp = rank.clone()
      for ((i, j) <- list) {
        val (pi, pj) = (ds.findSet(i), ds.findSet(j + m))
        ds.union(pi, pj)
        tmp(pj) = tmp(pi) max tmp(pj)
      }
      for ((i, j) <- list; r = tmp(ds.findSet(i)) + 1) {
        rank(i) = r
        rank(j + m) = r
        matrix(i)(j) = r
      }
    }

    matrix
  }
}
