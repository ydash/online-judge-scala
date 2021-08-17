package leetcode.codingchallenge2021.august

import util.TreeNode

import scala.collection.mutable

object CountGoodNodesInBinaryTree {
  def goodNodes(root: TreeNode): Int = {
    val stack = mutable.Stack(root -> Int.MinValue)
    var count = 0

    while (stack.nonEmpty) {
      val (node, maxValue) = stack.pop()
      if (node.value >= maxValue) count += 1
      val newMax = node.value max maxValue
      if (node.left != null) stack.push(node.left -> newMax)
      if (node.right != null) stack.push(node.right -> newMax)
    }

    count
  }
}
