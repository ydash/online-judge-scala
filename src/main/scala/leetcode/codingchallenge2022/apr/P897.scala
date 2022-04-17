package leetcode.codingchallenge2022.apr

import util.TreeNode

// 897. Increasing Order Search Tree
object P897 {
  def increasingBST(root: TreeNode): TreeNode = {
    def rearrange(current: TreeNode, acc: TreeNode): TreeNode =
      if (current == null) acc
      else {
        val parent = rearrange(current.left, acc)
        current.left = null
        parent.right = current
        rearrange(current.right, current)
      }
    val dummy = new TreeNode()
    rearrange(root, dummy)
    dummy.right
  }
}
