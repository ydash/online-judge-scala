package leetcode.codingchallenge2022.jun

import leetcode.LeetCodeSpec

class P745Test extends LeetCodeSpec {
  test("Test of Prefix and Suffix Search") {
    import P745._
    val wf1 = new WordFilter(Array("apple"))
    wf1.f("a", "e") shouldBe 0
    wf1.f("a", "a") shouldBe -1

    val wf2 = new WordFilter(Array("apple", "ae"))
    wf2.f("a", "e") shouldBe 1
    wf2.f("apple", "apple") shouldBe 0

    val wf3 = new WordFilter(Array("cabaabaaaa","ccbcababac","bacaabccba","bcbbcbacaa","abcaccbcaa","accabaccaa","cabcbbbcca","ababccabcb","caccbbcbab","bccbacbcba"))
    wf3.f("bccbacbcba", "a") shouldBe 9
    wf3.f("ab","abcaccbcaa") shouldBe 4
    wf3.f("cabaaba","abaaaa") shouldBe 0
  }
}
