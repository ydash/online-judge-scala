package leetcode.codingchallenge2021.august

import scala.annotation.tailrec
import scala.collection.mutable

object MinimumWindowSubstring {

  def minWindow(s: String, t: String): String = {
    val countT = new mutable.HashMap[Char, Int]().withDefaultValue(0)
    t.foreach(countT(_) -= 1)
    sliding(s, 0, 0, Set.from(countT.keys), countT, None)
  }

  @tailrec
  private def sliding(s: String,
                      left: Int,
                      right: Int, keys: Set[Char],
                      redundant: mutable.Map[Char, Int],
                      range: Option[Range]
                     ): String =
    if (right >= s.length) range.map(v => s.substring(v.start, v.last + 1)).getOrElse("")
    else {
      val c = s(right)
      if (keys(c)) {
        redundant(c) += 1
        if (redundant(c) == 0) redundant.remove(c)

        var l = left
        while (l < right && (!keys(s(l)) || redundant(s(l)) > 0)) {
          if (redundant(s(l)) > 0) {
            redundant(s(l)) -= 1
            if (redundant(s(l)) == 0) redundant.remove(s(l))
          }
          l += 1
        }

        val minRange =
          if (redundant.isEmpty || redundant.values.forall(_ >= 0)) {
            val tmp = l to right
            range match {
              case None => Some(tmp)
              case Some(v) if tmp.length < v.length => Some(tmp)
              case _ => range
            }
          } else range

        sliding(s, l, right + 1, keys, redundant, minRange)
      } else {
        sliding(s, left, right + 1, keys, redundant, range)
      }
    }
}
