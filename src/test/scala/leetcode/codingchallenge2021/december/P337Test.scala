package leetcode.codingchallenge2021.december

import leetcode.LeetCodeSpec
import util.TreeNode

class P337Test extends LeetCodeSpec {
  private val table = Table(
    ("root", "expected"),
    (TreeNode(3, TreeNode(2, null, TreeNode(3)), TreeNode(3, null, TreeNode(1))), 7),
    (TreeNode(3, TreeNode(4, TreeNode(1), TreeNode(3)), TreeNode(5, null, TreeNode(1))), 9)
  )

  test("Test of House Robber III") {
    forAll(table) { (root, expected) =>
      P337.rob(root) shouldBe expected
    }
  }
}
