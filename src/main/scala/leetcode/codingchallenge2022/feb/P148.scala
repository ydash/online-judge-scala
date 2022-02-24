package leetcode.codingchallenge2022.feb

import util.ListNode

// 148. Sort List
object P148 {
  def sortList(head: ListNode): ListNode =
    if (head == null || head.next == null) head
    else {
      var slow, fast = head
      var prev: ListNode = null
      while (fast != null && fast.next != null) {
        prev = slow
        slow = slow.next
        fast = fast.next.next
      }
      if (prev != null) prev.next = null
      merge(sortList(head), sortList(slow))
    }

  private def merge(l1: ListNode, l2: ListNode): ListNode = {
    val dummyRoot = new ListNode()
    var current = dummyRoot
    var h1 = l1
    var h2 = l2
    while (h1 != null && h2 != null) {
      if (h1.x < h2.x) {
        current.next = h1
        h1 = h1.next
      } else {
        current.next = h2
        h2 = h2.next
      }
      current = current.next
      current.next = null
    }
    current.next = if (h1 == null) h2 else h1
    dummyRoot.next
  }
}
