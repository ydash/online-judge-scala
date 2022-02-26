package leetcode.codingchallenge2022.feb

// 847. Shortest Path Visiting All Nodes
object P847 {
  def shortestPathLength(graph: Array[Array[Int]]): Int = {
    val visitAllNodes = (1 << graph.length) - 1
    val cache = collection.mutable.Set[(Int, Int)]()
    @scala.annotation.tailrec
    def bfs(stateList: List[(Int, Int)], count: Int): Int = {
      if (stateList.exists(_._2 == visitAllNodes)) count
      else {
        val newStateList = for {
          (current, visitedNodes) <- stateList
          adj <- graph(current)
          if !cache.contains((adj, visitedNodes | (1 << adj)))
        } yield {
          val updatedVisitedNodes = visitedNodes | (1 << adj)
          cache += ((adj, updatedVisitedNodes))
          (adj, updatedVisitedNodes)
        }
        bfs(newStateList, count + 1)
      }
    }

    val initStateList = for (i <- graph.indices.toList) yield i -> (1 << i)
    bfs(initStateList, 0)
  }
}
