package leetcode.codingchallenge2021.december

import util.ListNode

import scala.collection.mutable

// 143. Reorder List
object P143 {
  def reorderList(head: ListNode): Unit = {
    val deque = mutable.ArrayDeque[ListNode]()
    var current = head
    while (current != null) {
      deque += current
      current = current.next
    }
    var p = deque.removeHead()
    while (deque.nonEmpty) {
      val l = deque.removeLast()
      p.next = l
      p = l
      val opt = deque.removeHeadOption()
      opt.foreach { h =>
        p.next = h
        p = h
      }
      p.next = null
    }
  }
}
