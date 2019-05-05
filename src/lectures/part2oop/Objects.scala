package lectures

object Objects extends App {
  //ScaLA NO TIENE FUNCIONALIDAD  A NIVEL DE CLASE (STATIC)
  object Person{//Singleton instance type+its only instance
    //static class level
    val N_EYES=2
    def canFly:Boolean=false
    //Factory method
    def apply(mother:Person,father:Person):Person=new Person("Bobbie")
  }
  class Person(val name: String){
    //instance-level functionality
  }
  //COMPANIONS (objetos y clases con el mismo nombre)
  //provoca que el objeto no sea totalmente estático
  println(Person.N_EYES)
  println(Person.canFly)
  val mary=new Person("Mary")
  val john =new Person("John")
  val jack = Person
  val voltaire = Person
  println(mary==john)
  println(mary==jack)
  println(voltaire==jack)
  val bobbie=Person(mary,john)
  println(bobbie.name)

  //Scala Applications=Object with
  //def main(arg:Array[String]:Unit
  //Si se quita la extensión de App se puede poner este método para ejecutarlo
}
