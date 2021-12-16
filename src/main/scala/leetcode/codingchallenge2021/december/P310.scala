package leetcode.codingchallenge2021.december

// 310. Minimum Height Trees
object P310 {
  def findMinHeightTrees(n: Int, edges: Array[Array[Int]]): List[Int] =
    if (n == 1) List(0)
    else {
      val adj = Array.fill(n)(Set.empty[Int])
      for (Array(a, b) <- edges) {
        adj(a) += b
        adj(b) += a
      }
      val leaves = for (i <- 0 until n if adj(i).size == 1) yield i
      @scala.annotation.tailrec
      def loop(ls: Seq[Int], rest: Int): List[Int] = {
        if (rest <= 2) ls.toList
        else {
          var acc = List[Int]()
          for (i <- ls; j <- adj(i)) {
            adj(j) -= i
            if (adj(j).size == 1) acc = j :: acc
          }
          loop(acc, rest - ls.length)
        }
      }
      loop(leaves, n)
    }
}
