package leetcode.codingchallenge2021.august

import scala.annotation.tailrec

object VerifyPreorderSerializationOfABinaryTree {
  private val NULL_POINTER = -1

  def isValidSerialization(preorder: String): Boolean =
    if (preorder == "#") true
    else {
      val nodes = preorder.split(',').map { str => if (str == "#") NULL_POINTER else str.toInt }.toList
      nodes.head != NULL_POINTER && check(nodes.tail, List(nodes.head), List())
    }

  @tailrec
  private def check(nodes: List[Int], left: List[Int], right: List[Int]): Boolean = left match {
    case Nil =>
      right match {
        case Nil =>
          nodes match {
            case Nil => true
            case _   => false
          }
        case _ :: rt =>
          nodes match {
            case Nil                  => false
            case NULL_POINTER :: tail => check(tail, left, rt)
            case head :: tail         => check(tail, head :: left, rt)
          }
      }
    case lh :: lt =>
      nodes match {
        case Nil                  => false
        case NULL_POINTER :: tail => check(tail, lt, lh :: right)
        case head :: tail         => check(tail, head :: lt, lh :: right)
      }
  }
}
