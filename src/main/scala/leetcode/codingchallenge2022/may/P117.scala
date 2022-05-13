package leetcode.codingchallenge2022.may

// 117. Populating Next Right Pointers in Each Node II
object P117 {
  def connect(root: Node): Node = {
    var parent = root
    while (parent != null) {
      var current: Node = null
      var nextHead: Node = null
      while (parent != null) {
        if (parent.left != null) {
          if (current != null) current.next = parent.left
          else nextHead = parent.left
          current = parent.left
        }
        if (parent.right != null) {
          if (current != null) current.next = parent.right
          else nextHead = parent.right
          current = parent.right
        }
        parent = parent.next
      }
      parent = nextHead
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
