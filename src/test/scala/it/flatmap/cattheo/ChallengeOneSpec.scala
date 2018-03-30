package it.flatmap.cattheo

import org.scalatest.{FlatSpec, Matchers}
import ChallengeOne._

class ChallengeOneSpec extends FlatSpec with Matchers {

  "ChallengeOne" should "implement identity" in {
    identity("foobar") shouldBe "foobar"
    identity(1) shouldBe 1
  }

  it should "implement composition" in {
    def doubler(x: Int): Int = x*2
    def stringifier(x: Int): String = x.toString
    composition(doubler, stringifier)(40) shouldBe "80"
    composition(stringifier, x => "test "+x)(1984) shouldBe "test 1984"
  }

  it should "implement composition with identity unit" in {
    def doubler(x: Int): Int = x*2
    def stringifier(x: Int): String = x.toString
    composition(doubler, identity[Int])(40) shouldBe 80
    composition(identity[Int], stringifier)(1984) shouldBe "1984"
  }

}