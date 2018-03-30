package it.flatmap.cattheo

object ChallengeOne {

  def identity[A](x: A): A = x
  //Composition
  def composition[A, B, C](f: A => B, g: B => C): A => C = x => g(f(x))
}
