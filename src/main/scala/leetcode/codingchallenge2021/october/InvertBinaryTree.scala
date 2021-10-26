package leetcode.codingchallenge2021.october

import util.TreeNode

object InvertBinaryTree {
  def invertTree(root: TreeNode): TreeNode =
    if (root == null) root
    else {
      val tmp = invertTree(root.right)
      root.right = invertTree(root.left)
      root.left = tmp
      root
    }
}
