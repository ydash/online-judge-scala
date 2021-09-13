package leetcode.codingchallenge2021.september

import scala.collection.mutable

object MaximumNumberOfBalloons {
  def maxNumberOfBalloons(text: String): Int = {
    var answer = Int.MaxValue
    val count = mutable.Map[Char, Int]()
    for (c <- "balloon") count += c -> 0
    for (c <- text if count contains c) count(c) += 1
    for ((c, sum) <- count) answer = answer min (if (c == 'l' || c == 'o') sum / 2 else sum)
    answer
  }
}
