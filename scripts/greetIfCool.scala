def greetIfCool1(coolness: String): Unit = {
  val cool = coolness == "downright frosty yo"
  if (cool) println("eyyyyy. What's shakin1'?")
  else println("pshhh1")
}

greetIfCool1("Hi!")
greetIfCool1("downright frosty yo")

def greetIfCool2(coolness: String): Unit = {
  def cool(v: String): Boolean = v == "downright frosty yo"

  if (cool(coolness)) println("eyyyyy. What's shakin2'?")
  else println("pshhh2")
}

greetIfCool2("Hi!")
greetIfCool2("downright frosty yo")

def greetIfCool3(coolness: String): Unit = {
  coolness == "downright frosty yo" match {
    case true => println("eyyyyy. What's shakin'?3")
    case _ => println("pshhh3")
  }
}

greetIfCool3("Hi!")
greetIfCool3("downright frosty yo")
