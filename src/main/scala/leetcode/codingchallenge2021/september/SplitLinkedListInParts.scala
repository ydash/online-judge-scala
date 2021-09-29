package leetcode.codingchallenge2021.september

import util.ListNode

object SplitLinkedListInParts {
  def splitListToParts(head: ListNode, k: Int): Array[ListNode] = {
    val (length, extra) = {
      var acc = 0
      var current = head
      while (current != null) {
        acc += 1
        current = current.next
      }
      acc / k -> acc % k
    }

    val answer: Array[ListNode] = new Array(k)
    var current = head
    for (i <- answer.indices) {
      val (h, rest) = take(current, length + (if (i < extra) 1 else 0))
      current = rest
      answer(i) = h
    }

    answer
  }

  private def take(root: ListNode, n: Int): (ListNode, ListNode) = {
    var i = 0
    var last: Option[ListNode] = None
    var tail = root
    while (tail != null && i < n) {
      i += 1
      last = Some(tail)
      tail = tail.next
    }
    last.foreach(_.next = null)
    root -> tail
  }
}
