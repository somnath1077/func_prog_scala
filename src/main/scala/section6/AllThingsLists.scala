package section6

object AllThingsLists {
    def myList(): Unit = {
        val fruits = List("pears", "apples", "bananas")
        println(fruits)

        val z = "pears" :: ("apples" :: ("bananas" :: Nil))
        println(z)
    }
}
