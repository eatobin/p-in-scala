@annotation.tailrec
def printArray(i: Int, xs: Array[String]) {
  if (i < xs.length) {
    println("String #" + i + " is " + xs(i))
    printArray(i + 1, xs)
  }
}

printArray(0, Array("first", "second", "third"))
