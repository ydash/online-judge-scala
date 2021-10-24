package leetcode.codingchallenge2021.october

import util.TreeNode

import scala.annotation.tailrec

object CountCompleteTreeNodes {
  def countNodes(root: TreeNode): Int = {

    @tailrec
    def depth(node: TreeNode, acc: Int = 0): Int =
      if (node == null) acc
      else depth(node.left, acc + 1)

    @tailrec
    def count(node: TreeNode, acc: Int = 0): Int =
      if (node == null) acc
      else {
        val ld = depth(node.left)
        val rd = depth(node.right)
        if (ld == rd) count(node.right, acc + (1 << ld))
        else count(node.left, acc + (1 << rd))
      }

    count(root)
  }
}
