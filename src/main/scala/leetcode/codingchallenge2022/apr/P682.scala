package leetcode.codingchallenge2022.apr

object P682 {
  def calPoints(ops: Array[String]): Int = {
    val stack = collection.mutable.Stack[Int]()
    for (op <- ops) op match {
      case "+" =>
        stack.push(stack(0) + stack(1))
      case "D" =>
        stack.push(stack(0) * 2)
      case "C" => stack.pop()
      case num => stack.push(num.toInt)
    }
    stack.sum
  }
}
