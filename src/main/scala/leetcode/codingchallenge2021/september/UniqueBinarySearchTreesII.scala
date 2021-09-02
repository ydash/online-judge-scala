package leetcode.codingchallenge2021.september

import util.TreeNode

import scala.annotation.tailrec
import scala.collection.mutable

object UniqueBinarySearchTreesII {
  def generateTrees(n: Int): List[TreeNode] = {
    val result = mutable.Map[String, TreeNode]()
    (1 to n).permutations.foreach { nums =>
      val root = TreeNode(nums.head)
      nums.drop(1).foreach(TreeNode.insert(root, _))
      result += TreeNode.toString(root) -> root
    }
    result.values.toList
  }

  object TreeNode {
    def apply(n: Int) = new TreeNode(n, null, null)

    @tailrec
    def insert(node: TreeNode, n: Int): Unit =
      if (n < node.value) {
        if (node.left == null) node.left = TreeNode(n)
        else insert(node.left, n)
      } else {
        if (node.right == null) node.right = TreeNode(n)
        else insert(node.right, n)
      }

    def toString(node: TreeNode): String = {
      val l = if (node.left == null) "null" else toString(node.left)
      val r = if (node.right == null) "null" else toString(node.right)
      s"(${node.value},$l,$r)"
    }
  }
}
