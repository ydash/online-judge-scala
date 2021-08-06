package leetcode.codingchallenge2021.august

import util.Node

import scala.collection.mutable
import scala.collection.mutable.ListBuffer

object NAryTreeLevelOrderTraversal {
  def levelOrder(root: Node): List[List[Int]] =
    if (root == null) List()
    else {
      val answer = new ListBuffer[List[Int]]
      val queue = new mutable.Queue[Node]()

      queue += root
      while (queue.nonEmpty) {
        val tmp = ListBuffer[Int]()
        for (_ <- queue.indices) {
          val node = queue.dequeue()
          tmp += node.value
          node.children.foreach(queue += _)
        }
        answer += tmp.toList
      }

      answer.toList
    }
}
