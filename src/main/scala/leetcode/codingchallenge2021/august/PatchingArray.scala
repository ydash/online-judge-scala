package leetcode.codingchallenge2021.august

import scala.annotation.tailrec

object PatchingArray {
  def minPatches(nums: Array[Int], n: Int): Int = count(nums, n)

  @tailrec
  def count(nums: Seq[Int], end: Int, current: Int = 1, acc: Int = 0): Int =
    if (current > end || current <= 0) acc
    else
      nums match {
        case h +: tail if h <= current => count(tail, end, current + h, acc)
        case _                         => count(nums, end, current + current, acc + 1)
      }
}
