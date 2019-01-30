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

class Writer(firstName:String,surname:String,val year:Int){
  def fullName(): String =
    firstName+" "+surname

}
class Novel(name:String,yearRelease:Int,author:Writer){
  def authorAge=yearRelease-author.year
  def isWrittenBy(author:Writer) =this.author.eq(author)
  def copy(releaseYear:Int)=new Novel(this.name,releaseYear,this.author)
}
class Counter(val x:Int){
  def currentCount=x
  def increment=new Counter(x+1)
  def decrement=new Counter(x-1)
}