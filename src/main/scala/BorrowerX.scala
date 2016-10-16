case class BorrowerX(name: String, maxBooks: Int)

object BorrowerX {

  def getName(br: BorrowerX): String = br.name

  def getName2(br: BorrowerX, c: Int): String =
    if (c == 0)
      br.name.toLowerCase()
    else br.name.toUpperCase()

  def findBorrowerX(n: String, brs: List[BorrowerX]): BorrowerX = {
    val coll: List[BorrowerX] = brs.filter(b => getName(b) == n)
    if (coll.isEmpty) {
      null
    } else {
      coll.head
    }
  }

  def findBorrowerX2(n: String, brs: List[BorrowerX], f: BorrowerX => String): BorrowerX = {
    val coll: List[BorrowerX] = brs.filter(b => f(b) == n)
    if (coll.isEmpty) {
      null
    } else {
      coll.head
    }
  }

}

// :paste /home/eric/scala_projects/p-in-scala/src/main/scala/BorrowerX.scala
// :paste /Users/eatobin/scala_projects/p-in-scala/src/main/scala/BorrowerX.scala
//val br1 = BorrowerX("Borrower1", 1)
//val br2 = BorrowerX("Borrower2", 2)
//val br3 = BorrowerX("Borrower3", 3)
//val br4 = BorrowerX("borrower4", 4)
//val br5 = BorrowerX("BORROWER5", 5)
//val brs1 = List(br1, br2, br3, br4, br5)

//scala> BorrowerX.findBorrowerX("Borrower3", brs1)
//res0: BorrowerX = BorrowerX(Borrower3,3)

//scala> BorrowerX.findBorrowerX2("Borrower3", brs1, BorrowerX.getName(_))
//res1: BorrowerX = BorrowerX(Borrower3,3)

//scala> BorrowerX.findBorrowerX2("Borrower33", brs1, BorrowerX.getName(_))
//res2: BorrowerX = null

//scala> BorrowerX.findBorrowerX2("BORROWER5", brs1, BorrowerX.getName2(_, 1))
//res1: BorrowerX = BorrowerX(BORROWER5,5)
//
//scala> BorrowerX.findBorrowerX2("BORROWER5", brs1, BorrowerX.getName2(_, 0))
//res2: BorrowerX = null
//
//scala> BorrowerX.findBorrowerX2("borrower4", brs1, BorrowerX.getName2(_, 0))
//res3: BorrowerX = BorrowerX(borrower4,4)
//
//scala> BorrowerX.findBorrowerX2("borrower4", brs1, BorrowerX.getName2(_, 1))
//res4: BorrowerX = null
