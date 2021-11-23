package leetcode.codingchallenge2021.november

import util.TreeNode

object DeleteNodeInBST {
  def deleteNode(root: TreeNode, key: Int): TreeNode = {
    if (root == null) null
    else
      root.value match {
        case v if key < v =>
          root.left = deleteNode(root.left, key)
          root
        case v if key > v =>
          root.right = deleteNode(root.right, key)
          root
        case _ =>
          if (root.left == null) root.right
          else if (root.right == null) root.left
          else {
            var min = root.right
            while (min.left != null) min = min.left
            root.value = min.value
            root.right = deleteNode(root.right, root.value)
            root
          }
      }
  }
}
