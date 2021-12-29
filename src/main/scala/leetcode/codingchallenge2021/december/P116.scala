package leetcode.codingchallenge2021.december

object P116 {
  def connect(root: Node): Node =
    if (root == null) null
    else {
      val queue = new collection.mutable.Queue[Node]()
      queue += root
      var numOfNode = 1
      while (queue.nonEmpty) {
        var current: Node = null
        for (_ <- 0 until numOfNode) {
          val node = queue.dequeue()
          if (current != null) current.next = node
          current = node
          if (node.left != null) {
            queue += (node.left, node.right)
          }
        }
        numOfNode <<= 1
      }
      root
    }

  class Node(var _value: Int) {
    var value: Int = _value
    var left: Node = null
    var right: Node = null
    var next: Node = null
  }
}
