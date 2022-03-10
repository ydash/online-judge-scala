package leetcode.codingchallenge2022.mar

import leetcode.LeetCodeSpec
import util.ListNode

class P2Test extends LeetCodeSpec {
  private val table = Table(
    ("l1", "l2", "expected"),
    (ListNode(2, 4, 3), ListNode(5, 6, 4), ListNode(7, 0, 8)),
    (ListNode(0), ListNode(0), ListNode(0)),
    (ListNode(9, 9, 9, 9, 9, 9, 9), ListNode(9, 9, 9, 9), ListNode(8, 9, 9, 9, 0, 0, 0, 1))
  )

  test("Test of Add Two Numbers") {
    forAll(table) { (l1, l2, expected) =>
      P2.addTwoNumbers(l1, l2) shouldBe expected
    }
  }
}
