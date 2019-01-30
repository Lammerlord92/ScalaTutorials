package lectures.part2oop

import lectures.part2oop.MethodNotations.Person

object MethodNotations extends App {

  class Person(val name:String, favoriteMovie:String,val age: Int=0){

    def likes(movie:String):Boolean=movie==favoriteMovie
    def hangOutWith(person:Person):String=s"${this.name} is hanging out with ${person.name}"
    def +(person:Person):String=s"${this.name} is hanging out with ${person.name}"
    def + (string:String):Person=new Person(s"${this.name} "+string,favoriteMovie,age)
    def unary_+ : Person=new Person(name,favoriteMovie,age+1)
    def unary_! : String=s"${name}, what the heck?!"
    def isAlive=true
    def apply(): String=s"Hi, i'm $name and i like $favoriteMovie, my age is $age"
  }

  val mary=new Person("Mary", "Inception",16)
  println(mary.likes("Inception"))
  println(mary likes "Inception")//Se llama a la funcion porque tiene 1 argumento, esto se llama sinctactic sugar

  val tom=new Person("Tom", "Fight Club",22)
  println(mary hangOutWith tom)
  println(mary + tom)
  //TODAS LAS OPERACIONES SON MÉTODOS

  //Prefijos
  val x= -1
  val y=1.unary_-
  //X es equivalente a y

  println(!mary)

  //Sufijos-> Solo para métodos sin parámetros
  println(mary.isAlive)
  println(mary isAlive)

  //apply
  println(mary.apply())
  println(mary())
  println((mary+"the rock star")())
  println((+mary)())


}
