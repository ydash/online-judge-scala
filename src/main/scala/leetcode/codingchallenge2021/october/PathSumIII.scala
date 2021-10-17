package leetcode.codingchallenge2021.october

import util.TreeNode

import scala.collection.mutable

object PathSumIII {
  def pathSum(root: TreeNode, targetSum: Int): Int = {
    var count = 0
    def dfs(node: TreeNode, sum: Int, prefix: mutable.Map[Int, Int]): Unit = if (node != null) {
      val current = node.value + sum
      count += prefix(current - targetSum)
      prefix(current) += 1

      dfs(node.left, current, prefix)
      dfs(node.right, current, prefix)
      prefix(current) -= 1
    }
    dfs(root, 0, mutable.Map(0 -> 1).withDefaultValue(0))
    count
  }
}
