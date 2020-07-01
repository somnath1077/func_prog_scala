package section6

object HigherOrderListFunctions {
  def squareList(xs: List[Int]): List[Int] = xs match {
    case List() => xs
    case x :: xs1 => x * x :: squareList(xs1)
  }

  def squareList2(xs: List[Int]): List[Int] = xs map (x => x * x)

  def pack[T](xs: List[T]): List[List[T]] = xs match {
    case Nil => Nil
    case x :: xs1 =>
      val (first, last) = xs span (y => y == x)
      first :: pack(last)
  }

  def encode[T](xs: List[T]): List[(T, Int)] = xs match {
    case Nil => Nil
    case x :: xs1 =>
      val (first, last) = xs span (y => y == x)
      (x, first.length) :: encode(last)
  }


  def concat[T](xs: List[T], ys: List[T]): List[T] = xs match {
    case Nil => ys
    case x :: xs1 => x :: concat(xs1, ys)
  }

  def posElems(xs: List[Int]): List[Int] = xs match {
    case Nil => Nil
    case y :: ys => if (y > 0) y :: posElems(ys) else posElems(ys)
  }
}
