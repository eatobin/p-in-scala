case class CaseP(var firstName: String) {
  def setName(newName: String) {
    firstName = newName
  }
}

var karen = CaseP("Karen")
println(karen.firstName)
karen.setName("Eric")
println(karen.firstName)

// :load /Users/eatobin/scala_projects/p-in-scala/scripts/case_class_person.scala
