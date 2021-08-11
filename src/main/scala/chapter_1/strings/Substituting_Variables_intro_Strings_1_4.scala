package chapter_1.strings

object Substituting_Variables_intro_Strings_1_4 extends App {
  val name = "Fred"
  val age = 33
  val weight = 200.00
  println(s"$name is age years old, and weight $weight pounds.")
  println(s"Age next year: ${age + 1}")
  println(s"You are 33 years old: ${age == 33 }")

  case class Student(name: String, score: Int)
  val hannah = Student("Hannah", 95)
  println(s"${hannah.name} has a score of ${hannah.score}")
    //interpolator f cifra inainte de f scaote sau adauca zecimele
  println(f"$name is $age years old, and weight $weight%.2f pound.")
  println(f"$name is $age years old, and weight $weight%.0f pound.")

  //my example
  val name_1 = "Alexandru"
  val name_2 = "Ion"
  val daca = "pentru a nu fi prost"
  val teacher = "de acea domnul"
  println(s"$name_1 vrea sa invete scala $daca,$teacher $name_2 il invata ")
  val moment = "koncennii"
  println(s"$name_1 este $moment? ${moment == "koncennii"}")

}
