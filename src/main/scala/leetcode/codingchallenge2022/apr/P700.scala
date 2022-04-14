package leetcode.codingchallenge2022.apr

import util.TreeNode

// 700. Search in a Binary Search Tree
object P700 {
  @scala.annotation.tailrec
  def searchBST(root: TreeNode, target: Int): TreeNode = {
    if (root == null || root.value == target) root
    else if (target < root.value)  searchBST(root.left, target)
    else searchBST(root.right, target)
  }
}
