package leetcode.codingchallenge2022.apr

import leetcode.LeetCodeSpec
import util.TreeNode

class P173Test extends LeetCodeSpec {
  test("Test of Binary Search Tree Iterator") {
    val iter = new P173.BSTIterator(TreeNode(7, TreeNode(3), TreeNode(15, TreeNode(9), TreeNode(20))))
    iter.next() shouldBe 3
    iter.next() shouldBe 7
    iter.hasNext shouldBe true
    iter.next() shouldBe 9
    iter.hasNext shouldBe true
    iter.next() shouldBe 15
    iter.hasNext shouldBe true
    iter.next() shouldBe 20
    iter.hasNext shouldBe false

    val iter2 = new P173.BSTIterator(TreeNode(42))
    iter2.hasNext shouldBe true
    iter2.next() shouldBe 42
    iter2.hasNext shouldBe false

    val iter3 = new P173.BSTIterator(null)
    iter3.hasNext shouldBe false
  }
}
