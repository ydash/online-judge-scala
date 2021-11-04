package leetcode.codingchallenge2021.november

import leetcode.LeetCodeSpec
import util.TreeNode

class SumOfLeftLeavesSpec extends LeetCodeSpec {
  private val table = Table(
    ("root", "expected"),
    (TreeNode(3, TreeNode(9), TreeNode(20, TreeNode(15), TreeNode(7))), 24),
    (TreeNode(1), 0),
    (TreeNode(3, TreeNode(42), null), 42),
    (TreeNode(0, null, TreeNode(42)), 0)
  )

  test("Test of Sum of Left Leaves") {
    forAll(table) { (root, expected) =>
      SumOfLeftLeaves.sumOfLeftLeaves(root) shouldBe expected
    }
  }
}
