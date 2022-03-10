package leetcode.codingchallenge2022.mar

import util.ListNode

// 2. Add Two Numbers
object P2 {
  def addTwoNumbers(l1: ListNode, l2: ListNode): ListNode = {
    val dummyHead = new ListNode()
    @scala.annotation.tailrec
    def loop(current: ListNode, l: Option[ListNode], r: Option[ListNode], carryUp: Int): Unit = (l, r) match {
      case (None, None) => if (carryUp != 0) current.next = new ListNode(carryUp)
      case _ =>
        val sum = l.map(_.x).getOrElse(0) + r.map(_.x).getOrElse(0) + carryUp
        current.next = new ListNode(sum % 10)
        loop(current.next, l.flatMap(node => Option(node.next)), r.flatMap(node => Option(node.next)), sum / 10)
    }
    loop(dummyHead, Option(l1), Option(l2), carryUp = 0)
    dummyHead.next
  }
}
