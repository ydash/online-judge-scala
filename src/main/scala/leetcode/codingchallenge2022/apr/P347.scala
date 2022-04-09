package leetcode.codingchallenge2022.apr

// 347. Top K Frequent Elements
object P347 {
  def topKFrequent(nums: Array[Int], k: Int): Array[Int] = {
    val count = collection.mutable.Map[Int, Int]().withDefaultValue(0)
    for (n <- nums) count(n) += 1
    count.toArray
      .sortBy(_._2)(Ordering.Int.reverse)
      .take(k)
      .map(_._1)
  }
}
