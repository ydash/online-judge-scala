package util

import scala.util.chaining.scalaUtilChainingOps

class TreeNode(
    _value: Int = 0,
    _left: TreeNode = null,
    _right: TreeNode = null
) {
  var value: Int = _value
  var left: TreeNode = _left
  var right: TreeNode = _right

  override def toString: String = s"TreeNode($value,$left,$right)"
}

object TreeNode {
  def apply(num: Int) = new TreeNode(num)

  def apply(num: Int, left: TreeNode, right: TreeNode): TreeNode =
    TreeNode(num).tap { node =>
      node.left = left
      node.right = right
    }
}
