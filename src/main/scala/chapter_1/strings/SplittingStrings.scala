package chapter_1.strings

object SplittingStrings extends App {
 val x = "hello, world".split(" ")
  println(x)
//fiecare symbol in ""  face de rind nou
  val a = "hello world".split(" ").foreach(println)

 // e dat un string din citeva cuvinte prin virgula
 val s = "eggs, milk, butter, coco puffs"
  println(s)
//printam fiecare cuvint din rind nou fara virgula si cu spatiu inainte de cuvint
  val s1 = "eggs, milk, butter, coco puffs".split(",").foreach(println)
// face fiecare cuvint de rind nou si exclude virgula si nu lasa spatiu
  val s2 = "eggs, milk, butter, coco puffs, chokolate".split(",").map(_.trim).foreach(println)

  val al = "hello world, this is Al".split("\\s+")
 println(al)

 //exemple
 //metoda split si foreach face tot stringul din rind nou fara spatiu si fara virgule
 val ex = "Scrim un string din citeva cuvinte".split("\\s+").foreach(println)
 //exeplu 2
 //exclude virgulele si lasa spatiu care este facut dupa virgula in string
 val ex2 = "Mai, facem, un, string, din, citeva, cuvinte".split(",").foreach(println)


}

