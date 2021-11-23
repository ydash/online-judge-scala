package leetcode.codingchallenge2021.november

// 952. Largest Component Size by Common Factor
object P952 {
  def largestComponentSize(nums: Array[Int]): Int = {
    val ds = new DS(nums.max + 1)
    for (n <- nums) {
      for (m <- 2 to Math.sqrt(n).toInt if n % m == 0) {
        ds.union(n, m)
        ds.union(n, n / m)
      }
    }

    var ans = 1
    val map = collection.mutable.Map[Int, Int]().withDefaultValue(0)
    for (n <- nums) {
      map(ds.findSet(n)) += 1
      ans = ans max map(ds.findSet(n))
    }
    ans
  }

  class DS(n: Int) {
    private val parent = Array.tabulate[Int](n)(i => i)

    def same(x: Int, y: Int): Boolean = findSet(x) == findSet(y)

    def union(x: Int, y: Int): Unit = if (!same(x, y)) link(findSet(x), findSet(y))

    def findSet(x: Int): Int = {
      if (parent(x) != x) parent(x) = findSet(parent(x))
      parent(x)
    }

    private def link(x: Int, y: Int): Unit = parent(x) = y
  }
}
