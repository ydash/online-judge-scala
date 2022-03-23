package leetcode.codingchallenge2022.mar

// 991. Broken Calculator
object P991 {
  def brokenCalc(startValue: Int, target: Int): Int = {
    @scala.annotation.tailrec
    def loop(current: Int, count: Int): Int = {
      if (current <= startValue) count + startValue - current
      else if (current % 2 == 0) loop(current / 2, count + 1)
      else loop(current + 1, count + 1)
    }

    loop(target, 0)
  }
}
