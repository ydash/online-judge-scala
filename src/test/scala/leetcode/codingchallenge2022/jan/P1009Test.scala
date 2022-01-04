package leetcode.codingchallenge2022.jan

import leetcode.LeetCodeSpec

import scala.util.Random

class P1009Test extends LeetCodeSpec {
  test("Test of Number Complement") {
    for (_ <- 0 until 100) {
      val num = Random.nextInt(1e9.toInt + 1)
      P1009.bitwiseComplement(num) shouldBe Integer.parseInt(num.toBinaryString.map(c => if (c == '0') '1' else '0'), 2)
    }
  }

}
