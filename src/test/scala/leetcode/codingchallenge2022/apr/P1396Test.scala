package leetcode.codingchallenge2022.apr

import leetcode.LeetCodeSpec

class P1396Test extends LeetCodeSpec {
  test("Test of Design Underground System") {
    val undergroundSystem = new P1396.UndergroundSystem()
    undergroundSystem.checkIn(10, "Leyton", 3)
    undergroundSystem.checkOut(10, "Paradise", 8)
    undergroundSystem.getAverageTime("Leyton", "Paradise") shouldBe 5
    undergroundSystem.checkIn(10, "Leyton", 10)
    undergroundSystem.checkOut(10, "Paradise", 16)
    undergroundSystem.getAverageTime("Leyton", "Paradise") shouldBe 5.5
    undergroundSystem.checkIn(2, "Leyton", 21)
    undergroundSystem.checkOut(2, "Paradise", 30)
    undergroundSystem.getAverageTime("Leyton", "Paradise") shouldBe 20d / 3
  }
}
