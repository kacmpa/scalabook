package chapter_1.string

object CreatingMultilineStrings extends App {
  val foo = """This is
  |a multiline
  String""".stripMargin
  println(foo)

  val speech = """Four score and
  |seven years | ago""".stripMargin
  println(speech)
//# lasa spatiu gol inaintea stringului
  val speech1 = """Four score and
  # seven years ago""".stripMargin('#')
  println(speech1)

  val speech2 = """Four score and
  |seven years ago
  |our fathers""".stripMargin.replaceAll("\n", " ")
  println(speech2)

  val s = """This is known as a
  | "multiline" string
  | or 'heredoc' syntax.""". stripMargin.replaceAll("\n", " ")
  println(s)




}
