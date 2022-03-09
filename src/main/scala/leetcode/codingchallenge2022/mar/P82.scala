package leetcode.codingchallenge2022.mar

import util.ListNode

// 82. Remove Duplicates from Sorted List II
object P82 {
  def deleteDuplicates(head: ListNode): ListNode = {
    val dummyHead = new ListNode(Int.MinValue)
    dummyHead.next = head
    var prev = dummyHead
    var current = head
    while (current != null && current.next != null) {
      if (current.x == current.next.x) {
        val duplicateNum = current.x
        while (current != null && current.x == duplicateNum) current = current.next
        prev.next = current
      } else {
        prev = current
        current = current.next
      }
    }
    dummyHead.next
  }
}
