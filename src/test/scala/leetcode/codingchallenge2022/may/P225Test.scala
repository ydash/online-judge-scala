package leetcode.codingchallenge2022.may

import leetcode.LeetCodeSpec

class P225Test extends LeetCodeSpec {
  test("Test of Implement Stack using Queues") {
    val stack = new P225.MyStack()
    stack.push(1)
    stack.push(2)
    stack.top() shouldBe 2
    stack.pop() shouldBe 2
    stack.empty() shouldBe false
    stack.push(3)
    stack.push(4)
    stack.pop() shouldBe 4
    stack.pop() shouldBe 3
    stack.pop() shouldBe 1
    stack.empty() shouldBe true
  }
}
