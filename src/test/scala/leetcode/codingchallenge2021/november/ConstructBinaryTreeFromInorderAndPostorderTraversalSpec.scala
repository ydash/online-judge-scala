package leetcode.codingchallenge2021.november

import leetcode.LeetCodeSpec
import util.TreeNode

class ConstructBinaryTreeFromInorderAndPostorderTraversalSpec extends LeetCodeSpec {
  private val table = Table(
    ("inorder", "postorder", "expected"),
    (Array(9, 3, 15, 20, 7), Array(9, 15, 7, 20, 3), TreeNode(3, TreeNode(9), TreeNode(20, TreeNode(15), TreeNode(7)))),
    (Array(-1), Array(-1), TreeNode(-1)),
    (
      Array(3, 2, 4, 1, 5, 6),
      Array(3, 4, 2, 6, 5, 1),
      TreeNode(1, TreeNode(2, TreeNode(3), TreeNode(4)), TreeNode(5, null, TreeNode(6)))
    )
  )

  test("Test of Construct Binary Tree from Inorder and Postorder Traversal") {
    forAll(table) { (inorder, postorder, expected) =>
      ConstructBinaryTreeFromInorderAndPostorderTraversal.buildTree(inorder, postorder) shouldBe expected
    }
  }
}
