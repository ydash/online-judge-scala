package leetcode.codingchallenge2021.august

import leetcode.LeetCodeSpec
import util.TreeNode

class PathSumIISpec extends LeetCodeSpec {
  private val table = Table(
    ("root", "targetSum", "expected"),
    (new TreeNode(5, new TreeNode(4, new TreeNode(11, new TreeNode(7), new TreeNode(2))), new TreeNode(8, new TreeNode(13), new TreeNode(4, new TreeNode(5), new TreeNode(1)))), 22, List(List(5, 4, 11, 2), List(5, 8, 4, 5))),
    (new TreeNode(1, new TreeNode(2), new TreeNode(3)), 5, List.empty),
    (new TreeNode(1, new TreeNode(2)), 0, List.empty),
    (new TreeNode(1), 1, List(List(1))),
    (new TreeNode(1, new TreeNode(-1, new TreeNode(1))), 1, List(List(1, -1, 1))),
    (null, 0, List())
  )

  test("Test of Path Sum II") {
    forAll(table) { (root, targetSum, expected) =>
      PathSumII.pathSum(root, targetSum) shouldBe expected
    }
  }
}
