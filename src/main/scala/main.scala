import section3.FixedPoint.sqrt
import section3.HigherOrderFunctions.{fact, mapReduce}

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
  }
}
