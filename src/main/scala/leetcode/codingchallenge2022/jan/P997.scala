package leetcode.codingchallenge2022.jan

// 997. Find the Town Judge
object P997 {
  def findJudge(n: Int, trust: Array[Array[Int]]): Int = {
    val count = new Array[Int](n + 1)
    for (Array(a, b) <- trust) {
      count(a) -= 1
      count(b) += 1
    }
    (1 to n).find(count(_) == n - 1).getOrElse(-1)
  }
}
