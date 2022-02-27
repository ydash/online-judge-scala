package leetcode.codingchallenge2022.feb

import leetcode.LeetCodeSpec
import util.TreeNode

class P662Test extends LeetCodeSpec {
  private val table = Table(
    ("root", "expected"),
    (TreeNode(1, TreeNode(3, TreeNode(5), TreeNode(3)), TreeNode(2, null, TreeNode(0))), 4),
    (TreeNode(1, TreeNode(3, TreeNode(5), TreeNode(3)), null), 2),
    (TreeNode(1, TreeNode(3, TreeNode(5), null), TreeNode(2)), 2),
    (TreeNode(1), 1)
  )

  test("Test of Maximum Width of Binary Tree") {
    forAll(table) { (root, expected) =>
      P662.widthOfBinaryTree(root) shouldBe expected
    }
  }
}
