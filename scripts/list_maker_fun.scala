def constFun1[A](a: A): Int = 1
def constFun2[A](a: A): String = "Eric"

constFun1(22)
constFun1("a")
constFun2(22)
constFun2("no")

def identFun[A](a: A): A = a

identFun(99)
identFun("dog")
identFun(3.14)

//def listMakerFun[A](a: A, f: (A) => A): List[A, Int] = {
//
//}

def tester(x: Int, f: Int => Int): List[Int] = {
  val li = List(x, f(x))
  li
}

tester(12, (x: Int) => 99)

def tester2[X](x: X, f: X => X): List[X] = {
  val li = List(x, f(x))
  li
}

tester2(12, (x: Int) => 99)
tester2("v", (x: String) => "HH")

List(1, 2, 3).map(x => x * 2)
List(1, 2, 3).map(x => constFun1(x))
List("a", "b", "c").map(x => constFun1(x))
List("a", "b", "c").map(x => identFun(x))
List(22, 33, 44).map(x => identFun(x))

def testerA[A](l: List[A], f: A => A): List[A] = {
  val li = l.map((r: A) => f(r: A))
  li
}
//testerA (List('a','b','c'), identFun[Char])

def testerBest[A](l: List[A])(f: A => A): List[A] =
  l.map(f)
//scala> testerBest (List(1,2,3)) (identFun)

def testerBestEst[A, B](l: List[A])(f: A => B): List[B] =
  l.map(f)
//scala> testerBestEst (List(1,2,3)) (identFun)

def testerBestEst2[A, B](xs: List[A])(f: A => B): List[B] =
  xs.map((x: A) => f(x: A))

def testerCurried[A](l: List[A])(f: A => A): List[A] = {
  val li = l.map((r: A) => f(r: A))
  li
}
//testerCurried (List(1,2,3)) (identFun)

def testerChar(l: List[Char], f: Char => Char): List[Char] = {
  val li = l.map((r: Char) => f(r: Char))
  li
}

def tester3(x: List[Int], f: Int => Int): List[Int] = {
  val li = x.map(j => f(j))
  li
}

println(tester3(List(1, 2, 44), identFun))
println(tester3(List(1, 2, 44), constFun1))
println(testerBestEst(List(1, 2, 44))(constFun2))
println(testerBestEst(List('a', 'b', 'c'))(identFun))
