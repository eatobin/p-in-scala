def myRubyStyleForLoop {
  println("for loop using my Ruby-style iteration")
  Array("first", "second", "third").foreach { arg =>
    println(arg)
  }
}

myRubyStyleForLoop
