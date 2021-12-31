package leetcode.codingchallenge2021.december

import leetcode.LeetCodeSpec
import util.TreeNode

class P1026Test extends LeetCodeSpec {
  private val table = Table(
    ("root", "expected"),
    (TreeNode(3, TreeNode(1), null), 2),
    (
      TreeNode(
        8,
        TreeNode(3, TreeNode(1), TreeNode(6, TreeNode(4), TreeNode(7))),
        TreeNode(10, null, TreeNode(14, TreeNode(13), null))
      ),
      7
    ),
    (TreeNode(1, null, TreeNode(2, null, TreeNode(0, TreeNode(3), null))), 3)
  )

  test("Test of Maximum Difference Between Node and Ancestor") {
    forAll(table) { (root, expected) =>
      P1026.maxAncestorDiff(root) shouldBe expected
    }
  }
}
