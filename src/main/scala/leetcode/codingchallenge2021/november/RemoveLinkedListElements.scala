package leetcode.codingchallenge2021.november

import util.ListNode

object RemoveLinkedListElements {
  def removeElements(head: ListNode, target: Int): ListNode = {
    val dummyRoot = new ListNode(0, head)
    var prev = dummyRoot
    var current = head
    while (current != null) {
      if (current.x == target) {
        prev.next = current.next
      } else {
        prev = current
      }
      current = current.next
    }
    dummyRoot.next
  }
}
