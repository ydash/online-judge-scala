package leetcode.codingchallenge2021.november

import util.TreeNode

// 129. Sum Root to Leaf Numbers
object SumRootToLeafNumbers {
  def sumNumbers(root: TreeNode, acc: Int = 0): Int = (root.left, root.right) match {
    case (null, null) => acc * 10 + root.value
    case (null, r)    => sumNumbers(r, acc * 10 + root.value)
    case (l, null)    => sumNumbers(l, acc * 10 + root.value)
    case (l, r) =>
      val sum = acc * 10 + root.value
      sumNumbers(l, sum) + sumNumbers(r, sum)
  }
}
