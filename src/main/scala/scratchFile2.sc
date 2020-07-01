import section6.PairsAndTuples.mergesort
import section6.HigherOrderListFunctions.pack

object listfun {
  def main(): Unit  = {
    val l1 = List(78, 0, -45, 17, 56, -90, 10000.0)
    println(mergesort(l1))

    val nums = List(-89, 24, -78, 3, 245)
    val fruits = List("apples", "pears", "grapes", "bananas")

    println(nums filter (x => x < 0))
    println(fruits partition (x => x.length > 5))

    val dup = List("a", "a", "a", "b", "c", "c", "a", "b", "b")
    println(pack(dup))
  }
}

listfun.main()