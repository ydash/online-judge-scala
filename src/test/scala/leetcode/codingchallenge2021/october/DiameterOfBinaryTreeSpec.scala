package leetcode.codingchallenge2021.october

import leetcode.LeetCodeSpec
import util.TreeNode

class DiameterOfBinaryTreeSpec extends LeetCodeSpec {
  private val table = Table(
    ("root", "expected"),
    (TreeNode(1, TreeNode(2, TreeNode(4), TreeNode(5)), TreeNode(3)), 3),
    (TreeNode(1), 0),
    (TreeNode(1, TreeNode(2), TreeNode(3)), 2)
  )

  test("Test of Diameter of Binary Tree") {
    forAll(table) { (root, expected) =>
      DiameterOfBinaryTree.diameterOfBinaryTree(root) shouldBe expected
    }
  }
}
