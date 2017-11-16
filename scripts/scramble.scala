def forLoop(array: Array[Char]): Unit = {
  val r = scala.util.Random
  for (i <- array.indices) {
    val helperK = r.nextInt(array.length)
    val helperV = array(i)
    array(i) = array(helperK)
    array(helperK) = helperV
  }
  println("(" ++ array.mkString(", ") ++ ")")
}

forLoop(Array('a', 'b', 'c', 'd', 'e'))
