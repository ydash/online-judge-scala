package leetcode.codingchallenge2021.december

import util.TreeNode

// 1026. Maximum Difference Between Node and Ancestor
object P1026 {
  def maxAncestorDiff(root: TreeNode): Int = dfs(root, root.value, root.value)

  private def dfs(node: TreeNode, maxVal: Int, minVal: Int): Int = {
    if (node == null) maxVal - minVal
    else {
      val newMaxVal = maxVal max node.value
      val newMinVal = minVal min node.value
      dfs(node.left, newMaxVal, newMinVal) max
        dfs(node.right, newMaxVal, newMinVal)
    }
  }
}
