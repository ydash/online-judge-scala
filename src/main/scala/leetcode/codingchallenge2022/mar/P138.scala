package leetcode.codingchallenge2022.mar

// 138. Copy List with Random Pointer
object P138 {
  import collection.mutable.{Map => MutableMap}

  def copyRandomList(head: Node): Node =
    if (head == null) null
    else {
      var current = head
      val nodeStore = MutableMap[Node, Node]()
      while (current != null) {
        val newCurrent = getNode(nodeStore, current)
        Option(current.next).foreach { next =>
          val newNext = getNode(nodeStore, next)
          newCurrent.next = newNext
        }
        Option(current.random).foreach { rand =>
          val newRand = getNode(nodeStore, rand)
          newCurrent.random = newRand
        }

        current = current.next
      }
      nodeStore(head)
    }

  private def getNode(map: MutableMap[Node, Node], key: Node): Node =
    map.getOrElseUpdate(
      key, {
        val newNode = new Node(key.value)
        map += (key -> newNode)
        newNode
      }
    )

  class Node(var _value: Int) {
    var value: Int = _value
    var next: Node = null
    var random: Node = null
  }
}
