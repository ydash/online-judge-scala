package leetcode.codingchallenge2022.may

// 1192. Critical Connections in a Network
object P1192 {
  def criticalConnections(n: Int, connections: List[List[Int]]): List[List[Int]] = {
    val buffer = collection.mutable.ListBuffer[List[Int]]()
    val adj = collection.mutable.Map[Int, List[Int]]().withDefaultValue(Nil)
    for (List(a, b) <- connections) {
      adj(a) = b :: adj(a)
      adj(b) = a :: adj(b)
    }
    val visited = new Array[Boolean](n)
    val low = new Array[Int](n)
    val label = new Array[Int](n)
    var id = 0
    def dfs(current: Int, prev: Int): Unit = {
      visited(current) = true
      low(current) = id
      label(current) = id
      id += 1
      for (next <- adj(current) if next != prev) {
        if (visited(next)) low(current) = low(current) min low(next)
        else {
          dfs(next, current)
          low(current) = low(current) min low(next)
          if (label(current) < low(next)) buffer += List(current, next)
        }
      }
    }
    dfs(0, 0)
    buffer.toList
  }
}
