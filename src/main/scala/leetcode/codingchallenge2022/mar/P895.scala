package leetcode.codingchallenge2022.mar

// 895. Maximum Frequency Stack
object P895

import scala.collection.mutable

class FreqStack() {
  private val freq = mutable.Map[Int, Int]().withDefaultValue(0)
  private val countMap = mutable.Map[Int, mutable.Stack[Int]]()
  private var maxFreq = 0

  def push(value: Int): Unit = {
    freq(value) += 1
    countMap
      .get(freq(value))
      .fold[Unit](countMap += (freq(value) -> mutable.Stack(value)))(_.push(value))
    maxFreq = maxFreq max freq(value)
  }

  def pop(): Int = {
    val stack = countMap(maxFreq)
    val result = stack.pop()
    freq(result) -= 1
    if (stack.isEmpty) maxFreq -= 1
    result
  }

}
