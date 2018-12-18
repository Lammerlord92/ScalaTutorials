package lectures.part1basics

object ValuesVariablesTypes extends App {
  val x = 42
  println(x)
  //x=2 da error, ya que val es una variable inmutable, por lo que no tiene efectos "secundarios"
  //El tipo de las val es opcional, por eso no hace falta mencionar el tipo, ya que el compilador
  //es suficientemente listo como para asignar el tipo

  val aString: String = "hello";
  val anotherString = "goodbye"
  val aBoolean: Boolean = false
  val aChar: Char = 'a'
  val anInt = x
  val aShort: Short = 4566
  val aLong: Long = 1232183213122123321L
  val aFloat = 2.0f
  val aDouble: Double = 3.14

  //Variables ->Tienen efectos secundarios
  var aVariable: Int = 4
  aVariable = 5
  aVariable+=1

}
