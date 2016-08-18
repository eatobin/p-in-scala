val someNumbers = List(-11, -10, -5, 0, 5, 10)

someNumbers.foreach((x: Int) => println(x))
someNumbers.foreach(println _)
someNumbers.foreach(println)

def sum(a: Int, b: Int, c: Int) = a + b + c
val a = sum _

val b = sum(1, _: Int, 3)
b(2) // 6
b(5) // 9
