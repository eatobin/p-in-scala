def formatArgs(args: Array[String]) = args.mkString("\n")
println(formatArgs(Array("zero", "one", "two")))

val res = formatArgs(Array("zero", "one", "two"))
println(assert(res == "zero\none\ntwo"))
