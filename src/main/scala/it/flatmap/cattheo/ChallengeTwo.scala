package it.flatmap.cattheo

import scala.collection.mutable

object ChallengeTwo {
  
  def buildMemoize[A,B](f: A => B): A => B = {
    val cache = mutable.HashMap[A, B]()

    def memoize(x: A, f: A => B): B = {
      if(cache.isDefinedAt(x))
        cache(x)
      else {
        val result = f(x)
        cache.put(x, result)
        result
      }
    }
    (x: A) => memoize(x, f)
  }
  
}
