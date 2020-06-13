import section5.{Empty, NonEmpty}


object scratch {
    val t1 = new NonEmpty(5, Empty, Empty)
    val t2 = t1.incl(10)
    val t3 = t2.incl(2).incl(1).incl(14).incl(20)
    println(t3)

    val x = null
    val y: String = x

    if (true) 1 else false

    def error(msg: String) = throw new Error(msg)
}

scratch