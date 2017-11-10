case class CaseP(var firstName: String) {
  def setName(newName: String) {
    firstName = newName
  }
}

var karen = CaseP("Karen")
println(karen.firstName)
karen.setName("Eric")
println(karen.firstName)

case class CaseP2(firstName: String) {}

val eric = CaseP2("Eric")
println(eric.firstName)

// :load /Users/eatobin/scala_projects/p-in-scala/scripts/case_class_person.scala
