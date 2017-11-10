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

//println((1 to 100).map(fizzBuzz))
println((1 to 100).map(fizzBuzz2))
