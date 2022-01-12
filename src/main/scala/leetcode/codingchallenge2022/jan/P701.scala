package leetcode.codingchallenge2022.jan

import util.TreeNode

// 701. Insert into a Binary Search Tree
class P701 {
  def insertIntoBST(root: TreeNode, n: Int): TreeNode = {
    if (root == null) return new TreeNode(n)
    var current, parent = root
    while (current != null) {
      parent = current
      if (current.value > n) current = current.left
      else current = current.right
    }
    if (parent.value > n) parent.left = new TreeNode(n)
    else parent.right = new TreeNode(n)
    root
  }
}
