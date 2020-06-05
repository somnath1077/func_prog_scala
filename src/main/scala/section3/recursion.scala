package section3

object recursion {
  def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

  def gcd_iter(a: Int, b: Int): Int = {
    var second = b
    var first = a
    if (second == 0) return first
    while (second != 0) {
      var temp = second
      second = first % second
      first = temp
    }
    first
  }

  def factorial(n: Int): Int = {
    def loop(acc: Int, n: Int): Int = {
      if (n == 0) acc
      else loop(acc * n, n - 1)
    }

    loop(1, n)
  }
}
