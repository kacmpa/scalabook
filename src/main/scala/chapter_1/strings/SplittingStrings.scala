package chapter_1.strings

object SplittingStrings extends App {
  "hello world".split(" ")
  "hello world".split(" ").foreach(println)

  val s = "eggs, milk, butter, Coco Puffs"
  println(s.split(",").map(_.trim))

  "hello world, this is Al".split("\\s+")

  "hello world".split(" ")

  "hello world".split(' ')
}
