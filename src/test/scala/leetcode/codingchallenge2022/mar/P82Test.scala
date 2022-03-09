package leetcode.codingchallenge2022.mar

import leetcode.LeetCodeSpec
import util.ListNode

class P82Test extends LeetCodeSpec {
  private val table = Table(
    ("head", "expected"),
    (null, null),
    (ListNode(1), ListNode(1)),
    (ListNode(1, 2, 3, 3, 4, 4, 5), ListNode(1, 2, 5)),
    (ListNode(1, 1, 1, 2, 3), ListNode(2, 3)),
    (ListNode(1, 1, 1), null)
  )

  test("Test of Remove Du;icates from Sorted List II") {
    forAll(table) { (head, expected) =>
      P82.deleteDuplicates(head) shouldBe expected
    }
  }
}
