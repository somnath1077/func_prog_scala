package section6

import scala.annotation.tailrec

object Lists {
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

    @tailrec
    def last[T](xs: List[T]): T = xs match {
        case List() => throw new Error("last of an empty list")
        case List(x) => x
        case x :: xs => last(xs)
    }
    
    def init[T](xs: List[T]): List[T] = xs match {
        case List() => throw new Error("init of an empty list")
        case List(x) => Nil
        case y :: ys => y :: init(ys)
    }

    def concat[T](xs: List[T], ys: List[T]): List[T] = xs match {
        case List() => ys
        case z :: zs => z :: concat(zs, ys)
    }
}
