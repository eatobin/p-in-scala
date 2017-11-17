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

def fibonacci(n: Int): Int =
  n match {
    case 0 => 0
    case 1 => 1
    case x =>
      fibonacci(x - 1) + fibonacci(x - 2)
  }

//scala> fibonacci(6)
//res22: Int = 8
//scala> fibonacci(0)
//res23: Int = 0
//scala> fibonacci(1)
//res24: Int = 1
//scala> fibonacci(2)
//res25: Int = 1
//scala> fibonacci(22)
//res26: Int = 17711

def dividedBy(num: Int)(denom: Int): (Int, Int) = {
  @annotation.tailrec
  def go(n: Int)(d: Int)(count: Int): (Int, Int) = {
    if (n < d) (count, n)
    else go(n - d)(d)(count + 1)
  }

  go(num)(denom)(0)
}

//scala> dividedBy(20)(4)
//res28: (Int, Int) = (5,0)
//scala> dividedBy(21)(4)
//res29: (Int, Int) = (5,1)
