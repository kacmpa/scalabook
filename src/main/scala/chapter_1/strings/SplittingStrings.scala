package chapter_1.strings

object SplittingStrings extends App {
 val x = "hello world".split(" ")
  println(x)

  val a = "hello world".split(" ").foreach(println)

  val s = "eggs, milk, butter, coco puffs"
  println(s)

  val s1 = "eggs, milk, butter, coco puffs".split(",").foreach(println)

  val s2 = "eggs, milk, butter, coco puffs"
  println(s2.split(",").map(_.trim))

 val al = "hello world, this is Al".split("\\al")

}

