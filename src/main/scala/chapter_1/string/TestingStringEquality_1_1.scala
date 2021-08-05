package chapter_1.string

object TestingStringEquality_1_1 extends App {
  val s1 = "Hello"
  val s2 = "Hello"
  val s3 = "H" + "ello"
  println(s1 == s2)
  println(s1 == s3)

  val s4: String = null
  println(s3 == s4)
  println(s4 == s3)

  val a1 = "Hello"
  val a2 = "hello"
  println(s1.toUpperCase == s2.toUpperCase)

/*  val b1: String = null
  val b2: String = null
  println(b1.toUpperCase == b2.toUpperCase)*/

  val c = "Marisa"
  val d = "marisa"
  println(c.equalsIgnoreCase(d))
}
