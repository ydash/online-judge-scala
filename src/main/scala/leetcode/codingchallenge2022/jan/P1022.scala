package leetcode.codingchallenge2022.jan

import util.TreeNode

// 1022. Sum of Root To Leaf Binary Numbers
object P1022 {
  def sumRootToLeaf(root: TreeNode, acc: Int = 0): Int = {
    if (root == null) 0
    else {
      val x = (acc << 1) + root.value
      if (root.left == null && root.right == null) x
      else sumRootToLeaf(root.left, x) + sumRootToLeaf(root.right, x)
    }
  }
}
