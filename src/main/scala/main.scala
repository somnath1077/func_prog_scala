import section3.FixedPoint.sqrt
import section3.HigherOrderFunctions.{fact, mapReduce}
import section5.Rational

object main {
    def main(args: Array[String]): Unit = {
        println("This is an intro to FP via Scala")
        //    println(sqrt(1e-6))
        //    println(sqrt(4))
        //    println(sqrt(1e50))
        //    println(gcd(30, 27))
        //    println(gcd(249, 2726))
        //    println(gcd(18, 12))
        //    println(gcd_iter(30, 27))
        //    println(gcd_iter(249, 2726))
        //    println(gcd_iter(18, 12))
        //    println(factorial(5))
        //    println(factorial(2))
        //    println(factorial(3))
        //    println(factorial(4))
        //    println(sum((x: Int) => x, 1, 10))
        //    println(sumTailRecursive((x: Int) => x, 1, 10))
        //    println(prod((x: Int) => x)(1, 5))
        println(fact(5))
        println(mapReduce(x => x, (x, y) => x + y, 1)(1, 10))
        println(mapReduce(x => x, (x, y) => x * y, 0)(1, 5))
        println(mapReduce(x => x * x, (x, y) => x + y, 0)(1, 5))
        println(sqrt(3))
        val z1 = new Rational(1, 2)
        val z2 = new Rational(5, 8)
        val z3 = z1.add(z2)
        println("z1 = " + z1)
        println("z2 = " + z2)
        println("z1 + z2 = " + z3)
        println("z2 - z1 = " + z2.sub(z1))
        println("z1 is less than z2: " + z1.less(z2))
        println("max(z1, z2) = " + z1.max(z2))
        val z4 = new Rational(10)
        println("z4 = " + z4)
    }
}
