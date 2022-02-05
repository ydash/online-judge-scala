package leetcode.codingchallenge2022.feb

import util.ListNode

// 23. Merge k Sorted Lists
object P23 {
  def mergeKLists(lists: Array[ListNode]): ListNode = {
    val dummyRoot = new ListNode()
    var current = dummyRoot
    val pq = collection.mutable.PriorityQueue[ListNode](lists.filterNot(_ == null): _*)(Ordering.by(-_.x))
    while (pq.nonEmpty) {
      if (pq.length == 1) current.next = pq.dequeue()
      else {
        val hasMinHead = pq.dequeue()
        if (hasMinHead.next != null) pq.enqueue(hasMinHead.next)
        current.next = hasMinHead
        current = current.next
        current.next = null
      }
    }

    dummyRoot.next
  }
}
