package leetcode.codingchallenge2022.may

// 216. Combination Sum III
object P216 {
  def combinationSum3(k: Int, n: Int): List[List[Int]] = {
    val buffer = collection.mutable.ListBuffer[List[Int]]()
    def loop(sum: Int, acc: List[Int]): Unit = {
      if (acc.length == k && sum == n) buffer += acc
      else for (x <- acc.headOption.getOrElse(0) + 1 to 9) loop(sum + x, x :: acc)
    }
    loop(0, Nil)
    buffer.toList
  }
}
