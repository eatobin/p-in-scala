object Hello {
  def main(args: Array[String]): Unit = {
    println("Hello, world!")
    println(testerBestEst(pets)(constFun2))
    println(testerBestEst2(ints)(constFun2))
  }

  def testerBestEst[A, B](xs: List[A])(f: A => B): List[B] =
    xs.map(f)

  def testerBestEst2[A, B](xs: List[A])(f: A => B): List[B] =
    xs.map((x: A) => f(x: A))

  def constFun2[A](a: A): String =
    "Eric"

  def ints = List(22, 33, 44)

  def pets = List("cat", "dog", "bird", "fish")
}

//In Haskell:
//
//constantFun :: a -> String
//constantFun x =
//  "Eric"
//
//testerBestEst2 :: [a] -> (a -> b) -> [b]
//  testerBestEst2 xs f =
//  map f xs
