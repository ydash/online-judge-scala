package leetcode.codingchallenge2021.october

import util.TreeNode

object ConstructBinarySearchTreeFromPreorderTraversal {
  def bstFromPreorder(preorder: Array[Int]): TreeNode = bstFromPreorder(preorder.toList)

  private def bstFromPreorder(preorder: List[Int]): TreeNode =
    if (preorder.isEmpty) null
    else {
      val v = preorder.head
      val (left, right) = preorder.tail.partition(_ < v)
      new TreeNode(v, bstFromPreorder(left), bstFromPreorder(right))
    }

}
