import section3.FixedPoint.sqrt
import section3.HigherOrderFunctions.{fact, mapReduce, prod}
import section5.{Empty, NonEmpty, Rational}
import section6.Lists._
import section6.PairsAndTuples.mergesort
import section6.HigherOrderListFunctions.{concat, squareList, pack, encode}

import scala.collection.immutable.List

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
        println(prod((x: Int) => x)(1, 5))
        println(fact(5))
        println(mapReduce(x => x, (x, y) => x + y, 1)(1, 10))
        println(mapReduce(x => x, (x, y) => x * y, 0)(1, 5))
        println(mapReduce(x => x * x, (x, y) => x + y, 0)(1, 5))
        println(sqrt(3))
        val z1 = new Rational(1, 2)
        val z2 = new Rational(5, 8)
        val z3 = z1 + z2
        println("z1 = " + z1)
        println("z2 = " + z2)
        println("z1 + z2 = " + z3)
        println("z2 - z1 = " + (z2 - z1))
        println("z1 is less than z2: " + (z1 < z2))
        println("max(z1, z2) = " + z1.max(z2))
        val z4 = new Rational(10)
        println("z4 = " + z4)

        val t1 = new NonEmpty(5, Empty, Empty)
        val t2 = t1.incl(10)
        val t3 = t2.incl(2).incl(1).incl(14).incl(20)
        println(t3)
        myList()

        val x = List(13, 8, -1, 4, 19, 0, -4, 78, -90, 1000, 145)
        println(isort(x))
        println(last(x))
        println(init(x))

        val y1 = List(1, 2, 3, 4)
        val y2 = List(5, 6, 7, 8)
        val y3 = List()
        val y4 = List(10)
        println(concat(concat(concat(y1, y2), y3), y4))
        val l = List(999, -8, 0.0, 12, 45, 3, 9.0)
        val fruits = List("oranges", "apples", "strawberries", "peaches", "plums", "guavas")
        println(mergesort(l))
        val l1: List[Double] = Seq.fill(10000)(scala.util.Random.nextDouble).toList.map(_ * 1000)
        println(mergesort(l1))
        println(squareList(y1))
        println(mergesort(fruits))

        val s = List("a", "a", "a", "b", "c", "c", "a", "c", "c")
        println(pack(s))
        println(encode(s))
    }
}