package leetcode.codingchallenge2021.september

import scala.collection.mutable.ArrayBuffer

object MaximumLengthOfAConcatenatedStringWithUniqueCharacters {
  def maxLength(lst: List[String]): Int = {
    val buffer = ArrayBuffer(Set.empty[Char])

    for (str <- lst) {
      val s1 = str.toSet
      if (s1.size == str.length) {
        for (i <- buffer.indices) {
          val s2 = buffer(i)
          if ((s1 intersect s2).isEmpty) buffer += (s1 union s2)
        }
      }
    }

    buffer.maxBy(_.size).size
  }
}
