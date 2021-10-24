package leetcode.codingchallenge2021.october

import leetcode.LeetCodeSpec
import util.TreeNode

class CountCompleteTreeNodesSpec extends LeetCodeSpec {
  private val table = Table(
    ("root", "expected"),
    (null, 0),
    (TreeNode(1), 1),
    (TreeNode(1, TreeNode(2), null), 2),
    (TreeNode(1, TreeNode(2, TreeNode(4), TreeNode(5)), TreeNode(3, TreeNode(6), TreeNode(7))), 7),
    (TreeNode(1, TreeNode(2, TreeNode(4), TreeNode(5)), TreeNode(3, TreeNode(6), null)), 6),
    (TreeNode(1, (TreeNode(2, TreeNode(4), null)), TreeNode(4)), 4)
  )

  test("Test of Count Complete Tree Nodes") {
    forAll(table) { (root, expected) =>
      CountCompleteTreeNodes.countNodes(root) shouldBe expected
    }
  }
}
