package leetcode.codingchallenge2022.feb

import scala.util.chaining.scalaUtilChainingOps

// 402. Remove K Digits
object P402 {
  def removeKdigits(num: String, k: Int): String = {
    @scala.annotation.tailrec
    def loop(i: Int, rest: Int, acc: List[Char] = Nil): String = {
      if (rest <= 0) {
        acc.reverse.mkString + num.drop(i)
      } else if (i < num.length) {
        acc match {
          case h :: t if h > num(i) => loop(i, rest - 1, t)
          case _                    => loop(i + 1, rest, num(i) :: acc)
        }
      } else {
        acc.drop(rest).reverse.mkString
      }
    }
    loop(0, k).dropWhile(_ == '0').pipe(s => if (s.isEmpty) "0" else s)
  }
}
