package leetcode.codingchallenge2022.may

// 456. 132 Pattern
object P456 {
  def find132pattern(nums: Array[Int]): Boolean = {
    val candidates4S2 = collection.mutable.Stack[Int]()
    var s3 = Option.empty[Int]
    for (i <- nums.indices.reverse) {
      while (candidates4S2.nonEmpty && nums(i) > candidates4S2.head) {
        s3 = Option(s3.getOrElse(Int.MinValue) max candidates4S2.pop())
      }
      s3.foreach(m => if (nums(i) < m) return true)
      candidates4S2.push(nums(i))
    }
    false
  }
}
