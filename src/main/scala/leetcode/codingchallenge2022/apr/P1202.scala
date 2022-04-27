package leetcode.codingchallenge2022.apr

// 1202. Smallest String With Swaps
object P1202 {
  import collection.mutable
  def smallestStringWithSwaps(s: String, pairs: List[List[Int]]): String = {
    val ds = new DisjointSet(s.length)
    for (List(i, j) <- pairs if !ds.same(i, j)) ds.union(i, j)
    val map = mutable.Map[Int, mutable.PriorityQueue[Char]]()
    for (i <- s.indices) {
      val p = ds.findSet(i)
      map.get(p).fold[Unit](map += (p -> mutable.PriorityQueue(s(i))(Ordering.Char.reverse)))(_ => map(p).enqueue(s(i)))
    }
    val buffer = new mutable.StringBuilder()
    for (i <- s.indices) {
      buffer += map(ds.findSet(i)).dequeue()
    }
    buffer.toString()
  }

  class DisjointSet(n: Int) {
    private val parent = Array.tabulate[Int](n)(identity)

    def findSet(x: Int): Int =
      if (parent(x) == x) x
      else {
        val p = findSet(parent(x))
        parent(x) = p
        p
      }

    def same(x: Int, y: Int): Boolean = findSet(x) == findSet(y)

    def union(x: Int, y: Int): Unit = link(findSet(x), findSet(y))

    private def link(x: Int, y: Int): Unit = {
      if (x != y) {
        parent(y) = x
      }
    }
  }
}
