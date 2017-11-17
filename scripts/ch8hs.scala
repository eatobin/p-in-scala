//@annotation.tailrec **Is not tail-recursive**
def factorial(n: Int): Int =
  n match {
    case 0 => 1
    case x =>
      x * factorial(x - 1)
  }

//scala> factorial(6)
//res3: Int = 720

def inc(n: Int): Int =
  n + 1

def three(): Int =
  (inc _ compose inc compose inc) (6)

//scala> three
//res9: Int = 9

def incTimes(t: Int)(s: Int): Int =
  (t, s) match {
    case (0, n) => n
    case (i, n) =>
      inc(incTimes(i - 1)(n))
  }

//scala> incTimes(3)(6)
//res11: Int = 9
//scala> incTimes(3)(16)
//res12: Int = 19
//scala> incTimes(0)(16)
//res13: Int = 16
//scala> incTimes(16)(0)
//res14: Int = 16

def applyTimes(t: Int)(f: Int => Int)(s: Int): Int =
  (t, f, s) match {
    case (0, _, n) => n
    case (i, g, n) => g(applyTimes(i - 1)(g)(n))
  }

//scala> applyTimes(0)(inc)(8)
//res20: Int = 8
//scala> applyTimes(4)(inc)(8)
//res21: Int = 12
