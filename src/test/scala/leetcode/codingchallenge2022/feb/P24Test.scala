package leetcode.codingchallenge2022.feb

import leetcode.LeetCodeSpec
import util.ListNode

class P24Test extends LeetCodeSpec {
  private val table = Table(
    ("head", "expected"),
    (null, null),
    (ListNode(1), ListNode(1)),
    (ListNode(1, 2), ListNode(2, 1)),
    (ListNode(1, 2, 3), ListNode(2, 1, 3)),
    (ListNode(1, 2, 3, 4), ListNode(2, 1, 4, 3))
  )

  test("Test of Swap Nodes in Pairs") {
    forAll(table) { (head, expected) =>
      P24.swapPairs(head) shouldBe expected
    }
  }
}
