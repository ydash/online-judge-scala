package leetcode.codingchallenge2021.november

class CombinationIterator(_characters: String, _combinationLength: Int) {
  val min: Int = (0 until _combinationLength).foldLeft(0)((acc, _) => (acc << 1) + 1)
  val max: Int = (0 until _characters.length - _combinationLength).foldLeft(min)((acc, _) => acc << 1)
  val buffer = new Array[Char](_combinationLength)
  var current: Option[Int] = Option(max)

  def next(): String = {
    var bits = current.get
    var i = _combinationLength - 1
    var j = _characters.length - 1
    while (bits > 0 && i >= 0) {
      if ((bits & 1) == 1) {
        buffer(i) = _characters(j)
        i -= 1
      }
      bits >>= 1
      j -= 1
    }
    var next = current.get - 1
    while (next >= min && java.lang.Integer.bitCount(next) != _combinationLength) next -= 1
    current = if (next >= min) Option(next) else Option.empty[Int]
    buffer.mkString
  }

  def hasNext(): Boolean = current.nonEmpty

}
