package leetcode.codingchallenge2021.november

import leetcode.LeetCodeSpec
import util.TreeNode

class SumRootToLeafNumbersSpec extends LeetCodeSpec {
  private val table = Table(
    ("root", "expected"),
    (TreeNode(9), 9),
    (TreeNode(1, TreeNode(2), TreeNode(3)), 25),
    (TreeNode(4, TreeNode(9, TreeNode(5), TreeNode(1)), TreeNode(0)), 1026),
    (TreeNode(4, TreeNode(2), null), 42),
    (TreeNode(4, null, TreeNode(2)), 42)
  )

  test("Test of Sum Root to Leaf Numbers") {
    forAll(table) { (root, expected) =>
      SumRootToLeafNumbers.sumNumbers(root) shouldBe expected
    }
  }
}
