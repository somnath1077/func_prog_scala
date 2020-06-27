package section6

import scala.annotation.tailrec

object PairsAndTuples {


    def mergesort(xs: List[Double]): List[Double] = {
        @tailrec
        def merge(xs: List[Double], ys: List[Double], lst: List[Double]): List[Double] = (xs, ys) match {
            case (Nil, _) => lst.reverse ++ ys
            case (_, Nil) => lst.reverse ++ xs
            case (x :: xs1, y :: ys1) => if (x <= y) merge(xs1, ys, x :: lst)
            else merge(xs, ys1, y :: lst)
        }

        val n = xs.length / 2
        if (n == 0) xs else {
            val (first, second) = xs.splitAt(n)
            merge(mergesort(first), mergesort(second), Nil)
        }
    }
}
