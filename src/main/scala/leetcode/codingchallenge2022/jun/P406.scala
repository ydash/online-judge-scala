package leetcode.codingchallenge2022.jun

// 406. Queue Reconstruction by Height
object P406 {
  def reconstructQueue(people: Array[Array[Int]]): Array[Array[Int]] = {
    people.sortInPlaceWith((a, b) => if (a(0) == b(0)) a(1) < b(1) else a(0) > b(0))
    val buffer = collection.mutable.ArrayBuffer[Array[Int]]()
    for (p @ Array(_, k) <- people) buffer.insert(k, p)
    buffer.toArray
  }
}
