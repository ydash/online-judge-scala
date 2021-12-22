package leetcode.codingchallenge2021.december

import leetcode.LeetCodeSpec
import util.ListNode

class P143Test extends LeetCodeSpec {
  private val table = Table(
    ("head", "expected"),
    (ListNode(1), ListNode(1)),
    (ListNode(1, 2), ListNode(1, 2)),
    (ListNode(1, 2, 3), ListNode(1, 3, 2)),
    (ListNode(1, 2, 3, 4), ListNode(1, 4, 2, 3)),
    (ListNode(1, 2, 3, 4, 5), ListNode(1, 5, 2, 4, 3))
  )

  test("Test of Reorder List") {
    forAll(table) { (head, expected) =>
      P143.reorderList(head)
      head shouldBe expected
    }
  }
}
