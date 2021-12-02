package leetcode.codingchallenge2021.december

import leetcode.LeetCodeSpec
import util.ListNode

class P328Test extends LeetCodeSpec {
  private val table = Table(
    ("head", "expected"),
    (ListNode(), ListNode()),
    (ListNode(1), ListNode(1)),
    (ListNode(1, 2), ListNode(1, 2)),
    (ListNode(1, 2, 3), ListNode(1, 3, 2)),
    (ListNode(1, 2, 3, 4), ListNode(1, 3, 2, 4))
  )

  test("Test of Odd Even Linked List") {
    forAll(table) { (head, expected) =>
      P328.oddEvenList(head) shouldBe expected
    }
  }
}
