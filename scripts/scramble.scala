var list: List[Char] = List('a', 'b', 'c', 'd', 'e')
val r = scala.util.Random

def forLoop(): Unit = {
  for (i <- list.indices) {
    val helperK = r.nextInt(list.length)
    val helperV = list(i)
    list = list.updated(i, list(helperK))
    list = list.updated(helperK, helperV)
  }
  println(list)
}

forLoop()
