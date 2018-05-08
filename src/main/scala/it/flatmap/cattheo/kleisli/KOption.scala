package it.flatmap.cattheo.kleisli

trait KOption[+T] {
  def value: T
  def isValid: Boolean
}

case object None extends KOption[Nothing] {
  override def isValid: Boolean = false
  override def value = throw new NoSuchElementException("None.get")
}
case class Some[+A](a: A) extends KOption[A] {
  override def isValid: Boolean = true
  override def value: A = a
}

//Vanilla Option here
object KleisliOption {
  def identity[A]: A => KOption[A] = (a: A) => Some(a)
  def apply[A, B, C](f: A => KOption[B], g: B => KOption[C])(a: A): KOption[C] = {
    val result1 = f(a)
    if(result1.isValid)
      g(result1.value)
    else
      None

  }
}

