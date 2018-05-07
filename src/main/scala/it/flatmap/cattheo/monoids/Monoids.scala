package it.flatmap.cattheo.monoids

trait Monoid[A] {
  def mempty: A
  def mappend(a: A)(b: A): A
}

object BoolAndMonoid extends Monoid[Boolean] {
  override def mempty = true
  override def mappend(a: Boolean)(b: Boolean): Boolean = a && b
}

object BoolOrMonoid extends Monoid[Boolean] {
  override def mempty = false
  override def mappend(a: Boolean)(b: Boolean): Boolean = a || b
}