package ChecksumAccumulator

object FallWinterSpringSummer extends App {
  for (season <- List("fall", "winter", "spring"))
    println(season + ": " + ChecksumAccumulator.calculate(season))
}
