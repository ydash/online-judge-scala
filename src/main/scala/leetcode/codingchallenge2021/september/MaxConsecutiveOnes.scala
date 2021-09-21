package leetcode.codingchallenge2021.september

object MaxConsecutiveOnes {
  def findMaxConsecutiveOnes(nums: Array[Int]): Int = findMaxLengthOfConsecutiveOnes(nums.toList)

  @scala.annotation.tailrec
  def findMaxLengthOfConsecutiveOnes(lst: List[Int], acc: Int = 0): Int = lst match {
    case Nil => acc
    case _ =>
      val (ones, rest) = lst.span(_ == 1)
      findMaxLengthOfConsecutiveOnes(rest.dropWhile(_ == 0), acc max ones.length)
  }
}
