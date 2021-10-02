package leetcode.codingchallenge2021.september

import leetcode.LeetCodeSpec
import util.ListNode

class SplitLinkedListInPartsSpec extends LeetCodeSpec {
  private val table = Table(
    ("head", "k", "expected"),
    (ListNode(1, 2, 3), 5, Array(ListNode(1), ListNode(2), ListNode(3), null, null)),
    (ListNode(1, 2, 3, 4, 5), 5, Array(ListNode(1), ListNode(2), ListNode(3), ListNode(4), ListNode(5))),
    (ListNode(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 3, Array(ListNode(1, 2, 3, 4), ListNode(5, 6, 7), ListNode(8, 9, 10)))
  )

  test("Test of Split Linked List in Parts") {
    forAll(table) { (head, k, expected) =>
      SplitLinkedListInParts.splitListToParts(head, k) shouldBe expected
    }
  }
}
