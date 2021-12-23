package leetcode.codingchallenge2021.december

import util.ListNode

// 143. Reorder List
object P143 {
  def reorderList(head: ListNode): Unit = {
    val len = length(head)
    val mid = len / 2
    var p1 = head
    var p2 = head
    for (_ <- 0 until mid) p2 = p2.next
    p2 = reverse(p2)
    while (p1 != p2) {
      val tmp = p1.next
      p1.next = p2
      p1 = p2
      p2 = tmp
    }
  }
  @scala.annotation.tailrec
  private def length(head: ListNode, acc: Int = 0): Int =
    if (head == null) acc
    else length(head.next, acc + 1)

  def reverse(head: ListNode): ListNode = {
    var current = head.next
    var p = head
    p.next = null
    while (current != null) {
      val next = current.next
      current.next = p
      p = current
      current = next
    }
    p
  }
}
