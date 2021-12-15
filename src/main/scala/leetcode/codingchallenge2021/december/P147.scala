package leetcode.codingchallenge2021.december

import util.ListNode

// 147. Insertion Sort List
object P147 {
  def insertionSortList(head: ListNode): ListNode = {
    var p = head
    var dummyRootOfSortedList = ListNode(Int.MinValue)
    while (p != null) {
      val insertNode = p
      p = p.next
      var current = dummyRootOfSortedList
      while (current.next != null && current.next.x < insertNode.x) current = current.next
      insertNode.next = current.next
      current.next = insertNode
    }
    dummyRootOfSortedList.next
  }
}
