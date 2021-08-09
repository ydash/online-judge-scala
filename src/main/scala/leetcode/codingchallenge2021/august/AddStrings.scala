package leetcode.codingchallenge2021.august


object AddStrings {
  def addStrings(num1: String, num2: String): String = adder(num1, num2)

  def adder(num1: String, num2: String): String = {
    @scala.annotation.tailrec
    def adder(digits: Seq[(Char, Char)], carryUp: Int = 0, acc: List[Char] = List()): String = digits match {
      case Vector() => (if (carryUp > 0) '1' :: acc else acc).mkString
      case (x, y) +: rest =>
        (x + y - '0' + carryUp).toChar match {
          case n if '0' to '9' contains n =>
            adder(rest, 0, n :: acc)
          case n =>
            adder(rest, 1, (n - 10).toChar :: acc)
        }
    }

    adder(num1.reverse.zipAll(num2.reverse, '0', '0'))
  }
}
