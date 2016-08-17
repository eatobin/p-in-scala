class Person(firstName: String) {
  def fn = firstName
}

val bob = new Person("Bob")
println(bob.fn)
