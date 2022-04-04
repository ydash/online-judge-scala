package leetcode.codingchallenge2022.apr

import util.ListNode

// 1721. Swapping Nodes in a Linked List
object P1721 {
  def swapNodes(head: ListNode, k: Int): ListNode = {
    var slow, fast = head
    for (_ <- 1 until k) fast = fast.next
    val kThNodeFromHead = fast
    while (fast.next != null) {
      slow = slow.next
      fast = fast.next
    }
    val kThNodeFromEnd = slow
    val tmp = kThNodeFromEnd.x
    kThNodeFromEnd.x = kThNodeFromHead.x
    kThNodeFromHead.x = tmp

    head
  }
}
