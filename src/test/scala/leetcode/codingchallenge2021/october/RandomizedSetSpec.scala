package leetcode.codingchallenge2021.october

import leetcode.LeetCodeSpec

class RandomizedSetSpec extends LeetCodeSpec {
  test("Test of Randomized set") {
    val set = new RandomizedSet
    set.insert(1) shouldBe true
    set.remove(2) shouldBe false
    set.insert(2) shouldBe true
    println(set.getRandom)
    println(set.getRandom)
    set.insert(2) shouldBe false
    set.remove(1) shouldBe true
    set.getRandom shouldBe 2
  }

  test("test2") {
    val set = new RandomizedSet
    set.insert(0)
    set.insert(1)
    set.remove(0)
    set.insert(2)
    set.remove(1)
    set.getRandom shouldBe 2
  }

  test("test3") {
    val set = new RandomizedSet
    set.remove(0) shouldBe false
    set.remove(0) shouldBe false
    set.insert(0) shouldBe true
    set.getRandom shouldBe 0
    set.remove(0) shouldBe true
    set.insert(0) shouldBe true
  }
}
