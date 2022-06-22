package leetcode.codingchallenge2022.jun

import scala.util.Random

// 215. Kth Largest Element in an Array
object P215 {
  def findKthLargest(nums: Array[Int], _k: Int): Int = {
    val k = nums.length - _k
    def swap(i: Int, j: Int): Unit = {
      val tmp = nums(i)
      nums(i) = nums(j)
      nums(j) = tmp
    }
    @scala.annotation.tailrec
    def quickSelect(left: Int, right: Int, pivot: Int): Int = {
      val p = nums(pivot)
      swap(pivot, right)
      var xthIndex = left
      for (i <- left until right if nums(i) < p) {
        swap(xthIndex, i)
        xthIndex += 1
      }
      swap(xthIndex, right)

      if (xthIndex == k) nums(k)
      else if (xthIndex < k) quickSelect(xthIndex + 1, right, right - Random.nextInt(right - xthIndex))
      else quickSelect(left, xthIndex - 1, left + Random.nextInt(xthIndex - left))
    }
    quickSelect(0, nums.length - 1, Random.nextInt(nums.length))
  }
}
