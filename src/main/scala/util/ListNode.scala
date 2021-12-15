package util

import scala.collection.mutable.ListBuffer

class ListNode(_x: Int = 0, _next: ListNode = null) {
  var next: ListNode = _next
  var x: Int = _x

  def toList: List[Int] = {
    val buffer = ListBuffer[Int]()
    var current = this
    while (current != null) {
      buffer += current.x
      current = current.next
    }
    buffer.toList
  }

  override def equals(that: Any): Boolean = that match {
    case ln: ListNode => this.toList == ln.toList
    case _            => false
  }

  override def toString: String = this.toList.toString()
}

object ListNode {
  def apply(nums: Int*): ListNode = nums match {
    case Nil          => null
    case head +: tail => new ListNode(head, ListNode(tail: _*))
  }
}
