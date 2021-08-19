package leetcode.codingchallenge2021.august

import leetcode.LeetCodeSpec
import util.TreeNode

class MaximumProductOfSplittedBinaryTreeSpec extends LeetCodeSpec {
  private val table = Table(
    ("root", "expected"),
    (TreeNode(1, TreeNode(2, TreeNode(4), TreeNode(5)), TreeNode(3, TreeNode(6), null)), 110),
    (TreeNode(1, null, TreeNode(2, TreeNode(3), TreeNode(4, TreeNode(5), TreeNode(6)))), 90),
    (TreeNode(2, TreeNode(3, TreeNode(10, TreeNode(5), TreeNode(4)), TreeNode(7, TreeNode(11), TreeNode(1))), TreeNode(9, TreeNode(8), TreeNode(6))), 1025),
    (TreeNode(1, TreeNode(1), null), 1)
  )

  test("Test of Maximum Product of Splitted Binary Tree") {
    forAll(table) { (root, expected) =>
      MaximumProductOfSplittedBinaryTree.maxProduct(root) shouldBe expected
    }
  }
}
