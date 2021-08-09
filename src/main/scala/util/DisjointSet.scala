package util

class DisjointSet(n: Int) {
  val parent = new Array[Int](n)
  parent.indices.foreach(i => parent(i) = -1)

  final def findSet(x: Int): Int =
    if (parent(x) < 0) x
    else {
      parent(x) = findSet(parent(x))
      parent(x)
    }

  def same(x: Int, y: Int): Boolean = findSet(x) == findSet(y)

  def union(x: Int, y: Int): Unit = link(findSet(x), findSet(y))

  private def link(x: Int, y: Int): Unit = {
    if (x != y) {
      parent(y) += parent(x)
      parent(x) = y
    }
  }

  def size(x: Int): Int = -parent(findSet(x))
}