package leetcode.codingchallenge2022.apr

// 785. Is Graph Bipartite?
object P785 {
  def isBipartite(graph: Array[Array[Int]]): Boolean = {
    val a, b, visited = collection.mutable.Set[Int]()
    val stack = collection.mutable.Stack[Int](graph.indices: _*)
    while (stack.nonEmpty) {
      val i = stack.pop()
      if (!visited.contains(i)) {
        visited += i
        if (a.contains(i)) b ++= graph(i)
        else {
          b += i
          a ++= graph(i)
        }
        for (j <- graph(i) if !visited.contains(j)) stack.push(j)
      }
    }
    (a intersect b).isEmpty
  }
}
