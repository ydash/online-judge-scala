package leetcode.codingchallenge2021.august

import util.TreeNode

import scala.annotation.tailrec

object TwoSumIV {
  def findTarget(root: TreeNode, k: Int): Boolean = find(List(root), Set.empty, k)

  @tailrec
  def find(lst: List[TreeNode], seen: Set[Int], target: Int): Boolean = lst match {
    case Nil => false
    case node :: rest =>
      if (seen.contains(target - node.value)) true
      else
        (node.left, node.right) match {
          case (null, null) => find(rest, seen + node.value, target)
          case (null, r)    => find(r :: rest, seen + node.value, target)
          case (l, null)    => find(l :: rest, seen + node.value, target)
          case (l, r)       => find(l :: r :: rest, seen + node.value, target)
        }
  }
}
