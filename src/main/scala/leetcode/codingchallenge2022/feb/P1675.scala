package leetcode.codingchallenge2022.feb

// 1675. Minimize Deviation in Array
object P1675 {
  def minimumDeviation(nums: Array[Int]): Int = {
    val set = collection.mutable.SortedSet[Int]()(Ordering.Int.reverse)
    var minNum = Int.MaxValue
    for (n <- nums) {
      val m = if (n % 2 == 1) n * 2 else n
      minNum = minNum min m
      set += m
    }
    var result = set.max - minNum
    while (set.max % 2 == 0) {
      val max = set.max
      set -= max
      set += max / 2
      minNum = minNum min (max / 2)
      result = result min (set.max - minNum)
    }
    result
  }
}
