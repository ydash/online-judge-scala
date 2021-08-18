package leetcode.codingchallenge2021.august

import scala.annotation.tailrec

object DecodeWays {
  def numDecodings(s: String): Int = {
    if (s.head == '0') 0
    else if (s.length == 1) 1
    else count(s.drop(1).toList, s(0), 1, 1)
  }

  @tailrec
  private def count(s: List[Char], prev: Char, a: Int, b: Int): Int = s match {
    case Nil => b
    case c :: _ if c == '0' && !('1' to '2').contains(prev) => 0
    case c :: rest =>
      val x = if (isAlphabet(c)) b else 0
      val y = if (isAlphabet(prev, c)) a else 0
      count(rest, c, b, x + y)
  }

  private def isAlphabet(code: Char): Boolean = '1' to '9' contains code

  private def isAlphabet(code1: Char, code2: Char): Boolean =
    (code1 == '1' && ('0' to '9' contains code2)) || (code1 == '2' && ('0' to '6' contains code2))
}
