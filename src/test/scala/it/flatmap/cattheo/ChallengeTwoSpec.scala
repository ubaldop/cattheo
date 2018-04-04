package it.flatmap.cattheo

import it.flatmap.cattheo.ChallengeTwo._
import org.scalatest.{FlatSpec, Matchers}

import scala.util.Random

class ChallengeTwoSpec extends FlatSpec with Matchers {

  private def timeAssertionEvaluation[A](actual: => A, expected: A) = {
    val start = System.nanoTime()
    actual shouldBe expected
    val end = System.nanoTime()
   // System.out.println("Execution time! ",end-start)
    end-start
  }

  private def timeExecutionEvaluation[A](execution: => A) = {
    val start = System.nanoTime()
    execution
    val end = System.nanoTime()
    System.out.println("Execution time! ",end-start)
    end-start
  }

  "ChallengeTwo" should "implement memoization" in {
    def factorial(x: Long): Long = {
      Thread.sleep(3000)  //for testing purposes
      (1l to x).product
    }

    //getting this as value to avoid further cache redefinitions...
    val memoizeFactorial = ChallengeTwo.buildMemoize(factorial)

   
    memoizeFactorial(2) shouldBe 2
    memoizeFactorial(5) shouldBe 120

    timeAssertionEvaluation(memoizeFactorial(10), 3628800) should be > timeAssertionEvaluation(memoizeFactorial(10), 3628800)
  }


}