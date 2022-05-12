package leetcode.codingchallenge2022.may

import scala.collection.mutable
import scala.collection.mutable.ListBuffer

// 46. Permutations
object P46 {
  def permute(nums: Array[Int]): List[List[Int]] = {
    val buffer = ListBuffer[List[Int]]()
    def aux(ns: mutable.Set[Int], acc: List[Int]): Unit = {
      if (ns.isEmpty) buffer += acc
      else
        for (n <- ns.toArray) {
          ns -= n
          aux(ns, n :: acc)
          ns += n
        }
    }
    aux(mutable.Set[Int](nums: _*), Nil)
    buffer.toList
  }
}
