package leetcode.codingchallenge2021.october

import leetcode.LeetCodeSpec

class TrieSpec extends LeetCodeSpec {
  test("Test of Trie") {
    val trie = new Trie()
    trie.insert("apple")
    trie.search("apple") shouldBe true
    trie.search("app") shouldBe false
    trie.startsWith("app") shouldBe true
    trie.insert("app")
    trie.search("app") shouldBe true
  }
}
