package leetcode.codingchallenge2021.october

import util.TreeNode

object CousinsInBinaryTree {
  def isCousins(root: TreeNode, x: Int, y: Int): Boolean = {
    var xDepth, yDepth, xParent, yParent = -1
    def search(node: TreeNode, parent: Int, depth: Int): Unit =
      if (node != null) {
        if (x == node.value) {
          xDepth = depth
          xParent = parent
        }
        if (y == node.value) {
          yDepth = depth
          yParent = parent
        }
        search(node.left, node.value, depth + 1)
        search(node.right, node.value, depth + 1)
      }

    search(root, -1, 0)
    xDepth == yDepth && xParent != yParent
  }
}
