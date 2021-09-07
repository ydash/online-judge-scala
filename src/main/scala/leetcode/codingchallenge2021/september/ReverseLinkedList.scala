package leetcode.codingchallenge2021.september

import util.ListNode

import scala.annotation.tailrec

object ReverseLinkedList {
  @tailrec
  def reverseList(head: ListNode, acc: ListNode = null): ListNode =
    if (head == null) acc
    else {
      val next = head.next
      head.next = acc
      reverseList(next, head)
    }

}
