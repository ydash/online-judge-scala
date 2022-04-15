package leetcode.codingchallenge2022.apr

import util.TreeNode

// 669. Trim a Binary Search Tree
object P669 {
  def trimBST(root: TreeNode, low: Int, high: Int): TreeNode = {
    if (root == null) null
    else if (root.value < low) trimBST(root.right, low, high)
    else if (root.value > high) trimBST(root.left, low, high)
    else {
      root.left = trimBST(root.left, low, high)
      root.right = trimBST(root.right, low, high)
      root
    }
  }
}
