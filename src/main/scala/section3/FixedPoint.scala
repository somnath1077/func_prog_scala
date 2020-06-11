package section3


object FixedPoint {
    def isCloseEnough(d1: Double, d2: Double): Boolean = {
        def abs(x: Double): Double = if (x >= 0) x else -1 * x

        val tol: Double = 1e-8

        if (abs((d2 - d1) / d1) < tol) true
        else false
    }

    def fixedPoint(f: Double => Double)(firstGuess: Double): Double = {
        def iterate(guess: Double): Double = {

            println("guess = " + guess)
            val next = f(guess)
            if (isCloseEnough(guess, next)) next
            else iterate(next)
        }

        iterate(firstGuess)
    }

    def averageDamp(f: Double => Double)(x: Double): Double = (x + f(x)) / 2.0

    def sqrt(x: Double): Double = fixedPoint(averageDamp(y => x / y))(1.0)
}
