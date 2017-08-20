def forLoop() {
  println("for loop using Java-style iteration")
  for (i <- 3 until args.length) {
    println(args(i))
  }
}

forLoop()
