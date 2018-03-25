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
    composition(doubler, (x: Int) => x.toString)(40) shouldBe "80"
    composition(doubler, (x: Int) => x / 2)(200) shouldBe 200
  }

}
