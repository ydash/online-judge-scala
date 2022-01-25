package leetcode.codingchallenge2022.jan

// 941. Valid Mountain Array
object P941 {
  def validMountainArray(arr: Array[Int]): Boolean =
  if (arr.length < 3) false
  else {
    val n = arr.length - 1
    var i = 1
    while (i < n && arr(i) < arr(i + 1)) i += 1
    while (i < n && arr(i) > arr(i + 1)) i += 1
    arr(0) < arr(1) && arr(n) < arr(n - 1) && i == n
  }
}
