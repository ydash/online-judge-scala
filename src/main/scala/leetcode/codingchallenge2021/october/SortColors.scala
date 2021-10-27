package leetcode.codingchallenge2021.october

object SortColors {
  def sortColors(nums: Array[Int]): Unit = {

    def swap(i: Int, j: Int): Unit = {
      val tmp = nums(i)
      nums(i) = nums(j)
      nums(j) = tmp
    }

    var left, current = 0
    var right = nums.length - 1
    while (current <= right) {
      nums(current) match {
        case 0 =>
          swap(left, current)
          current += 1; left += 1
        case 1 => current += 1
        case _ =>
          swap(current, right)
          right -= 1
      }
    }
  }

  /* This is my previous one-pass solution
    def sortColors(nums: Array[Int]): Unit = {
      val red, white, blue = mutable.ArrayDeque[Int]()
      for (i <- nums.indices) {
        nums(i) match {
          case 0 => red += i
          case 1 => white += i
          case 2 => blue += i
        }
        if (red.nonEmpty) {
          val i = red.removeHead()
          if (white.nonEmpty) {
            val j = white.removeHead()
            nums(j) = 0; nums(i) = 1
            white += i
          } else if (blue.nonEmpty) {
            val k = blue.removeHead()
            nums(k) = 0; nums(i) = 2
            blue += i
          }
        }
        if (white.nonEmpty) {
          if (blue.nonEmpty && white.last > blue.head) {
            val j = white.removeLast()
            val k = blue.removeHead()
            nums(k) = 1; nums(j) = 2
            white += k; blue += j
          }
        }
      }
    }
   */

  /* This is two-pass solution.
  def sortColors(nums: Array[Int]): Unit = {
    val (r, w, b) = nums.foldLeft((0, 0, 0)) { case ((r, w, b), n) =>
      n match {
        case 0 => (r + 1, w, b)
        case 1 => (r, w + 1, b)
        case _ => (r, w, b + 1)
      }
    }
    for (i <- 0 until r) nums(i) = 0
    for (i <- r until r + w) nums(i) = 1
    for (i <- r + w until r + w + b) nums(i) = 2
  }
   */
}
