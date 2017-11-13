def fizzBuzz(i: Int): String = {
  if (i % 15 == 0) "FizzBuzz"
  else if (i % 5 == 0) "Buzz"
  else if (i % 3 == 0) "Fizz"
  else i.toString
}

def fizzBuzz2(n: Int): String = n match {
  case x if x % 15 == 0 => "FizzBuzz"
  case x if x % 3 == 0 => "Fizz"
  case x if x % 5 == 0 => "Buzz"
  case x => x.toString
}

def fizzBuzz3(n: Int): String = {
  (n % 3, n % 5, n % 15) match {
    case (0, 0, 0) => "FizzBuzz"
    case (0, _, _) => "Fizz"
    case (_, 0, _) => "Buzz"
    case _ => n.toString
  }

}

//println((1 to 100).map(fizzBuzz))
//println((1 to 100).map(fizzBuzz2))
(7 to 16).map(fizzBuzz2)
(10 to 20) map fizzBuzz2
(306 to 317).map(fizzBuzz3)
