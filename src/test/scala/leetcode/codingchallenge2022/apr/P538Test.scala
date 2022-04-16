package leetcode.codingchallenge2022.apr

import leetcode.LeetCodeSpec
import util.TreeNode

class P538Test extends LeetCodeSpec {
  private val table = Table(
    ("root", "expected"),
    (
      TreeNode(
        4,
        TreeNode(1, TreeNode(0), TreeNode(2, null, TreeNode(3))),
        TreeNode(6, TreeNode(5), TreeNode(7, null, TreeNode(8)))
      ),
      TreeNode(
        30,
        TreeNode(36, TreeNode(36), TreeNode(35, null, TreeNode(33))),
        TreeNode(21, TreeNode(26), TreeNode(15, null, TreeNode(8)))
      )
    ),
    (TreeNode(0, null, TreeNode(1)), TreeNode(1, null, TreeNode(1))),
    (TreeNode(42), TreeNode(42))
  )

  test("Test of Convert BST to Greater Tree") {
    forAll(table) { (root, expected) =>
      P538.convertBST(root) shouldBe expected
    }
  }
}
