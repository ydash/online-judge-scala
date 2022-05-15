package leetcode.codingchallenge2022.may

import util.TreeNode

// 1302. Deepest Leaves Sum
object P1302 {
  def deepestLeavesSum(root: TreeNode): Int = {
    val queue = collection.mutable.Queue(root)
    var sum = 0
    while (queue.nonEmpty) {
      sum = 0
      for (_ <- queue.indices) {
        val node = queue.dequeue()
        sum += node.value
        if (node.left != null) queue.enqueue(node.left)
        if (node.right != null) queue.enqueue(node.right)
      }
    }
    sum
  }
}
