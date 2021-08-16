package leetcode.codingchallenge2021.august

import util.SegmentTree

class NumArray(_nums: Array[Int]) {
  private val st: SegmentTree = SegmentTree(_nums)

  def sumRange(left: Int, right: Int): Int = st.sum(left, right)
}
