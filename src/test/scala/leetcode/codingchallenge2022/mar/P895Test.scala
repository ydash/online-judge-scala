package leetcode.codingchallenge2022.mar

import leetcode.LeetCodeSpec

class P895Test extends LeetCodeSpec {
  test("Test of Maximum Frequency Stack") {
    val freqStack = new FreqStack()
    freqStack.push(5)
    freqStack.push(7)
    freqStack.push(5)
    freqStack.push(7)
    freqStack.push(4)
    freqStack.push(5)
    freqStack.pop() shouldBe 5
    freqStack.pop() shouldBe 7
    freqStack.pop() shouldBe 5
    freqStack.pop() shouldBe 4
  }
}
