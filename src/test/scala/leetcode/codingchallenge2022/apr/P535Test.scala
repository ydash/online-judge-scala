package leetcode.codingchallenge2022.apr

import leetcode.LeetCodeSpec

class P535Test extends LeetCodeSpec {
  test("Test of Encode and Decode TinyURL") {
    val originalURL = "https://leetcode.com/problems/design-tinyurl"
    val codec = new P535.Codec()
    codec.decode(codec.encode(originalURL)) shouldBe originalURL
  }
}
