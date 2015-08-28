package com.nerdery.euler

/**
 * Created by Mark Soule on 8/28/2015.
 */
class PythagoreanTriplet(sum: Int) {
  def solve(a: Int, b: Int, c: Int): Long = {

    if(a + b + c == sum &&
       scala.math.pow(a, 2) + scala.math.pow(b, 2) == scala.math.pow(c, 2)) {
      print(a * b * c)
      return a * b * c
    }
    else if(a < b - 1) {
      solve(a + 1, b, c)
    }
    else if(b < c - 1) {
      solve(0, b + 1, c)
    }
    else if(c < sum - 1) {
      solve(0, 1, c + 1)
    }
    else {
      // failure
      return 0
    }
  }
}
