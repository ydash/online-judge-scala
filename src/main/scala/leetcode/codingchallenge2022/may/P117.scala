package leetcode.codingchallenge2022.may

// 117. Populating Next Right Pointers in Each Node II
object P117 {
  def connect(root: Node): Node = {
    val queue = collection.mutable.Queue[Node](root)
    while (queue.nonEmpty) {
      var prev: Node = null
      for (_ <- queue.indices) {
        val current = queue.dequeue()
        if (prev != null) {
          prev.next = current
        }
        if (current != null) {
          queue.enqueue(current.left, current.right)
          prev = current
        }
      }
    }
    root
  }

  class Node(var _value: Int) {
    var value: Int = _value
    var left: Node = _
    var right: Node = _
    var next: Node = _
  }

}
