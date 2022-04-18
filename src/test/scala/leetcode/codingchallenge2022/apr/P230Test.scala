package leetcode.codingchallenge2022.apr

import leetcode.LeetCodeSpec
import util.TreeNode

class P230Test extends LeetCodeSpec {
  private val table = Table(
    ("root", "k", "expected"),
    (TreeNode(1), 1, 1),
    (TreeNode(5, TreeNode(3, TreeNode(2, TreeNode(1), null), TreeNode(4)), TreeNode(6)), 1, 1),
    (TreeNode(5, TreeNode(3, TreeNode(2, TreeNode(1), null), TreeNode(4)), TreeNode(6)), 2, 2),
    (TreeNode(5, TreeNode(3, TreeNode(2, TreeNode(1), null), TreeNode(4)), TreeNode(6)), 3, 3),
    (TreeNode(5, TreeNode(3, TreeNode(2, TreeNode(1), null), TreeNode(4)), TreeNode(6)), 4, 4),
    (TreeNode(5, TreeNode(3, TreeNode(2, TreeNode(1), null), TreeNode(4)), TreeNode(6)), 5, 5),
    (TreeNode(5, TreeNode(3, TreeNode(2, TreeNode(1), null), TreeNode(4)), TreeNode(6)), 6, 6)
  )

  test("Test of Kth Smallest Element in a BST") {
    forAll(table) { (root, k, expected) =>
      P230.kthSmallest(root, k) shouldBe expected
    }
  }
}
