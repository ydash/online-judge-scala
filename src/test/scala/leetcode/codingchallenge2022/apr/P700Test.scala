package leetcode.codingchallenge2022.apr

import leetcode.LeetCodeSpec
import util.TreeNode

class P700Test extends LeetCodeSpec {
  private val table = Table(
    ("root", "val", "expected"),
    (TreeNode(4, TreeNode(2, TreeNode(1), TreeNode(3)), TreeNode(7)), 2, TreeNode(2, TreeNode(1), TreeNode(3))),
    (TreeNode(4, TreeNode(2, TreeNode(1), TreeNode(3)), TreeNode(7)), 1, TreeNode(1)),
    (TreeNode(4, TreeNode(2, TreeNode(1), TreeNode(3)), TreeNode(7)), 3, TreeNode(3)),
    (TreeNode(4, TreeNode(2, TreeNode(1), TreeNode(3)), TreeNode(7)), 7, TreeNode(7)),
    (TreeNode(4, TreeNode(2, TreeNode(1), TreeNode(3)), TreeNode(7)), 5, null)
  )

  test("Test of Search in a Binary Search Tree") {
    forAll(table) { (root, target, expected) =>
      P700.searchBST(root, target) shouldBe expected
    }
  }
}
