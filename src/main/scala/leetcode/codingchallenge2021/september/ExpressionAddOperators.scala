package leetcode.codingchallenge2021.september

import scala.collection.mutable.ListBuffer

object ExpressionAddOperators {
  def addOperators(num: String, target: Int): List[String] = {
    val buffer = ListBuffer[String]()
    def rec(x: Option[Long], cs: List[Char], stack: List[Long], acc: String): Unit = x match {
      case None =>
        if (cs.isEmpty) {
          if (stack.sum == target) buffer += acc
        } else rec(Some(cs.head.asDigit), cs.tail, stack, acc)
      case Some(n) =>
        if (n != 0 && cs.nonEmpty) rec(Some(n * 10 + cs.head.asDigit), cs.tail, stack, acc)
        if (stack.nonEmpty) {
          rec(None, cs, stack.head * n :: stack.tail, s"$acc*$n")
          rec(None, cs, n :: stack, s"$acc+$n")
          rec(None, cs, -n :: stack, s"$acc-$n")
        } else {
          rec(None, cs, n :: stack, n.toString)
        }
    }

    rec(None, num.toList, List(), "")
    buffer.toList
  }

}
