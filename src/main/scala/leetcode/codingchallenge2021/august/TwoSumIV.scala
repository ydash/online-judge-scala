package leetcode.codingchallenge2021.august

import util.TreeNode

import scala.collection.mutable

object TwoSumIV {
  def findTarget(root: TreeNode, k: Int): Boolean = {
    val set = new mutable.HashSet[Int]()
    val queue = mutable.Queue[TreeNode](root)

    while (queue.nonEmpty) {
      val node = queue.dequeue()
      if (set.contains(k - node.value)) return true
      set += node.value
      if (node.left != null) queue += node.left
      if (node.right != null) queue += node.right
    }

    false
  }
}
