package leetcode.codingchallenge2021.december

object P476 {
  def findComplement(num: Int): Int = {
    @scala.annotation.tailrec
    def f(n: Int, acc: List[Int] = Nil): List[Int] =
      if (n == 0) acc
      else f(n >> 1, (n & 1) :: acc)

    @scala.annotation.tailrec
    def g(binList: List[Int], acc: Int = 0): Int = binList match {
      case Nil       => acc
      case b :: tail => g(tail, (acc << 1) + (b ^ 1))
    }

    g(f(num))
  }
}
