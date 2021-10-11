package leetcode.codingchallenge2021.october

import util.TreeNode

import scala.util.chaining.scalaUtilChainingOps

object DiameterOfBinaryTree {
  def diameterOfBinaryTree(root: TreeNode): Int = {
    def dfs(node: TreeNode): (Int, Int) =
      if (node == null) (0, -1)
      else {
        val (ld, ll) = dfs(node.left).pipe { case (a, b) => a -> (b + 1) }
        val (rd, rl) = dfs(node.right).pipe { case (a, b) => a -> (b + 1) }
        (ld max rd max (ll + rl), ll max rl)
      }

    dfs(root)._1
  }
}
