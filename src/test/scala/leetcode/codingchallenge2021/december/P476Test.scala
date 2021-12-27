package leetcode.codingchallenge2021.december

import leetcode.LeetCodeSpec

import scala.util.Random

class P476Test extends LeetCodeSpec {

  test("Test of Number Complement") {
    for (_ <- 0 until 100) {
      val num = Random.nextInt(Int.MaxValue) + 1
      P476.findComplement(num) shouldBe Integer.parseInt(num.toBinaryString.map(c => if (c == '0') '1' else '0'), 2)
    }
  }
}
