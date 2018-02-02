import scalaz.Scalaz._

def safeHead[A](l: List[A]): Option[A] = l match {
  case List() => None
  case (x :: _) => Some(x)
}

//scala> safeHead(List())
//res5: Option[Nothing] = None
//
//scala> safeHead(List(11,22))
//res6: Option[Int] = Some(11)
//
//scala> List().headOption
//res7: Option[Nothing] = None
//
//scala> List(11,22).headOption
//res8: Option[Int] = Some(11)

def safeTail[A](l: List[A]): Option[List[A]] = l match {
  case List() => None
  case List(_) => None
  case (_ :: xs) => Some(xs)
}

//scala> safeTail(List())
//res11: Option[List[Nothing]] = None
//
//scala> safeTail(List(1,2,3))
//res12: Option[List[Int]] = Some(List(2, 3))
//
//scala> safeTail(List(1))
//res13: Option[List[Int]] = None

val ericList = List(1, 2, 3)
val (primary, rest) = ericList <^> (nel => some(nel.head) -> nel.tail)

val ericEmptyList = List.empty[Int]
val (primary1, rest1) = ericEmptyList <^> (nel => some(nel.head) -> nel.tail)

val ericAnyList = List('a', 'b', 'c')
val (primary2, rest2) = ericAnyList <^> (nel => some(nel.head) -> nel.tail)

val ericAnyEmptyList = List.empty[Char]
val (primary3, rest3) = ericAnyEmptyList <^> (nel => some(nel.head) -> nel.tail)


//scala> primary
//res3: Option[Int] = Some(1)
//
//scala> rest
//res4: scalaz.IList[Int] = [2,3]
//
//scala> primary1
//res5: Option[Int] = None
//
//scala> rest1
//res6: scalaz.IList[Int] = []

def safeHead2(l: List[Int]): Option[Int] = {
  val (h, _) = l <^> (nel => some(nel.head) -> nel.tail)
  h
}

def safeTail2(l: List[Int]): scalaz.IList[Int] = {
  val (_, t) = l <^> (nel => some(nel.head) -> nel.tail)
  t
}

//scala> safeHead2(ericList)
//res10: Option[Int] = Some(1)
//
//scala> safeHead2(ericEmptyList)
//res11: Option[Int] = None
//
//scala> safeTail2(ericList)
//res12: scalaz.IList[Int] = [2,3]
//
//scala> safeTail2(ericEmptyList)
//res13: scalaz.IList[Int] = []
//
//scala> safeTail2(List(1))
//res0: scalaz.IList[Int] = []
