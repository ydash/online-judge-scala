package leetcode.codingchallenge2021.december

// 394. Decode String
object P394 {
  def decodeString(s: String): String = {
    def loop(_i: Int): (String, Int) = {
      val buffer = new StringBuilder()
      var i = _i
      while (i < s.length && s(i) != ']') {
        if (('1' to '9') contains s(i)) {
          val openingBracket = s.indexOf("[", i)
          val k = s.substring(i, openingBracket).toInt
          val (encodedStr, j) = loop(openingBracket + 1)
          buffer ++= encodedStr * k
          i = j
        } else {
          buffer += s(i)
        }
        i += 1
      }
      buffer.toString() -> i
    }

    loop(0)._1
  }
}
