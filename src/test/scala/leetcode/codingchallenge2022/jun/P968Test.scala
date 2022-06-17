package leetcode.codingchallenge2022.jun

import leetcode.LeetCodeSpec
import util.TreeNode

class P968Test extends LeetCodeSpec {
  private val table = Table(
    ("root", "expected"),
    (TreeNode(0), 1),
    (TreeNode(0, TreeNode(0), null), 1),
    (TreeNode(0, null, TreeNode(0)), 1),
    (TreeNode(0, TreeNode(0, TreeNode(0), TreeNode(0)), null), 1),
    (TreeNode(0, TreeNode(0, TreeNode(0, TreeNode(0, null, TreeNode(0)), null), null), null), 2),
    (TreeNode(0, null, TreeNode(0, null, TreeNode(0, null, TreeNode(0)))), 2)
  )

  test("Test of Binary Tree Cameras") {
    forAll(table) { (root, expected) =>
      P968.minCameraCover(root) shouldBe expected
    }
  }
}
