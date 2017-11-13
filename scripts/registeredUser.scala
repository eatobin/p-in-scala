type Username = String
type AccountNumber = Int

sealed trait User

case class RegisteredUser(userName: Username, accountNumber: AccountNumber) extends User

case class UnregisteredUser() extends User

def printUser(user: User): Unit = user match {
  case RegisteredUser(un, an) => println(un ++ " " ++ an.toString)
  case UnregisteredUser() => println("UnregisteredUser")
}

printUser(RegisteredUser("Eric", 12))
printUser(UnregisteredUser())
