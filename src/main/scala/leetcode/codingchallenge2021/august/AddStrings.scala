package leetcode.codingchallenge2021.august

import scala.util.chaining.scalaUtilChainingOps

object AddStrings {
  def addStrings(num1: String, num2: String): String = adder(num1, num2)

  def adder(num1: String, num2: String): String =
    num1.reverse.zipAll(num2.reverse, '0', '0').foldLeft((List[Char](), 0)) { (acc, digits) =>
      val (result, carryUp) = acc
      (digits._1 + digits._2 - '0' + carryUp).toChar match {
        case n if '0' to '9' contains n => (n :: result, 0)
        case n => ((n - 10).toChar :: result, 1)
      }
    }.pipe { case (acc, c) => (if (c > 0) '1' :: acc else acc).mkString }
}
