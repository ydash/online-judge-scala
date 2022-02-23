package leetcode.codingchallenge2022.feb

// 133. Clone Graph
object P133 {
  def cloneGraph(graph: Node): Node =
    if (graph == null) null
    else {
      val map = collection.mutable.Map[Int, Node]()
      def dfs(node: Node): Node =
        if (map.contains(node.value)) map(node.value)
        else {
          val clone = new Node(node.value)
          map += (clone.value -> clone)
          for (adj <- node.neighbors) clone.neighbors = dfs(adj) :: clone.neighbors
          clone
        }
      dfs(graph)
    }

  class Node(var _value: Int) {
    var value: Int = _value
    var neighbors: List[Node] = List()
  }

}
