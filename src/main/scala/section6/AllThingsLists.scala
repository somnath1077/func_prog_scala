package section6

object AllThingsLists {
    def myList(): Unit = {
        val fruits = List("pears", "apples", "bananas")
        println(fruits)

        val z = "pears" :: ("apples" :: ("bananas" :: Nil))
        println(z)
    }

    def insert(x: Int, ys: List[Int]): List[Int] = ys match {
        case List() => List(x)
        case z :: zs => if (x <= z) x :: ys else z :: insert(x, zs)
    }

    def isort(xs: List[Int]): List[Int] = xs match {
        case List() => List()
        case x :: ys => insert(x, isort(ys))
    }
}
