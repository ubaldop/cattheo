package it.flatmap.cattheo.monoids

import org.scalatest.{FlatSpec, Matchers}

class MonoidsSpec extends FlatSpec with Matchers {

  "Monoids" should "be a monoid set for && in booleans" in {
    val b = BoolAndMonoid
    b.mappend(true)(false) shouldBe false
    b.mappend(b.mempty)(false) shouldBe false
    b.mappend(b.mempty)(true) shouldBe true
  }

  "Monoids" should "be a monoid set for || in booleans" in {
    val b = BoolOrMonoid
    b.mappend(true)(false) shouldBe true
    b.mappend(b.mempty)(false) shouldBe false
    b.mappend(b.mempty)(true) shouldBe true
  }


}