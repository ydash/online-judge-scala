package leetcode.codingchallenge2021.december

import util.ListNode

// 1290. Convert Binary Number in a Linked List to Integer
object P1290 {
  def getDecimalValue(head: ListNode): Int = {
    var acc = 0
    var current = head
    while (current != null) {
      acc <<= 1
      acc += current.x
      current = current.next
    }
    acc
  }
}
