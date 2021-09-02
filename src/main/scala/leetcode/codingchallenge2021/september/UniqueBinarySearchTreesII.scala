package leetcode.codingchallenge2021.september

import util.TreeNode

import scala.collection.mutable.ListBuffer

object UniqueBinarySearchTreesII {

  def generateTrees(n: Int): List[TreeNode] = generateTrees(1, n)

  def generateTrees(start: Int, end: Int): List[TreeNode] =
    if (start > end) List(null)
    else {
      val buffer = ListBuffer[TreeNode]()
      for (i <- start to end) {
        generateTrees(start, i - 1).foreach(l => generateTrees(i + 1, end).foreach(r => buffer += TreeNode(i, l, r)))
      }
      buffer.toList
    }
}
