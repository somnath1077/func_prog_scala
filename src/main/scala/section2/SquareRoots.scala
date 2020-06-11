package section2

object SquareRoots {
    def abs(x: Double): Double = if (x < 0) -x else x


    def sqrt(x: Double): Double = {
        def is_good_enough(guess: Double): Boolean = {
            val tol: Double = 1e-7
            abs(guess * guess - x) / x < tol
        }

        def improve(guess: Double): Double = 0.5 * (guess + x / guess)

        def sqrtRecur(guess: Double): Double = {
            if (is_good_enough(guess)) guess
            else sqrtRecur(improve(guess))
        }

        sqrtRecur(guess = 1.0)
    }

    def sqrtIter(x: Double): Double = {
        var guess: Double = 1
        val tol: Double = 1e-8

        while (abs(guess * guess - x) / x > tol) {
            guess = 0.5 * (guess + x / guess)
        }
        guess
    }
}
