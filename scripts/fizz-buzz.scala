def fizzBuzz(i: Int): String = {
  if (i % 15 == 0) "FizzBuzz"
  else if (i % 5 == 0) "Buzz"
  else if (i % 3 == 0) "Fizz"
  else i.toString
}

println((1 to 100).map(fizzBuzz))
