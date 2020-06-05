package section3

object hof {
  def sum(f: Int => Int, a: Int, b: Int): Int = {
    if (a > b) 0
    else f(a) + sum(f, a + 1, b)
  }

  def sumTailRecursive(f: Int => Int, a: Int, b: Int): Int = {
    def loop(acc: Int, a: Int): Int = {
      if (a > b) acc
      else loop(acc + f(a), a + 1)
    }

    loop(acc = 0, a)
  }

  def prod(f: Int => Int)(a: Int, b: Int): Int = {
    if (a > b) 1 else f(a) * prod(f)(a + 1, b)
  }

}
