package section5

class Rational(x: Int, y: Int) {
    def numer = x

    def denom = y

    override def toString: String = x + "/" + y

    def isZero() = if (x == 0) true else false

    def isEqual(that: Rational) = x * that.denom == y * that.numer

    def add(that: Rational) = {
        val num = x * that.denom + y * that.numer
        val den = y * that.denom
        new Rational(num, den)
    }

    def neg() = {
        new Rational(-1 * x, y)
    }

    def sub(that: Rational) = add(that.neg())

    def div(that: Rational) = {
        if (that.isZero()) throw new ArithmeticException("Divide by 0")
        else new Rational(x * that.denom, y * that.numer)
    }
}
