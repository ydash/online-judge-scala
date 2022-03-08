package leetcode.codingchallenge2022.mar

import util.ListNode

// 141. Linked List Cycle
object P141 {
  def hasCycle(head: ListNode): Boolean = {
    var slow, fast = head
    while (fast.next != null && fast.next.next != null) {
      slow = slow.next
      fast = fast.next.next
      if (slow == fast) return true
    }
    false
  }
}
