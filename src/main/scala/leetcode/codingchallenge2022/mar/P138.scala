package leetcode.codingchallenge2022.mar

// 138. Copy List with Random Pointer
object P138 {
  def copyRandomList(head: Node): Node =
    if (head == null) null
    else {
      var pointer = head
      while (pointer != null) {
        val copy = new Node(pointer.value)
        val next = pointer.next
        pointer.next = copy
        pointer.next.next = next
        pointer = next
      }
      pointer = head
      while (pointer != null) {
        Option(pointer.random).foreach { random =>
          pointer.next.random = random.next
        }
        pointer = pointer.next.next
      }
      val dummyHead = new Node(0)
      var copyPointer = dummyHead
      pointer = head
      while (pointer != null) {
        copyPointer.next = pointer.next
        pointer.next = pointer.next.next
        pointer = pointer.next
        copyPointer = copyPointer.next
      }
      dummyHead.next
    }

  class Node(var _value: Int) {
    var value: Int = _value
    var next: Node = null
    var random: Node = null
  }
}
