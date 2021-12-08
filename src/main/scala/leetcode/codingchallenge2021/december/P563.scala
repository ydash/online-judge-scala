package leetcode.codingchallenge2021.december

import util.TreeNode

// 563. Binary Tree Tilt
object P563 {
  def findTilt(root: TreeNode): Int = {
    def traversal(node: TreeNode): (Int, Int) = {
      if (node == null) (0, 0)
      else {
        val (leftSum, leftTiltSum) = traversal(node.left)
        val (rightSum, rightTiltSum) = traversal(node.right)
        val tilt = (leftSum - rightSum).abs
        (leftSum + node.value + rightSum, leftTiltSum + rightTiltSum + tilt)
      }
    }
    traversal(root)._2
  }
}
