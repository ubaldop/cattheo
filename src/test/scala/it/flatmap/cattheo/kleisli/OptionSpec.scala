package it.flatmap.cattheo.kleisli

import org.scalatest.{FlatSpec, Matchers}

class OptionSpec extends FlatSpec with Matchers {

  def sqrRoot(x: Double): KOption[Double] = {
    if(x>=0)
        Some(Math.sqrt(x))
    else
        None
  }

  def reciprocal(x: Double): KOption[Double] = {
    if(x==0)
      None
    else
      Some(1/x)
  }

  def reciprocal_square_root: Double => KOption[Double] = {
    KleisliOption(reciprocal, sqrRoot)
  }

  "Option" should "be compliant to Kleisli CT" in {
    def id = KleisliOption.identity[Double]
    KleisliOption(id, sqrRoot)(25d) shouldBe Some(5d)
    KleisliOption(sqrRoot, reciprocal)(25d) shouldBe Some(0.2)
    KleisliOption(reciprocal, id)(0d) shouldBe None
    KleisliOption(id, reciprocal)(0d) shouldBe None
    reciprocal_square_root(4).value shouldBe 0.5
  }

}