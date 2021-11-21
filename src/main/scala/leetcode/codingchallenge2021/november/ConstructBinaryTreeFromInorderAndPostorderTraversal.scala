package leetcode.codingchallenge2021.november

import util.TreeNode

object ConstructBinaryTreeFromInorderAndPostorderTraversal {
  def buildTree(inorder: Array[Int], postorder: Array[Int]): TreeNode = {
    def build(l: Int, r: Int, pi: Int): TreeNode =
      if (l > r) null
      else {
        val m = inorder.indexOf(postorder(pi), l)
        val rNode = build(m + 1, r, pi - 1)
        val lNode = build(l, m - 1, pi - (r - m) - 1)
        new TreeNode(inorder(m), lNode, rNode)
      }

    build(0, inorder.length - 1, postorder.length - 1)
  }
}
