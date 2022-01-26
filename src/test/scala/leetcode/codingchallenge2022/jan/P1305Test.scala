package leetcode.codingchallenge2022.jan

import leetcode.LeetCodeSpec
import util.TreeNode

class P1305Test extends LeetCodeSpec {
  private val table = Table(
    ("root1", "root2", "expected"),
    (null, null, List()),
    (null, TreeNode(1), List(1)),
    (TreeNode(2), null, List(2)),
    (TreeNode(1, null, TreeNode(8)), TreeNode(8, TreeNode(1), null), List(1, 1, 8, 8)),
    (TreeNode(2, TreeNode(1), TreeNode(4)), TreeNode(1, TreeNode(0), TreeNode(3)), List(0, 1, 1, 2, 3, 4))
  )

  test("Test of All Elements in Two Binary Search Trees") {
    forAll(table) { (root1, root2, expected) =>
      P1305.getAllElements(root1, root2) shouldBe expected
    }
  }
}
