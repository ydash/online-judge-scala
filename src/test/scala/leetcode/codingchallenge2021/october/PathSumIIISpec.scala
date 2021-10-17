package leetcode.codingchallenge2021.october

import leetcode.LeetCodeSpec
import util.TreeNode

class PathSumIIISpec extends LeetCodeSpec {
  private val table = Table(
    ("root", "targetSum", "expected"),
    (
      TreeNode(
        10,
        TreeNode(5, TreeNode(3, TreeNode(3), TreeNode(-2)), TreeNode(2, null, TreeNode(1))),
        TreeNode(-3, null, TreeNode(11))
      ),
      8,
      3
    ),
    (
      TreeNode(
        5,
        TreeNode(4, TreeNode(11, TreeNode(7), TreeNode(2)), null),
        TreeNode(8, TreeNode(13), TreeNode(4, TreeNode(5), TreeNode(1)))
      ),
      22,
      3
    ),
    (TreeNode(1), 1, 1),
    (null, 3, 0),
    (TreeNode(1, TreeNode(2), TreeNode(3)), 5, 0)
  )

  test("Test of Path Sum III") {
    forAll(table) { (root, targetSum, expected) =>
      PathSumIII.pathSum(root, targetSum) shouldBe expected
    }
  }
}
