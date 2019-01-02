package lectures.part2oop

object OOBasics extends App {
  val person=new Person("John",26)
  println(person.age)
  println(person.x)
  person.greet("Daniel")
  person.greet()
}

class Person (name: String,val age:Int=0) //constructor
//Los parámetros de clase no son atributos, para que lo trate como
//atributo:
//1.-Añadir val o var al parámetro de entrada
{
  //Cuerpo de la clase
  val x=2 //Atributos
  var y=3

  println(1+3) //Es la primera que se evalúa, al ser llamado cuando se hace el constructor

  def greet(name: String)=println(s"${this.name} says: Hi, $name")
  def greet()=println(s"Hi, i'm $name")

  //Contructors
  def this(name:String)=this(name,0) //Sobra
  def this()=this("John Doe")
}

