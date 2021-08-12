package chapter_1.string

object CreatingMultilineStrings extends App {
  //slash horizontal face ca sa se inceapa de strofa noua
  val foo = """This is
  |a multiline
  String""".stripMargin
  println(foo)
// strip margin scoate spatiul de la strofa noua
  val speech = """Four score and
  |seven years |ago""".stripMargin
  println(speech)
//# lasa spatiu gol inaintea stringului
  val speech1 = """Four score and
  # seven years ago""".stripMargin('#')
  println(speech1)
// peste tot unde space ori /n va lasa spatiu ori simbol alegator
  val speech2 = """Four score and
  |seven years ago
  |our fathers""".stripMargin.replaceAll("\n", " ")
  println(speech2)
//spoate de inclu ingelemele fara a fi nevoie sa le scape.
  val s = """This is known as a
  | "multiline" string
  | or 'heredoc' syntax.""". stripMargin.replaceAll("\n", " ")
  println(s)

  //my examples
  val vorba = """vorba multa,dinti stricati""".stripMargin.replaceAll(",", " ")
  println(vorba)
  val gura = """apa minerala resan protiv jijivodeashih putei""".stripMargin.replaceAll("resan", "si maninci un cicat copt")
  println(s"ca sa nu fie $vorba trebuie sa bei $gura")

}
