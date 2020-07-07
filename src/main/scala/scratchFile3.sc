import scala.annotation.tailrec

object collatz {
  val MAX_INT: Int = 10000
  val DEFAULT_VAL: Int = -1
  val lengths: Array[Int] = Array.fill[Int](MAX_INT)(DEFAULT_VAL)

  @tailrec
  def collatzLength(n: Int, helperArr: Array[Int], len: Int = 1): Int = {
    println("collatzLength of %d".format(n))
    if (n == 1) len
    else {
      if (n <= MAX_INT && helperArr(n - 1) != DEFAULT_VAL) len + helperArr(n - 1) + 1
      else if (n % 2 == 0) collatzLength(n / 2, helperArr, len + 1)
      else collatzLength((3 * n + 1) / 2, helperArr, len + 2)
    }
  }

  def argmax(a: Array[Int]): Int = {
    @tailrec
    def findIdx(x: Array[Int], lastMax: Int, currIdx: Int, lastIdx: Int): Int = {
      if (x.isEmpty) lastIdx
      else {
        if (x.head > lastMax) findIdx(x.tail, x.head, currIdx + 1, currIdx)
        else findIdx(x.tail, lastMax, currIdx + 1, lastIdx)
      }
    }

    findIdx(a, lastMax = a.head, currIdx = 0, lastIdx = 0)
  }

  def main(): Unit = {
    for (i <- 1 to MAX_INT) {
      lengths(i - 1) = collatzLength(i, lengths)
    }
    val maxLength = argmax(lengths) + 1 // the number n is in position n - 1
    println(maxLength)
    // lengths
  }

}