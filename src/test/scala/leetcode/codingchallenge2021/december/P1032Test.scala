package leetcode.codingchallenge2021.december

import leetcode.LeetCodeSpec

class P1032Test extends LeetCodeSpec {

  test("Test of Stream of Characters") {
    val streamChecker = new StreamChecker(Array("cd", "f", "kl"))
    streamChecker.query('a') shouldBe false
    streamChecker.query('b') shouldBe false
    streamChecker.query('c') shouldBe false
    streamChecker.query('d') shouldBe true
    streamChecker.query('e') shouldBe false
    streamChecker.query('f') shouldBe true
    streamChecker.query('g') shouldBe false
    streamChecker.query('h') shouldBe false
    streamChecker.query('i') shouldBe false
    streamChecker.query('j') shouldBe false
    streamChecker.query('k') shouldBe false
    streamChecker.query('l') shouldBe true
  }
}
