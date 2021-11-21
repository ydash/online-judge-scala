package leetcode.codingchallenge2021.november

import util.TreeNode

object ConstructBinaryTreeFromInorderAndPostorderTraversal {
  def buildTree(inorder: Array[Int], postorder: Array[Int]): TreeNode = {
    val indexOfInorder = inorder.indices.foldLeft(Map[Int, Int]())((acc, i) => acc + (inorder(i) -> i))

    def build(l: Int, r: Int, i: Int): TreeNode =
      if (l > r) null
      else {
        val m = indexOfInorder(postorder(i))
        new TreeNode(inorder(m), build(l, m - 1, i - (r - m) - 1), build(m + 1, r, i - 1))
      }

    build(0, inorder.length - 1, postorder.length - 1)
  }
}
