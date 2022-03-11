package leetcode.codingchallenge2022.mar

import leetcode.LeetCodeSpec
import util.ListNode

class P61Test extends LeetCodeSpec {
  private val table = Table(
    ("head", "k", "expected"),
    (ListNode(1, 2, 3, 4, 5), 2, ListNode(4, 5, 1, 2, 3)),
    (ListNode(0, 1, 2), 4, ListNode(2, 0, 1)),
    (ListNode(0, 1, 2), 0, ListNode(0, 1, 2)),
    (ListNode(0, 1, 2), 3, ListNode(0, 1, 2)),
    (ListNode(0), 100, ListNode(0)),
    (ListNode(), 100, ListNode())
  )

  test("Test of Rotate List") {
    forAll(table) { (head, k, expected) =>
      P61.rotateRight(head, k) shouldBe expected
    }
  }
}
