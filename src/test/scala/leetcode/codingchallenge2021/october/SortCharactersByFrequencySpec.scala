package leetcode.codingchallenge2021.october

import leetcode.LeetCodeSpec

class SortCharactersByFrequencySpec extends LeetCodeSpec {
  private val table = Table(
    ("s", "expected"),
    ("tree", List("eetr", "eert")),
    ("cccaaa", List("aaaccc", "cccaaa")),
    ("Aabb", List("bbaA", "bbAa"))
  )

  test("Test of Sort Characters by Frequency") {
    forAll(table) { (s, expected) =>
      expected should contain(SortCharactersByFrequency.frequencySort(s))
    }
  }
}
