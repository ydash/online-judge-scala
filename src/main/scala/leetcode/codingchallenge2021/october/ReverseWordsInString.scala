package leetcode.codingchallenge2021.october

object ReverseWordsInString {
  def reverseWords(s: String): String = {
    var result = List[String]()
    val buffer = new StringBuilder()
    for (c <- s) {
      if (c == ' ') {
        if (buffer.nonEmpty) {
          result = buffer.toString() :: result
          buffer.clear()
        }
      } else buffer += c
    }
    if (buffer.nonEmpty) result = buffer.toString() :: result
    result.mkString(" ")
  }
}
