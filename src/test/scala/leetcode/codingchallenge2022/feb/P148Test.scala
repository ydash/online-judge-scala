package leetcode.codingchallenge2022.feb

import leetcode.LeetCodeSpec
import util.ListNode

class P148Test extends LeetCodeSpec {
  private val table = Table(
    ("head", "expected"),
    (ListNode(), ListNode()),
    (ListNode(1), ListNode(1)),
    (ListNode(2, 1), ListNode(1, 2)),
    (ListNode(2, 3, 1), ListNode(1, 2, 3)),
    (ListNode(4, 2, 1, 3), ListNode(1, 2, 3, 4)),
    (ListNode(-1, 5, 3, 4, 0), ListNode(-1, 0, 3, 4, 5))
  )

  test("Test of Sort List") {
    forAll(table) { (head, expected) =>
      P148.sortList(head) shouldBe expected
    }
  }
}
