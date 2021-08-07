package chapter_1.string

object TestingStringEquality_1_1 extends App {
  // Aici se compara stringutrile intre ele
  val s1 = "Hello"
  val s2 = "Hello"
  val s3 = "H" + "ello"
  println(s1 == s2)
  println(s1 == s3)
  // Aici la se da valoarea null
  val s4: String = null
  println(s3 == s4)
  println(s4 == s3)
  // Aici pentru val1 si val2 se defineste sa fie ambele cu litera mare
  val a1 = "Hello"
  val a2 = "hello"
  println(s1.toUpperCase == s2.toUpperCase)

/*  val b1: String = null
  val b2: String = null
  println(b1.toUpperCase == b2.toUpperCase)*/
  // Aici se foloseste metoda de equalsIgnoreCase
  val c = "Marisa"
  val d = "marisa"
  println(c.equalsIgnoreCase(d))

  //exemplele mele
  // exemplu de gen daca poate fi true dupa 1 continut
  val cuvint = "bolohan"
  val propozitie = "Aceasta propozitie contine cuvintul bolohan"
  println(cuvint == propozitie)

  val gen = "male"
  val gen1 = "female"
  val gen2 = "female".drop(2) //doar pentru interes
  val gen_age = 30
  val gen1_age = 20
  println(gen == gen1)
  println(gen_age - gen1_age)
  println(gen2)
  println(gen == gen2)
}
