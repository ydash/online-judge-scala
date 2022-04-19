package leetcode.codingchallenge2022.apr

import util.TreeNode

// 99. Recover Binary Search Tree
object P99 {
  def recoverTree(root: TreeNode): Unit = {
    def inOrderTraverse(
        current: TreeNode,
        prev: Option[TreeNode],
        first: Option[TreeNode],
        second: Option[TreeNode]
    ): (Option[TreeNode], Option[TreeNode], Option[TreeNode]) = {
      if (current == null) (prev, first, second)
      else {
        val (p, f, s) = inOrderTraverse(current.left, prev, first, second)
        if (p.fold(false)(_.value >= current.value)) {
          inOrderTraverse(current.right, Option(current), f.fold(p)(Option(_)), Option(current))
        } else inOrderTraverse(current.right, Option(current), f, s)
      }
    }
    val (_, first, second) = inOrderTraverse(root, None, None, None)
    first.foreach(f =>
      second.foreach { s =>
        val tmp = f.value
        f.value = s.value
        s.value = tmp
      }
    )
  }
}
