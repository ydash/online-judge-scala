package leetcode.codingchallenge2021.december

import util.ListNode

// 328. Odd Even Linked List
object P328 {
  def oddEvenList(head: ListNode): ListNode = {
    if (head == null) head
    else {
      var oddCur = head
      val evenRoot = head.next
      var evenCur = evenRoot
      while (evenCur != null && evenCur.next != null) {
        oddCur.next = evenCur.next
        oddCur = oddCur.next
        evenCur.next = oddCur.next
        evenCur = evenCur.next
      }
      oddCur.next = evenRoot
      head
    }
  }
}
