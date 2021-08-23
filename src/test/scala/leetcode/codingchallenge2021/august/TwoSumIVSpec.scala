package leetcode.codingchallenge2021.august

import leetcode.LeetCodeSpec
import util.TreeNode

class TwoSumIVSpec extends LeetCodeSpec {
  private val table = Table(
    ("root", "k", "expected"),
    (TreeNode(5, TreeNode(3, TreeNode(2), TreeNode(4)), TreeNode(6, null, TreeNode(7))), 9, true),
    (TreeNode(5, TreeNode(3, TreeNode(2), TreeNode(4)), TreeNode(6, null, TreeNode(7))), 28, false),
    (TreeNode(2, TreeNode(1), TreeNode(3)), 4, true),
    (TreeNode(2, TreeNode(1), TreeNode(3)), 1, false),
    (TreeNode(2, TreeNode(1), TreeNode(3)), 3, true)
  )

  test("Test of Two Sum IV - input is a BST") {
    forAll(table) { (root, k, expected) =>
      TwoSumIV.findTarget(root, k) shouldBe expected
    }
  }
}
