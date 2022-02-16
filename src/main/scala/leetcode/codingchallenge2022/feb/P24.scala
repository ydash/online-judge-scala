package leetcode.codingchallenge2022.feb

import util.ListNode

// 24. Swap Nodes in Pairs
object P24 {
  def swapPairs(head: ListNode): ListNode = {
    val dummyHead = new ListNode(0)
    dummyHead.next = head
    var current = dummyHead
    while (current.next != null && current.next.next != null) {
      val first = current.next
      val second = current.next.next
      first.next = second.next
      second.next = first
      current.next = second
      current = current.next.next
    }
    dummyHead.next
  }
}
