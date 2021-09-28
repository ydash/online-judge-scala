package leetcode.codingchallenge2021.september

import leetcode.LeetCodeSpec
import org.scalacheck.Gen
import org.scalatestplus.scalacheck.ScalaCheckPropertyChecks

import scala.util.Random

class SortArrayByParityIISpec extends LeetCodeSpec with ScalaCheckPropertyChecks {
  private val testData: Gen[Array[Int]] = for (size <- Gen.chooseNum(2, 20000) suchThat (_ % 2 == 0)) yield {
    val arr = Array.tabulate(size)(i => i)
    val shuffle = Random.nextInt(size / 2)
    for (_ <- 0 until shuffle) {
      val x = (size / 2) - 1
      val i = Random.nextInt(x) * 2 + 1
      val j = Random.nextInt(x) * 2
      val tmp = arr(i)
      arr(i) = arr(j)
      arr(j) = tmp
    }
    arr
  }

  test("Test of Sort Array By Parity II") {
    forAll(testData) { nums =>
      assert(SortArrayByParityII.sortArrayByParityII(nums).zipWithIndex.forall { case (n, i) =>
        (n % 2 == 0 && i % 2 == 0) || (n % 2 == 1 && i % 2 == 1)
      })
    }
  }
}
