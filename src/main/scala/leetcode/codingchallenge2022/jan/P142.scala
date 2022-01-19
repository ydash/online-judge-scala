package leetcode.codingchallenge2022.jan

import util.ListNode

// 142. Linked List Cycle II
object P142 {
  def detectCycle(head: ListNode): ListNode = {
    var slow = head
    var fast = head
    while (fast != null && fast.next != null) {
      slow = slow.next
      fast = fast.next.next
      if (slow == fast) {
        var beginCycle = head
        while (beginCycle != slow) {
          beginCycle = beginCycle.next
          slow = slow.next
        }
        return beginCycle
      }
    }
    null
  }
}
