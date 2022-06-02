package leetcode.codingchallenge2022.jun

// 867. Transpose Matrix
object P867 {
  def transpose(matrix: Array[Array[Int]]): Array[Array[Int]] =
    for (j <- matrix.head.indices.toArray) yield for (i <- matrix.indices.toArray) yield matrix(i)(j)
}
