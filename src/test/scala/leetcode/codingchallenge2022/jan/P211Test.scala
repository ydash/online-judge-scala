package leetcode.codingchallenge2022.jan

import leetcode.LeetCodeSpec

class P211Test extends LeetCodeSpec {
  test("Test of Design Add and Search Words Data Structure") {
    val wordDictionary = new WordDictionary()
    wordDictionary.addWord("bad")
    wordDictionary.addWord("dad")
    wordDictionary.addWord("mad")
    wordDictionary.search("pad") shouldBe false
    wordDictionary.search("bad") shouldBe true
    wordDictionary.search(".ad") shouldBe true
    wordDictionary.search("b..") shouldBe true
  }
}
