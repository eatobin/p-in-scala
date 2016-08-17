case class CaseP(var firstName: String) {
  def setName(newName: String) {
    firstName = newName
  }
}

var karen = CaseP("Karen")
println(karen.firstName)
karen.setName("Eric")
println(karen.firstName)
