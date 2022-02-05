package leetcode.codingchallenge2022.feb

import leetcode.LeetCodeSpec
import util.ListNode

class P23Test extends LeetCodeSpec {
  private val table = Table(
    ("lists", "expected"),
    (Array.empty[ListNode], ListNode()),
    (Array(ListNode(), ListNode(), ListNode()), ListNode()),
    (Array(ListNode(1, 2, 3)), ListNode(1, 2, 3)),
    (Array(ListNode(1, 3, 5), ListNode(2, 4, 6)), ListNode(1, 2, 3, 4, 5, 6)),
    (Array(ListNode(1, 4, 5), ListNode(1, 3, 4), ListNode(2, 6)), ListNode(1, 1, 2, 3, 4, 4, 5, 6))
  )

  test("Test of Merge k Sorted Lists") {
    forAll(table) { (lists, expected) =>
      P23.mergeKLists(lists) shouldBe expected
    }
  }
}
