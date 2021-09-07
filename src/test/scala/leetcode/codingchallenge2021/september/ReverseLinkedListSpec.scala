package leetcode.codingchallenge2021.september

import leetcode.LeetCodeSpec
import util.ListNode

class ReverseLinkedListSpec extends LeetCodeSpec {
  private val table = Table(
    ("head", "expected"),
    (null, null),
    (ListNode(1), ListNode(1)),
    (ListNode(1, 2), ListNode(2, 1)),
    (ListNode(1, 2, 3, 4, 5), ListNode(5, 4, 3, 2, 1))
  )

  test("Test of Reverse Linked List") {
    forAll(table) { (head, expected) =>
      ReverseLinkedList.reverseList(head) shouldBe expected
    }
  }
}
