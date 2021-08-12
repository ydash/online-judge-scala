package leetcode.codingchallenge2021.august

import leetcode.LeetCodeSpec

class GroupAnagramsSpec extends LeetCodeSpec {
  private val table = Table(
    ("strs", "expected"),
    (Array("eat", "tea", "tan", "ate", "nat", "bat"), List(List("bat"), List("nat", "tan"), List("ate", "eat", "tea"))),
    (Array.empty[String], List.empty),
    (Array("a"), List(List("a")))
  )

  test("Test of Group Anagrams") {
    forAll(table) { (strs, expected) =>
      val actual = GroupAnagrams.groupAnagrams(strs)
      actual.map(_.sorted) should contain theSameElementsAs expected.map(_.sorted)
    }
  }
}
