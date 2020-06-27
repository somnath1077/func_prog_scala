package section6

object PairsAndTuples {


    def mergesort(xs: List[Double]): List[Double] = {
        def merge(xs: List[Double], ys: List[Double]): List[Double] = (xs, ys) match {
            case (Nil, _) => ys
            case (_, Nil) => xs
            case (x :: xs1, y :: ys1) => if (x <= y) x :: merge(xs1, ys) else y :: merge(xs, ys1)
        }

        val n = xs.length / 2
        if (n == 0) xs else {
            val (first, second) = xs.splitAt(n)
            merge(mergesort(first), mergesort(second))
        }
    }
}
