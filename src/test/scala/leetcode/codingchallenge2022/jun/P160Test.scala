package leetcode.codingchallenge2022.jun

import leetcode.LeetCodeSpec

class P160Test extends LeetCodeSpec {
  test("Test of Intersection of Two Linked Lists") {
    import P160._

    val shared = ListNode(8, 4, 5)
    val a = new ListNode(4, new ListNode(1, shared))
    val b = new ListNode(5, new ListNode(6, new ListNode(1, shared)))
    getIntersectionNode(a, b) shouldBe shared

    val c = ListNode(2, 6, 4)
    val d = ListNode(1, 5)
    getIntersectionNode(c, d) shouldBe null
  }
}
