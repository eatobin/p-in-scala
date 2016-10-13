case class BorrowerX(name: String, maxBooks: Int)

object BorrowerX {

  def getName(br: BorrowerX): String = br.name

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
// val br1 = BorrowerX("Borrower1", 1)
// val br2 = BorrowerX("Borrower2", 2)
// val br3 = BorrowerX("Borrower3", 3)
// val brs1 = List(br1, br2, br3)

//scala> BorrowerX.findBorrowerX("Borrower3", brs1)
//res0: BorrowerX = BorrowerX(Borrower3,3)

//scala> BorrowerX.findBorrowerX2("Borrower3", brs1, BorrowerX.getName(_))
//res1: BorrowerX = BorrowerX(Borrower3,3)

//scala> BorrowerX.findBorrowerX2("Borrower33", brs1, BorrowerX.getName(_))
//res2: BorrowerX = null
