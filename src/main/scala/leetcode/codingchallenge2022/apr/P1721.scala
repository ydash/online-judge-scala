package leetcode.codingchallenge2022.apr

import util.ListNode

// 1721. Swapping Nodes in a Linked List
object P1721 {
  def swapNodes(head: ListNode, k: Int): ListNode = {
    val len = length(head)
    val dummyHead = new ListNode()
    dummyHead.next = head

    val indexOfA = k min len - k + 1
    val indexOfB = k max len - k + 1

    val prevA = get(dummyHead, indexOfA - 1)
    val a = prevA.next
    val nextA = a.next
    if (len % 2 == 0 && (len / 2 == indexOfA)) {
      val nextNextA = nextA.next
      prevA.next = nextA
      nextA.next = a
      a.next = nextNextA
    } else {
      val prevB = get(dummyHead, indexOfB - 1)
      val b = prevB.next
      val nextB = b.next
      prevA.next = b
      b.next = nextA
      prevB.next = a
      a.next = nextB
    }

    dummyHead.next
  }

  @scala.annotation.tailrec
  private def get(node: ListNode, i: Int): ListNode =
    if (i == 0) node
    else get(node.next, i - 1)

  @scala.annotation.tailrec
  private def length(node: ListNode, acc: Int = 0): Int =
    if (node == null) acc
    else length(node.next, acc + 1)
}
