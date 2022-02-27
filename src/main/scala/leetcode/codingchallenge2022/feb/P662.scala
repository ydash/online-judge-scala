package leetcode.codingchallenge2022.feb

import util.TreeNode

// 662. Maximum Width of Binary Tree
object P662 {
  def widthOfBinaryTree(root: TreeNode): Int = {
    val queue = collection.mutable.ArrayDeque[(Int, TreeNode)](0 -> root)
    var result = 1
    while (queue.nonEmpty) {
      result = result max (queue.last._1 - queue.head._1 + 1)
      val lim = queue.length
      for (_ <- 0 until lim) {
        val (n, node) = queue.removeHead()
        if (node.left != null) queue += (2 * n + 1 -> node.left)
        if (node.right != null) queue += (2 * n + 2 -> node.right)
      }
    }
    result
  }
}
