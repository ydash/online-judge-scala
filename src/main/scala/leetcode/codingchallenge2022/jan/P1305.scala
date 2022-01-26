package leetcode.codingchallenge2022.jan

import util.TreeNode

// 1305. All Elements in Two Binary Search Trees
object P1305 {
  def getAllElements(root1: TreeNode, root2: TreeNode): List[Int] = merge(traverse(root1), traverse(root2))

  @scala.annotation.tailrec
  private def merge(l1: List[Int], l2: List[Int], acc: List[Int] = Nil): List[Int] = (l1, l2) match {
    case (Nil, _)             => l2.foldLeft(acc) { (lst, n) => n :: lst }
    case (_, Nil)             => l1.foldLeft(acc) { (lst, n) => n :: lst }
    case (h1 :: t1, h2 :: t2) => if (h1 < h2) merge(l1, t2, h2 :: acc) else merge(t1, l2, h1 :: acc)
  }

  private def traverse(root: TreeNode): List[Int] = {
    var list: List[Int] = Nil

    def dfs(node: TreeNode): Unit = {
      if (node != null) {
        dfs(node.left)
        list = node.value :: list
        dfs(node.right)
      }
    }

    dfs(root)
    list
  }
}
