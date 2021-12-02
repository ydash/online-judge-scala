package leetcode.codingchallenge2021.december

import util.ListNode

// 328. Odd Even Linked List
object P328 {
  def oddEvenList(head: ListNode): ListNode = {
    if (head == null || head.next == null) head
    else {
      var current = head.next.next
      var oddCur = head
      val evenRoot = head.next
      var evenCur = evenRoot
      var i = 1
      while (current != null) {
        if (i % 2 != 0) {
          oddCur.next = current
          oddCur = current
        } else {
          evenCur.next = current
          evenCur = current
        }
        current = current.next
        i += 1
      }
      evenCur.next = null
      oddCur.next = evenRoot
      head
    }
  }
}
