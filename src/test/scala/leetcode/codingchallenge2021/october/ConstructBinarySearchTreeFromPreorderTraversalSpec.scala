package leetcode.codingchallenge2021.october

import leetcode.LeetCodeSpec
import util.TreeNode

class ConstructBinarySearchTreeFromPreorderTraversalSpec extends LeetCodeSpec {
  private val table = Table(
    ("preorder", "expected"),
    (Array(8, 5, 1, 7, 10, 12), TreeNode(8, TreeNode(5, TreeNode(1), TreeNode(7)), TreeNode(10, null, TreeNode(12)))),
    (Array(8, 5, 3, 1, 6), TreeNode(8, TreeNode(5, TreeNode(3, TreeNode(1), null), TreeNode(6)), null)),
    (Array(8, 5, 3, 1, 9), TreeNode(8, TreeNode(5, TreeNode(3, TreeNode(1), null), null), TreeNode(9))),
    (Array(1, 3), TreeNode(1, null, TreeNode(3))),
    (Array(2, 1), TreeNode(2, TreeNode(1), null)),
    (Array(1), TreeNode(1))
  )

  test("Test of Construct Binary Search Tree from Preorder Traversal") {
    forAll(table) { (preorder, expected) =>
      ConstructBinarySearchTreeFromPreorderTraversal.bstFromPreorder(preorder) shouldBe expected
    }
  }
}
