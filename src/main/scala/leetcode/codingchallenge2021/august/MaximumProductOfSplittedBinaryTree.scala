package leetcode.codingchallenge2021.august

import util.TreeNode

import scala.collection.mutable

object MaximumProductOfSplittedBinaryTree {
  def maxProduct(root: TreeNode): Int = {
    val mod = 1000000007
    val sum = TreeNode.sum(root)
    var result = 0L
    val stack = new mutable.Stack[TreeNode]()
    stack.push(root)
    while (stack.nonEmpty) {
      val node = stack.pop()
      if (node.left != null) {
        val leftSum = TreeNode.sum(node.left)
        val product = leftSum.toLong * (sum - leftSum)
        result = result max product
        stack.push(node.left)
      }
      if (node.right != null) {
        val rightSum = TreeNode.sum(node.right)
        val product = rightSum.toLong * (sum - rightSum)
        result = result max product
        stack.push(node.right)
      }
    }
    (result % mod).toInt
  }

  object TreeNode {
    val cache = new mutable.HashMap[TreeNode, Int]()

    def sum(root: TreeNode): Int = cache.getOrElseUpdate(
      root, {
        root.value +
          (if (root.left != null) sum(root.left) else 0) +
          (if (root.right != null) sum(root.right) else 0)
      }
    )
  }
}
