@annotation.tailrec
def printArray(i: Int, xs: Array[String]) {
  if (i < xs.length) {
    println("String #" + i + " is " + xs(i))
    printArray(i + 1, xs)
  }
}

printArray(0, Array("first", "second", "third"))

// :load /Users/eatobin/scala_projects/p-in-scala/scripts/tailrec_print_array.scala
