package leetcode.codingchallenge2021.august

import leetcode.LeetCodeSpec
import util.TreeNode

class CountGoodNodesInBinaryTreeSpec extends LeetCodeSpec {
  private val table = Table(
    ("root", "expected"),
    (TreeNode(3, TreeNode(1, TreeNode(3), null), TreeNode(4, TreeNode(1), TreeNode(5))), 4),
    (TreeNode(3, TreeNode(3, TreeNode(4), TreeNode(2)), null), 3),
    (TreeNode(42), 1),
    (TreeNode(42, TreeNode(1), TreeNode(2)), 1)
  )

  test("Test of Count Good Nodes In Binary Tree") {
    forAll(table) { (root, expected) =>
      CountGoodNodesInBinaryTree.goodNodes(root) shouldBe expected
    }
  }
}
