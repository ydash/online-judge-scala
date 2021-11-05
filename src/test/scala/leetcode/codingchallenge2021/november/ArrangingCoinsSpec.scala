package leetcode.codingchallenge2021.november

import leetcode.LeetCodeSpec

import scala.util.Random

class ArrangingCoinsSpec extends LeetCodeSpec {

  test("Test of Arranging Coins") {
    for (_ <- 0 until 1000) {
      val n = Random.nextInt(Int.MaxValue)
      ArrangingCoins.arrangeCoins(n) shouldBe ArrangingCoins.slowSolution(n)
    }
  }
}
