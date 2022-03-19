package leetcode.codingchallenge2022.mar

// 895. Maximum Frequency Stack
object P895

import scala.collection.mutable

class FreqStack() {
  private val freq = mutable.Map[Int, Int]().withDefaultValue(0)
  private val countMap = mutable.SortedMap[Int, mutable.Stack[Int]]()

  def push(value: Int): Unit = {
    freq(value) += 1
    countMap
      .get(freq(value))
      .fold[Unit](countMap += (freq(value) -> mutable.Stack(value)))(_.push(value))
  }

  def pop(): Int = {
    val stack = countMap(countMap.lastKey)
    val result = stack.pop()
    freq(result) -= 1
    if (stack.isEmpty) countMap -= countMap.lastKey
    result
  }

}
