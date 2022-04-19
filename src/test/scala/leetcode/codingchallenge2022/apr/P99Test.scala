package leetcode.codingchallenge2022.apr

import leetcode.LeetCodeSpec
import util.TreeNode

class P99Test extends LeetCodeSpec {
  private val table = Table(
    ("root", "expected"),
    (TreeNode(2, TreeNode(3), TreeNode(1)), TreeNode(2, TreeNode(1), TreeNode(3))),
    (TreeNode(1, TreeNode(3, null, TreeNode(2)), null), TreeNode(3, TreeNode(1, null, TreeNode(2)), null)),
    (TreeNode(3, TreeNode(1), TreeNode(4, TreeNode(2), null)), TreeNode(2, TreeNode(1), TreeNode(4, TreeNode(3), null)))
  )

  test("Test of Recover Binary Search Tree") {
    forAll(table) { (root, expected) =>
      P99.recoverTree(root)
      root shouldBe expected
    }
  }
}
