package leetcode.codingchallenge2021.august

import scala.annotation.tailrec
import scala.collection.mutable
import scala.util.chaining.scalaUtilChainingOps

object MinimumWindowSubstring {

  def minWindow(s: String, t: String): String = {
    val count = new mutable.HashMap[Char, Int]().withDefaultValue(0)
    t.foreach(count(_) += 1)
    val filteredS = s.zipWithIndex.filter { case (c, _) => count.contains(c) }
    sliding(0, 0, filteredS, count, None).map(range => s.substring(range.start, range.last + 1)).getOrElse("")
  }

  @tailrec
  private def sliding(left: Int, right: Int, seq: IndexedSeq[(Char, Int)],
                      count: mutable.Map[Char, Int], acc: Option[Range]): Option[Range] =
    if (right >= seq.length) acc
    else {
      val (c, i) = seq(right)
      count(c) -= 1
      if (count(c) == 0) count.remove(c)
      var l = left
      while (l < right && count(seq(l)._1) < 0) {
        val lc = seq(l)._1
        count(lc) += 1
        if (count(lc) == 0) count.remove(lc)
        l += 1
      }
      val minRange = (seq(l)._2 to i).pipe(rng =>
        if (count.values.forall(_ <= 0) && rng.length < acc.map(_.length).getOrElse(Int.MaxValue)) Some(rng) else acc
      )
      sliding(l, right + 1, seq, count, minRange)
    }
}
