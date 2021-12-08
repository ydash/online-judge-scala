package leetcode.codingchallenge2021.december

import leetcode.LeetCodeSpec
import util.TreeNode

class P563Test extends LeetCodeSpec {
  private val table = Table(
    ("root", "expected"),
    (TreeNode(1, TreeNode(2), TreeNode(3)), 1),
    (TreeNode(4, TreeNode(2, TreeNode(3), TreeNode(5)), TreeNode(9, null, TreeNode(7))), 15),
    (
      TreeNode(
        21,
        TreeNode(7, TreeNode(1, TreeNode(3), TreeNode(3)), TreeNode(1)),
        TreeNode(14, TreeNode(2), TreeNode(2))
      ),
      9
    )
  )

  test("Test of Binary Tree Tilt") {
    forAll(table) { (root, expected) =>
      P563.findTilt(root) shouldBe expected
    }
  }
}
