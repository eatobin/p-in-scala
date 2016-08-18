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

def tester43[A, B](x: List[A], f: A => B): List[B] = {
  val li = x.map((r: A) => f(r: A))
  li
}

def tester3(x: List[Int], f: Int => Int): List[Int] = {
  val li = x.map(j => f(j))
  li
}

def tester62[X, Y](x: List[X]): List[Int] = {
  val li = x.map(r => constFun1(r))
  li
}

println(tester3(List(1, 2, 44), identFun))
println(tester3(List(1, 2, 44), constFun1))
println(tester43(List(1, 2, 44), constFun1))
println(tester43(List(1, 2, 44), identFun))
