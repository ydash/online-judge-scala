package leetcode.codingchallenge2021.december

import leetcode.LeetCodeSpec
import util.ListNode

class P876Test extends LeetCodeSpec {
  private val table = Table(
    ("head", "expected"),
    (ListNode(1), ListNode(1)),
    (ListNode(1, 2), ListNode(2)),
    (ListNode(1, 2, 3, 4, 5), ListNode(3, 4, 5)),
    (ListNode(1, 2, 3, 4, 5, 6), ListNode(4, 5, 6))
  )

  test("Test of Middle of the Linked List") {
    forAll(table) { (head, expected) =>
      P876.middleNode(head) shouldBe expected
    }
  }
}
