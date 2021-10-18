package leetcode.codingchallenge2021.october

import leetcode.LeetCodeSpec
import util.TreeNode

class CousinsInBinaryTreeSpec extends LeetCodeSpec {
  private val table = Table(
    ("root", "x", "y", "expected"),
    (TreeNode(1, TreeNode(2, TreeNode(4), null), TreeNode(3)), 4, 3, false),
    (TreeNode(1, TreeNode(2, null, TreeNode(4)), TreeNode(3, null, TreeNode(5))), 4, 5, true),
    (TreeNode(1, TreeNode(2, null, TreeNode(4)), TreeNode(3)), 2, 3, false)
  )

  test("Test of Cousins in Binary Tree") {
    forAll(table) { (root, x, y, expected) =>
      CousinsInBinaryTree.isCousins(root, x, y) shouldBe expected
    }
  }
}
