def dividedBy(num: Int)(denom: Int): (Int, Int) = {
  @annotation.tailrec
  def go(n: Int)(d: Int)(count: Int): (Int, Int) = {
    if (n < d) (count, n)
    else go(n - d)(d)(count + 1)
  }

  go(num)(denom)(0)
}

dividedBy(20)(4)
dividedBy(21)(4)
