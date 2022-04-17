package leetcode.codingchallenge2022.apr

import leetcode.LeetCodeSpec
import util.TreeNode

class P897Test extends LeetCodeSpec {
  private val table = Table(
    ("root", "expected"),
    (
      TreeNode(4, TreeNode(2, TreeNode(1), TreeNode(3)), TreeNode(6, TreeNode(5), TreeNode(7))),
      TreeNode(
        1,
        null,
        TreeNode(2, null, TreeNode(3, null, TreeNode(4, null, TreeNode(5, null, TreeNode(6, null, TreeNode(7))))))
      )
    ),
    (TreeNode(5, TreeNode(1), TreeNode(7)), TreeNode(1, null, TreeNode(5, null, TreeNode(7)))),
    (TreeNode(42), TreeNode(42))
  )

  test("Test of Convert BST to Greater Tree") {
    forAll(table) { (root, expected) =>
      P897.increasingBST(root) shouldBe expected
    }
  }
}
