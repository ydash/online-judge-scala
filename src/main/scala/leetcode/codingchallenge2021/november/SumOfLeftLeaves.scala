package leetcode.codingchallenge2021.november

import util.TreeNode

// 404. Sum of Left Leaves
object SumOfLeftLeaves {
  def sumOfLeftLeaves(root: TreeNode): Int = {
    import LR._
    def aux(node: TreeNode, lr: LR): Int = (node.left, node.right) match {
      case (null, null) =>
        lr match {
          case LEFT => node.value
          case _    => 0
        }
      case (null, r) => aux(r, RIGHT)
      case (l, null) => aux(l, LEFT)
      case (l, r)    => aux(l, LEFT) + aux(r, RIGHT)
    }

    aux(root, ROOT)
  }

  private object LR {
    sealed trait LR
    case object ROOT extends LR
    case object LEFT extends LR
    case object RIGHT extends LR
  }
}
