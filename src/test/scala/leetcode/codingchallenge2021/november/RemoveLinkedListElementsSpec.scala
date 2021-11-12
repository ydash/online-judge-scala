package leetcode.codingchallenge2021.november

import leetcode.LeetCodeSpec
import util.ListNode

class RemoveLinkedListElementsSpec extends LeetCodeSpec {
  private val table = Table(
    ("head", "target", "expected"),
    (ListNode(1, 2, 6, 3, 4, 5, 6), 6, ListNode(1, 2, 3, 4, 5)),
    (ListNode(), 1, ListNode()),
    (ListNode(7, 7, 7), 7, ListNode()),
    (ListNode(1, 2, 3, 4, 5), 1, ListNode(2, 3, 4, 5)),
    (ListNode(1, 2, 3, 4, 5), 5, ListNode(1, 2, 3, 4)),
    (ListNode(1, 2, 2, 2, 5), 2, ListNode(1, 5))
  )

  test("Test of Remove Linked List Elements") {
    forAll(table) { (head, target, expected) =>
      RemoveLinkedListElements.removeElements(head, target) shouldBe expected
    }
  }
}
