package leetcode.codingchallenge2022.jan

import leetcode.LeetCodeSpec
import util.TreeNode

class P1022Test extends LeetCodeSpec {
  private val table = Table(
    ("root", "expected"),
    (TreeNode(0), 0),
    (TreeNode(0, TreeNode(1), null), 1),
    (TreeNode(1, TreeNode(0, TreeNode(0), TreeNode(1)), TreeNode(1, TreeNode(0), TreeNode(1))), 22),
  )

  test("Test of Sum of Root To Leaf Binary Numbers") {
    forAll(table) { (root, expected) =>
      P1022.sumRootToLeaf(root) shouldBe expected
    }
  }
}
