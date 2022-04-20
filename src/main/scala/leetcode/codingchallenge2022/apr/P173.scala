package leetcode.codingchallenge2022.apr

import util.TreeNode

// 173. Binary Search Tree Iterator
object P173 {
  class BSTIterator(root: TreeNode) {
    private val stack = collection.mutable.Stack[TreeNode]()
    pushAllLeft(root)

    def next(): Int = {
      val result = stack.pop()
      pushAllLeft(result.right)
      result.value
    }

    def hasNext: Boolean = stack.nonEmpty

    private def pushAllLeft(node: TreeNode): Unit = {
      var current = node
      while (current != null) {
        stack.push(current)
        current = current.left
      }
    }
  }
}
