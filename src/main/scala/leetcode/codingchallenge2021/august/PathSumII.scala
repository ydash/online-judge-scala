package leetcode.codingchallenge2021.august

import util.TreeNode

import scala.collection.mutable
import scala.collection.mutable.ListBuffer

object PathSumII {

  def pathSum(root: TreeNode, targetSum: Int): List[List[Int]] =
    if (root == null) List.empty
    else {
      val answer = ListBuffer[List[Int]]()

      val stack = new mutable.Stack[(Int, TreeNode, List[Int])]()
      stack.push((root.value, root, List(root.value)))
      while (stack.nonEmpty) {
        val (sum, current, lst) = stack.pop()
        if (sum == targetSum && current.left == null && current.right == null)
          answer += lst.reverse
        else {
          current.right match {
            case null => ()
            case r    => stack.push((sum + r.value, r, r.value :: lst))
          }
          current.left match {
            case null => ()
            case l    => stack.push((sum + l.value, l, l.value :: lst))
          }
        }
      }

      answer.toList
    }
}
