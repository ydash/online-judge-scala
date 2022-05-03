package leetcode.codingchallenge2022.may

// 905. Sort Array By Parity
object P905 {
  def sortArrayByParity(nums: Array[Int]): Array[Int] = {
    @scala.annotation.tailrec
    def sort(_i: Int, _j: Int, arr: Array[Int]): Array[Int] = {
      val i = arr.indexWhere(_ % 2 == 1, _i)
      val j = arr.lastIndexWhere(_ % 2 == 0, _j)
      if (i != -1 && j != -1 && i < j) {
        val tmp = arr(i)
        arr(i) = arr(j)
        arr(j) = tmp
        sort(i, j, arr)
      } else arr
    }
    sort(0, nums.length - 1, nums)
  }
}
