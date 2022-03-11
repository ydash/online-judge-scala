package leetcode.codingchallenge2022.mar

import util.ListNode

// 61. Rotate List
object P61 {
  def rotateRight(head: ListNode, k: Int): ListNode =
    if (head == null) head
    else {
      val len = length(head)
      val takeLen = (len - (k % len)) % len
      val (takenTail, droppedHead) = splitAt(head, takeLen)
      takenTail.foreach { node =>
        node.next = null
        var p = droppedHead
        while (p.next != null) p = p.next
        p.next = head
      }
      droppedHead
    }

  @scala.annotation.tailrec
  private def length(head: ListNode, acc: Int = 0): Int =
    if (head == null) acc
    else length(head.next, acc + 1)

  @scala.annotation.tailrec
  private def splitAt(current: ListNode, n: Int, prev: ListNode = null): (Option[ListNode], ListNode) =
    if (n <= 0) (Option(prev), current)
    else splitAt(current.next, n - 1, current)
}
