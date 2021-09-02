package leetcode.codingchallenge2021.september

import leetcode.LeetCodeSpec
import util.TreeNode

class UniqueBinarySearchTreesIISpec extends LeetCodeSpec {
  private val table = Table(
    ("n", "expected"),
    (1, List(TreeNode(1))),
    (2, List(TreeNode(1, null, TreeNode(2)), TreeNode(2, TreeNode(1), null))),
    (
      3,
      List(
        TreeNode(1, null, TreeNode(2, null, TreeNode(3))),
        TreeNode(1, null, TreeNode(3, TreeNode(2), null)),
        TreeNode(2, TreeNode(1), TreeNode(3)),
        TreeNode(3, TreeNode(1, null, TreeNode(2)), null),
        TreeNode(3, TreeNode(2, TreeNode(1), null), null)
      )
    )
  )

  test("Test of Unique Binary Search Tree") {
    forAll(table) { (n, expected) =>
      UniqueBinarySearchTreesII.generateTrees(n) should contain theSameElementsAs expected
    }
  }
}
