package leetcode.codingchallenge2021.august

import scala.annotation.tailrec

object VerifyPreorderSerializationOfABinaryTree {

  def isValidSerialization(preorder: String): Boolean = validate(preorder.split(','))

  @tailrec
  private def validate(nodes: Seq[String], acc: Int = 1): Boolean =
    nodes match {
      case Nil           => acc == 0
      case _ if acc <= 0 => false
      case "#" +: tail   => validate(tail, acc - 1)
      case _ +: tail     => validate(tail, acc + 1)
    }
}
