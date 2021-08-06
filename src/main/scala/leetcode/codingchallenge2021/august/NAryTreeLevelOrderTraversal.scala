package leetcode.codingchallenge2021.august

import util.Node

import scala.annotation.tailrec

object NAryTreeLevelOrderTraversal {
  def levelOrder(root: Node): List[List[Int]] =
    if (root == null) List.empty
    else traverse(List(root), List())

  @tailrec
  def traverse(nodeList: List[Node], acc: List[List[Int]]): List[List[Int]] = nodeList match {
    case List() => acc.reverse
    case _ => traverse(nodeList.flatMap(_.children), nodeList.map(_.value) :: acc)
  }
}
