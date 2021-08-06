package leetcode.codingchallenge2021.august

import leetcode.LeetCodeSpec
import util.Node

class NAryTreeLevelOrderTraversalSpec extends LeetCodeSpec {
  private val table = Table(
    ("root", "expected"),
    (null, List()),
    (Node(1, Node(3, Node(5), Node(6)), Node(2), Node(4)), List(List(1), List(3, 2, 4), List(5, 6))),
    (Node(1, Node(2), Node(3, Node(6), Node(7, Node(11, Node(14)))), Node(4, Node(8, Node(12))), Node(5, Node(9, Node(13)), Node(10))), List(List(1), List(2, 3, 4, 5), List(6, 7, 8, 9, 10), List(11, 12, 13), List(14)))
  )
  test("Test of N-ary Tree Level Order Traversal") {
    forAll(table) { (root, expected) =>
      NAryTreeLevelOrderTraversal.levelOrder(root) shouldBe expected
    }
  }
}
