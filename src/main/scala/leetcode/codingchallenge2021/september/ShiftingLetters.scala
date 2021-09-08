package leetcode.codingchallenge2021.september

object ShiftingLetters {
  def shiftingLetters(s: String, shifts: Array[Int]): String = {
    val answer = new StringBuilder(s)
    for (i <- shifts.indices.reverse) {
      if (i < shifts.length - 1) shifts(i) += shifts(i + 1)
      shifts(i) %= 26
      answer(i) = shift(answer(i), shifts(i))
    }
    answer.toString()
  }

  def shift(c: Char, n: Int): Char = {
    c + n match {
      case res if res <= 'z' => res
      case res               => res - 26
    }
  }.toChar
}
