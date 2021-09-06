package leetcode.codingchallenge2021.september

object SlowestKey {
  def slowestKey(releaseTimes: Array[Int], keysPressed: String): Char = {
    var answer = keysPressed(0)
    var slowestDuration = releaseTimes(0)

    for (i <- 1 until keysPressed.length; duration = releaseTimes(i) - releaseTimes(i - 1)) {
      if (duration > slowestDuration || (duration == slowestDuration && answer < keysPressed(i))) {
        answer = keysPressed(i)
        slowestDuration = duration
      }
    }

    answer
  }
}
