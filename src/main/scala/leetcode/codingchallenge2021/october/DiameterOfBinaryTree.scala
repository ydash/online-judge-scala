package leetcode.codingchallenge2021.october

import util.TreeNode

object DiameterOfBinaryTree {
  def diameterOfBinaryTree(root: TreeNode): Int = {
    def dfs(node: TreeNode): (Int, Int) =
      if (node == null) (0, 0)
      else {
        val (lDiam, lLen) = dfs(node.left)
        val (rDiam, rLen) = dfs(node.right)
        (lDiam max rDiam max (lLen + rLen), (lLen max rLen) + 1)
      }

    dfs(root)._1
  }
}
