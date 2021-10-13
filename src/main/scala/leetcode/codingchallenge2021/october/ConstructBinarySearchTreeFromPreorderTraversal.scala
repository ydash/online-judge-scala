package leetcode.codingchallenge2021.october

import util.TreeNode

import scala.collection.mutable

object ConstructBinarySearchTreeFromPreorderTraversal {
  def bstFromPreorder(preorder: Array[Int]): TreeNode = {
    val root = new TreeNode(preorder(0))
    val stack = mutable.Stack[TreeNode](root)
    for (i <- 1 until preorder.length) {
      var parent = stack.pop()
      val child = new TreeNode(preorder(i))
      if (preorder(i) < parent.value) {
        parent.left = child
        parent +=: stack
        child +=: stack
      } else {
        while (stack.nonEmpty && stack.head.value < preorder(i)) parent = stack.pop()
        parent.right = child
        child +=: stack
      }
    }
    root
  }
}
