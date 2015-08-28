package com.nerdery.euler.tests

import com.nerdery.euler.PythagoreanTriplet
import org.scalatest.FlatSpec

/**
 * Created by Mark Soule on 8/28/2015.
 */
class PythagoreanTripletTests extends FlatSpec {

  it should "return 0" in {
    // Initialized to the smallest values for a, b, and c such that a < b < c.
    val a = 0
    val b = 1
    val c = 2
    val triplet = new PythagoreanTriplet(0)
    assert(triplet.solve(a, b, c) == 0)
  }

  it should "return a correct result with cheating inputs" in {
    // cheat
    val a = 199
    val b = 374
    val c = 425
    val triplet = new PythagoreanTriplet(1000)
    assert(triplet.solve(a, b, c) == 31875000)
  }

  it should "pass for some reason" in {
    val a = 0
    val b = 1
    val c = 2
    val triplet = new PythagoreanTriplet(40)
    assert(triplet.solve(a, b, c) > 0)
  }

  // 16 gig heap space was not enough for either of these. I guess I need to optimize!
  
  it should "have a stack overflow" in {
    val a = 0
    val b = 1
    val c = 2
    val triplet = new PythagoreanTriplet(41)
    assert(triplet.solve(a, b, c) > 0)
  }

  it should "return a correct result but it overflows instead :(" in {
    val a = 0
    val b = 1
    val c = 2
    val triplet = new PythagoreanTriplet(1000)
    assert(triplet.solve(a, b, c) == 31875000)
  }


}
