package leetcode.codingchallenge2022.jan

import util.TreeNode

// 701. Insert into a Binary Search Tree
class P701 {
  def insertIntoBST(root: TreeNode, n: Int): TreeNode = {
    if (root == null) new TreeNode(n)
    else {
      if (root.value > n) root.left = insertIntoBST(root.left, n)
      else root.right = insertIntoBST(root.right, n)
      root
    }
  }
}
