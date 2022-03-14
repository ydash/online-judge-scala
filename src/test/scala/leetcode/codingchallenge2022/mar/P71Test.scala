package leetcode.codingchallenge2022.mar

import leetcode.LeetCodeSpec

class P71Test extends LeetCodeSpec {
  private val table = Table(
    ("path", "expected"),
    ("/home/", "/home"),
    ("/../", "/"),
    ("/home//foo/", "/home/foo"),
    ("/foo/../baz/bar/../../.", "/"),
    ("//////////foo/baz//////bar/////.//////..", "/foo/baz")
  )

  test("Test of Simplify Path") {
    forAll(table) { (path, expected) =>
      P71.simplifyPath(path) shouldBe expected
    }
  }
}
