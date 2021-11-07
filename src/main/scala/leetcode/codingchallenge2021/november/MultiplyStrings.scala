package leetcode.codingchallenge2021.november

object MultiplyStrings {
  def multiply(num1: String, num2: String): String =
    if (num1 == "0" || num2 == "0") "0"
    else {
      val n1 = num1.map(_ - '0')
      val n2 = num2.map(_ - '0')
      val buffer = new Array[Int](num1.length + num2.length)
      for (i <- n1.indices.reverse; j <- n2.indices.reverse) {
        val d = n1(i) * n2(j)
        buffer(i + j + 1) += d
      }
      var x = 0
      for (i <- buffer.indices.reverse) {
        buffer(i) += x
        x = buffer(i) / 10
        buffer(i) %= 10
      }
      buffer.dropWhile(_ == 0).mkString
    }
}
