package leetcode.codingchallenge2021.december

import leetcode.LeetCodeSpec
import util.ListNode

class P147Test extends LeetCodeSpec {
  private val table = Table(
    ("head", "expected"),
    (ListNode(4, 2, 1, 3), ListNode(1, 2, 3, 4)),
    (ListNode(-1, 5, 3, 4, 0), ListNode(-1, 0, 3, 4, 5))
  )

  test("Test of Insertion Sort List") {
    forAll(table) { (head, expected) =>
      P147.insertionSortList(head) shouldBe expected
    }
  }
}
