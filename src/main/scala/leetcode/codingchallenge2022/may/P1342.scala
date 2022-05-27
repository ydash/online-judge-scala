package leetcode.codingchallenge2022.may

// 1342. Number of Steps to Reduce a Number to Zero
object P1342 {
  @scala.annotation.tailrec
  def numberOfSteps(num: Int, acc: Int = 0): Int =
    if (num == 0) acc
    else if (num == 1) acc + 1
    else numberOfSteps(num >> 1, acc + 1 + (num % 2))
}
