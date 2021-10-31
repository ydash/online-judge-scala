package leetcode.codingchallenge2021.october

class FlattenMultilevelDoublyLinkedList {
  def flatten(head: Node): Node = {
    @scala.annotation.tailrec
    def loop(current: Node, stack: List[Node], prev: Node = null): Unit = {
      if (current != null) {
        if (prev != null) prev.next = current
        current.prev = prev
        if (current.child == null) {
          loop(current.next, stack, current)
        } else {
          val child = current.child
          current.child = null
          loop(child, current.next :: stack, current)
        }
      } else {
        stack match {
          case Nil          => ()
          case node :: rest => loop(node, rest, prev)
        }
      }
    }

    loop(head, Nil)
    head
  }
}

class Node(var _value: Int) {
  var value: Int = _value
  var prev: Node = null
  var next: Node = null
  var child: Node = null
}
