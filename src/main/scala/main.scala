import section2.square_roots.sqrt_iter
import section2.square_roots.sqrt
import section3.recursion.gcd
import section3.recursion.gcd_iter
import section3.recursion.factorial
import section3.hof.sum
import section3.hof.sumTailRecursive
import section3.hof.prod

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
    println(sum((x: Int) => x, 1, 10))
    println(sumTailRecursive((x: Int) => x, 1, 10))
    println(prod((x: Int) => x)(1, 5))
  }
}
