package leetcode.codingchallenge2021.august

import scala.util.chaining.scalaUtilChainingOps

object ComplexNumberMultiplication {
  def complexNumberMultiply(num1: String, num2: String): String =
    (ComplexNumber.from(num1) * ComplexNumber.from(num2)).toString
}

case class ComplexNumber(real: Int, imaginary: Int) {
  def *(that: ComplexNumber): ComplexNumber =
    ComplexNumber(
      this.real * that.real - (this.imaginary * that.imaginary),
      this.real * that.imaginary + that.real * this.imaginary
    )

  override def toString: String = s"$real+${imaginary}i"
}

object ComplexNumber {
  def from(str: String): ComplexNumber =
    str.split('+').pipe { case Array(real, imaginary) =>
      ComplexNumber(real.toInt, imaginary.dropRight(1).toInt)
    }
}
