package leetcode.codingchallenge2022.mar

// 946. Validate Stack Sequences
object P946 {
  def validateStackSequences(pushed: Array[Int], popped: Array[Int]): Boolean = {
    val stack = collection.mutable.Stack[Int]()
    var i = 0
    for (n <- pushed) {
      stack.push(n)
      while (stack.nonEmpty && stack.head == popped(i)) {
        stack.pop()
        i += 1
      }
    }
    stack.isEmpty
  }
}
