package leetcode.codingchallenge2022.apr

import leetcode.LeetCodeSpec
import util.TreeNode

class P669Test extends LeetCodeSpec {
  private val table = Table(
    ("root", "low", "high", "expected"),
    (TreeNode(1, TreeNode(0), TreeNode(2)), 1, 2, TreeNode(1, null, TreeNode(2))),
    (TreeNode(1, TreeNode(0), TreeNode(2)), 0, 0, TreeNode(0)),
    (TreeNode(1, TreeNode(0), TreeNode(2)), 2, 4, TreeNode(2)),
    (
      TreeNode(3, TreeNode(0, null, TreeNode(2, TreeNode(1), null)), TreeNode(4)),
      1,
      3,
      TreeNode(3, TreeNode(2, TreeNode(1), null), null)
    )
  )

  test("Test of Trim a Binary Search Tree") {
    forAll(table) { (root, low, high, expected) =>
      P669.trimBST(root, low, high) shouldBe expected
    }
  }
}
