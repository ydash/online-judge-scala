package leetcode.codingchallenge2022.jan

import util.ListNode

import scala.util.Random

class P382(_head: ListNode) {
  val rand = new Random()

  def getRandom(): Int = {
    var current = _head
    var result = current.x
    var i = 1
    while (current.next != null) {
      current = current.next
      if (rand.nextInt(i + 1) == i) result = current.x
      i += 1
    }
    result
  }
}
