/**
  * Created by santteegt on 14/11/2016.
  */
object SumOfMultiples {

  def sumOfMultiples(multiples: List[Int], bound: Int): Int = {
    val values = for {
      z <- multiples
      x <- Range(1, bound)
      if (x % z == 0)
    } yield (x)

    values.toSet.foldLeft(0)((t, x) => t + x)
  }

  def sumOfMultiples2(items: List[Int], max: Int): Int = {
    (1 until max).filter(i => items.exists( i % _ == 0)).sum
  }

}
