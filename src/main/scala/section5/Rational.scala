package section5

import scala.annotation.tailrec

class Rational(x: Int, y: Int) {
    require(y > 0, "denominator must be strictly positive")

    def this(x: Int) = this(x, 1)

    @tailrec
    private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

    private val g = math.abs(gcd(x, y))

    val numer: Int = x / g

    val denom: Int = y / g

    override def toString: String = {
        if (denom == 1) numer.toString
        else numer + "/" + denom
    }

    def isZero: Boolean = if (numer == 0) true else false

    def isEqual(that: Rational): Boolean = numer * that.denom == denom * that.numer

    def + (that: Rational): Rational = {
        val num = numer * that.denom + denom * that.numer
        val den = denom * that.denom
        new Rational(num, den)
    }

    def unary_- : Rational = {
        new Rational(-1 * numer, denom)
    }

    def - (that: Rational): Rational = this + -that

    def / (that: Rational): Rational = {
        if (that.isZero) throw new ArithmeticException("Divide by 0")
        else new Rational(numer * that.denom, denom * that.numer)
    }

    def < (that: Rational): Boolean = numer * that.denom < denom * that.numer

    def max(that: Rational): Rational = if (this < that) that else this

}
