package leetcode.codingchallenge2021.december

import util.TreeNode

// 337. House Robber III
object P337 {
  def rob(root: TreeNode): Int = {
    val cache = collection.mutable.Map[TreeNode, Int]()
    def aux(node: TreeNode): Int = {
      if (node == null) 0
      else
        cache.getOrElseUpdate(
          node, {
            var res = node.value
            if (node.left != null) res += aux(node.left.left) + aux(node.left.right)
            if (node.right != null) res += aux(node.right.left) + aux(node.right.right)
            res max (aux(node.left) + aux(node.right))
          }
        )
    }
    aux(root)
  }
}
