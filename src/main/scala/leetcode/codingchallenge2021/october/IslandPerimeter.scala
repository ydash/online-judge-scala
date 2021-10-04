package leetcode.codingchallenge2021.october

object IslandPerimeter {
  def islandPerimeter(grid: Array[Array[Int]]): Int = {
    var answer = 0
    for (i <- grid.indices; j <- grid(i).indices if grid(i)(j) == 1) {
      for (
        (r, c) <- Array((i - 1, j), (i + 1, j), (i, j - 1), (i, j + 1))
        if r < 0 || c < 0 || r >= grid.length || c >= grid(i).length || grid(r)(c) == 0
      ) {
        answer += 1
      }
    }
    answer
  }
}
