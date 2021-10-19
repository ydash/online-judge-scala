package leetcode.codingchallenge2021.october

import scala.collection.mutable

object NextGreaterElementI {
  def nextGreaterElement(nums1: Array[Int], nums2: Array[Int]): Array[Int] = {
    val greater = mutable.Map[Int, Int]().withDefaultValue(-1)
    val stack = mutable.Stack[Int]()
    for (n <- nums2) {
      while (stack.nonEmpty && stack.head < n) {
        greater += (stack.pop() -> n)
      }
      n +=: stack
    }
    for (i <- nums1.indices) nums1(i) = greater(nums1(i))
    nums1
  }
}
