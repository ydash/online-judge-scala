package leetcode.codingchallenge2022.mar

import util.ListNode

// 21. Merge Two Sorted Lists
object P21 {
  def mergeTwoLists(list1: ListNode, list2: ListNode): ListNode = {
    val dummyHead = new ListNode()
    @scala.annotation.tailrec
    def loop(l1: ListNode, l2: ListNode, acc: ListNode): Unit = (l1, l2) match {
      case (null, _) => acc.next = l2
      case (_, null) => acc.next = l1
      case _ =>
        if (l1.x < l2.x) {
          acc.next = l1
          loop(l1.next, l2, acc.next)
        } else {
          acc.next = l2
          loop(l1, l2.next, acc.next)
        }
    }
    loop(list1, list2, dummyHead)
    dummyHead.next
  }
}
