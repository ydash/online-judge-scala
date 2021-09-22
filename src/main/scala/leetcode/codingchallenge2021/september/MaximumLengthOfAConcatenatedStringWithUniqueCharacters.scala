package leetcode.codingchallenge2021.september

import scala.collection.BitSet
import scala.collection.mutable.ArrayBuffer

object MaximumLengthOfAConcatenatedStringWithUniqueCharacters {
  def maxLength(lst: List[String]): Int = {
    var answer = 0
    val buffer = ArrayBuffer(BitSet())

    for (str <- lst) {
      val b1 = str.foldLeft(BitSet())((acc, c) => acc + (c - 'a'))
      if (b1.size == str.length) {
        for (i <- buffer.indices) {
          val b2 = buffer(i)
          if ((b1 & b2).isEmpty) {
            val concatenated = b1 | b2
            buffer += concatenated
            answer = answer max concatenated.size
          }
        }
      }
    }

    answer
  }
}
