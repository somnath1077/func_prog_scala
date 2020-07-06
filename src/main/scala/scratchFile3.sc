import scala.annotation.tailrec

object collatz {
  @tailrec
  def collatzLength(n: Int, compArr: Array[Int], len: Int = 1): Int = {
    if (n == 1) len
    else {
      if (compArr(n - 1) != -1) len + compArr(n - 1)
      else if (n % 2 == 0) collatzLength(n / 2, compArr, len + 1)
      else collatzLength((3 * n + 1) / 2, compArr, len + 2)
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
    val MAX_INT: Int = 1000000
    val sz: Array[Int] = Array.fill(MAX_INT)(-1)
    for (i <- 1 to MAX_INT) {
      sz(i) = collatzLength(i, sz)
    }
   println(argmax(sz))
  }

}