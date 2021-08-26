package leetcode.codingchallenge2021.august

import leetcode.LeetCodeSpec

class VerifyPreorderSerializationOfABinaryTreeSpec extends LeetCodeSpec {
  private val table = Table(
    ("preorder", "expected"),
    ("9,3,4,#,#,1,#,#,2,#,6,#,#", true),
    ("1,#", false),
    ("9,#,#,1", false),
    ("9,#,#,1,#,#", false),
    ("#,#,#", false),
    ("1,2,3", false),
    ("#", true)
  )

  test("Test of Verify Preorder Serialization of a Binary Tree") {
    forAll(table) { (preorder, expected) =>
      VerifyPreorderSerializationOfABinaryTree.isValidSerialization(preorder) shouldBe expected
    }
  }
}
