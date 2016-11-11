def formatArgs(args: Array[String]) = args.mkString("\n")
println(formatArgs(Array("zero", "one", "two")))

val res = formatArgs(Array("zero", "one", "two"))
println(assert(res == "zero\none\ntwo"))
//println(assert(res == "zero\none\ntwoX", "Does not work!"))

// :load /home/eric/scala_projects/p-in-scala/scripts/pis-97.scala
