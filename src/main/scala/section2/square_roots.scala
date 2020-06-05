package section2

object square_roots {
  def abs(x: Double): Double = if (x < 0) -x else x


  def sqrt(x: Double): Double = {
    def is_good_enough(guess: Double): Boolean = {
      val tol: Double = 1e-7
      abs(guess * guess - x) / x < tol
    }

    def improve(guess: Double): Double = 0.5 * (guess + x / guess)

    def sqrt_recur(guess: Double): Double = {
      if (is_good_enough(guess)) guess
      else sqrt_recur(improve(guess))
    }

    sqrt_recur(guess = 1.0)
  }

  def sqrt_iter(x: Double): Double = {
    var guess: Double = 1
    val tol: Double = 1e-8

    while (abs(guess * guess - x) / x > tol) {
      guess = 0.5 * (guess + x / guess)
    }
    guess
  }
}
