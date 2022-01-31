package leetcode.codingchallenge2022.jan

object P1672 {
  def maximumWealth(accounts: Array[Array[Int]]): Int = accounts.map(_.sum).max
}
