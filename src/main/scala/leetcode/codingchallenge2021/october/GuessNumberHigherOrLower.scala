package leetcode.codingchallenge2021.october

class GuessNumberHigherOrLower(pick: Int) extends GuessGame(pick) {
  def guessNumber(n: Int): Int = {

    @scala.annotation.tailrec
    def loop(left: Int, right: Int): Int = {
      val mid = left + (right - left) / 2
      guess(mid) match {
        case -1 => loop(left, mid - 1)
        case 1  => loop(mid + 1, right)
        case _  => mid
      }
    }

    loop(0, n)
  }
}

class GuessGame(pick: Int) {
  def guess(n: Int): Int = {
    if (pick < n) -1
    else if (pick > n) 1
    else 0
  }
}
