package leetcode.codingchallenge2021.october

import util.TreeNode

object PathSumIII {
  def pathSum(root: TreeNode, targetSum: Int): Int = {
    var count = 0
    def loop(node: TreeNode, sums: List[Int]): Unit = if (node != null) {
      val lst = for (sum <- 0 :: sums) yield {
        val s = node.value + sum
        if (s == targetSum) count += 1
        s
      }
      loop(node.left, lst)
      loop(node.right, lst)
    }
    loop(root, List())
    count
  }
}
