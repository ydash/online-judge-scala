package leetcode.codingchallenge2022.feb

import util.TreeNode

// 104. Maximum Depth of Binary Tree
object P104 {
  def maxDepth(root: TreeNode): Int =
    if (root == null) 0
    else 1 + maxDepth(root.left) max maxDepth(root.right)
}
