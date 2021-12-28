package leetcode.codingchallenge2021.december

import util.ListNode

object P876 {
  def middleNode(head: ListNode): ListNode = {
    var middle, last = head
    while (last != null && last.next != null) {
      middle = middle.next
      last = last.next.next
    }
    middle
  }
}
