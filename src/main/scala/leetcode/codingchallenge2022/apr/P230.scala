package leetcode.codingchallenge2022.apr

import util.TreeNode

// 230. Kth Smallest Element in a BST
object P230 {
  def kthSmallest(root: TreeNode, k: Int): Int = {
    val stack = collection.mutable.Stack[TreeNode](root)
    var count = 0
    while (stack.nonEmpty && count != k) {
      var current = stack.pop()
      while (current != null) {
        stack.push(current)
        current = current.left
      }

      count += 1
      if (count != k) stack.push(stack.pop().right)
    }

    stack.pop().value
  }
}
