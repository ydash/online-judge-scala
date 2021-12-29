package leetcode.codingchallenge2021.december

object P116 {
  def connect(root: Node): Node =
    if (root == null) root
    else {
      var headOfNextRow = root
      var current: Node = null
      while (headOfNextRow.left != null) {
        current = headOfNextRow
        while (current != null) {
          current.left.next = current.right
          if (current.next != null) current.right.next = current.next.left
          current = current.next
        }
        headOfNextRow = headOfNextRow.left
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
