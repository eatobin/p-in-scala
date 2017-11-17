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
