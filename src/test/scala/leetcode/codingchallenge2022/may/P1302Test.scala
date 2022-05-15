package leetcode.codingchallenge2022.may

import leetcode.LeetCodeSpec
import util.TreeNode

class P1302Test extends LeetCodeSpec {
  private val table = Table(
    ("root", "expected"),
    (TreeNode(42), 42),
    (
      TreeNode(
        1,
        TreeNode(2, TreeNode(4, TreeNode(7), null), TreeNode(5)),
        TreeNode(3, null, TreeNode(6, null, TreeNode(8)))
      ),
      15
    ),
    (
      TreeNode(
        6,
        TreeNode(7, TreeNode(2, TreeNode(9), null), TreeNode(7, TreeNode(1), TreeNode(4))),
        TreeNode(8, TreeNode(1), TreeNode(3, null, TreeNode(5)))
      ),
      19
    )
  )

  test("Test of Deepest Leave Sum") {
    forAll(table) { (root, expected) =>
      P1302.deepestLeavesSum(root) shouldBe expected
    }
  }
}
