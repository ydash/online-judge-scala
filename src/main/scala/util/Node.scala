package util

class Node(var _value: Int) {
  var value: Int = _value
  var children: List[Node] = List()
}

object Node {
  def apply(value: Int, children: Node*): Node = {
    val newNode = new Node(value)
    newNode.children = children.toList
    newNode
  }
}
