package leetcode.codingchallenge2022.apr

import leetcode.LeetCodeSpec
import util.ListNode

class P1721Test extends LeetCodeSpec {
  private val table = Table(
    ("head", "k", "expected"),
    (ListNode(1, 2, 3, 4, 5), 2, ListNode(1, 4, 3, 2, 5)),
    (ListNode(1, 2, 3, 4, 5), 1, ListNode(5, 2, 3, 4, 1)),
    (ListNode(1, 2, 3, 4, 5), 3, ListNode(1, 2, 3, 4, 5)),
    (ListNode(1, 2, 3, 4, 5), 5, ListNode(5, 2, 3, 4, 1)),
    (ListNode(7, 9, 6, 6, 7, 8, 3, 0, 9, 5), 5, ListNode(7, 9, 6, 6, 8, 7, 3, 0, 9, 5)),
    (ListNode(7, 9, 6, 6, 7, 8, 3, 0, 9, 5), 6, ListNode(7, 9, 6, 6, 8, 7, 3, 0, 9, 5)),
    (ListNode(7, 9, 6, 6, 7, 8, 3, 0, 9, 5), 3, ListNode(7, 9, 0, 6, 7, 8, 3, 6, 9, 5))
  )

  test("Test of Swapping Nodes in a Linked List") {
    forAll(table) { (head, k, expected) =>
      P1721.swapNodes(head, k) shouldBe expected
    }
  }
}
