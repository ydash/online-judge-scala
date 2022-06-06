package leetcode.codingchallenge2022.jun

// 160. Intersection of Two Linked Lists
object P160 {
  def getIntersectionNode(headA: ListNode, headB: ListNode): ListNode = {
    var a = headA
    var b = headB
    while (a != b) {
      a = if (a != null) a.next else headB
      b = if (b != null) b.next else headA
    }
    a
  }

  class ListNode(_x: Int = 0, _next: ListNode = null) {
    var next: ListNode = _next
    var x: Int = _x
  }

  object ListNode {
    def apply(nums: Int*): ListNode = nums match {
      case Nil          => null
      case head +: tail => new ListNode(head, ListNode(tail: _*))
    }
  }
}
