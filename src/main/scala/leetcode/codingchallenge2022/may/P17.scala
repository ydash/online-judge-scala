package leetcode.codingchallenge2022.may

import scala.collection.mutable

// 17. Letter Combinations of a Phone Number
object P17 {

  private val map = Map(
    '2' -> ('a' to 'c'),
    '3' -> ('d' to 'f'),
    '4' -> ('g' to 'i'),
    '5' -> ('j' to 'l'),
    '6' -> ('m' to 'o'),
    '7' -> ('p' to 's'),
    '8' -> ('t' to 'v'),
    '9' -> ('w' to 'z')
  )
  def letterCombinations(digits: String): List[String] =
    if (digits.isEmpty) Nil
    else {
      val queue = mutable.Queue[String]("")
      for (d <- digits) {
        for (_ <- queue.indices) {
          val str = queue.dequeue()
          for (c <- map(d)) queue.enqueue(str + c)
        }
      }
      queue.toList
    }
}
