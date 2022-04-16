package leetcode.codingchallenge2022.apr

import util.TreeNode

// 538. Convert BST to Greater Tree
object P538 {
  def convertBST(root: TreeNode): TreeNode = {
    def update(current: TreeNode, acc: Int): Int = {
      if (current == null) acc
      else {
        val r = update(current.right, acc)
        current.value = r + current.value
        update(current.left, current.value)
      }
    }
    update(root, 0)
    root
  }
}
