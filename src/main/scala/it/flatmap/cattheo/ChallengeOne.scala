package it.flatmap.cattheo

object ChallengeOne {

  def identity[A](x: A): A = x
  //curried composition
  def composition[A, B, C](f: A => B, g: B => C)(x: A): C = g(f(x))
}
