package leetcode.codingchallenge2022.mar

// 71. Simplify Path
object P71 {
  def simplifyPath(path: String): String = {
    val buffer = collection.mutable.ListBuffer[String]()
    for (str <- path.split("/+") if str.nonEmpty && str != ".") {
      if (str == "..") buffer.dropRightInPlace(1)
      else buffer += str
    }
    buffer.mkString("/", "/", "")
  }
}
