package lectures.part1basics

object Expressions extends App {
  val x=1+2
  println(x)

  println(1==x)

  println(!(x==1))

  var aVariable=2
  aVariable*=3
  println(aVariable)
  aVariable/=5
  println(aVariable)

  //Instrucciones (Haz) vs Expresiones (Dame valor de)
  val aCondition=true
  val aConditionedValue=if(aCondition) 5 else 3 //IF EXPRESSION
  println (aConditionedValue)

  //NUNCA ESCRIBAS ESTO EN SCALA, EVITA BUCLES
  var i=0
  while(i<10){
    println(i)
    i+=1
  }
  //LOS BUCLES SON DE UNA PROGRAMACIÓN IMPERATIVA, CLÁSICA DE JAVA
  //TODO EN SCALA ES UNA EXPRESIÓN MENOS VARIABLES Y PAQUETES

  val aWeirdValue =(aVariable=3) //Tipo Unit===void (Lo que devuelve no es significativo)
  println(aWeirdValue) //Devuelve un objeto vacio

  //sideEffects -> println,whiles, reasignación de variables, debería declararse así:
  i=0
  val aWhile=  while(i<10){  //aWhile es de tipo Unit
    println(i)
    i+=1
  }

  //Code blocks
  val aCodeBlock={ //Expresión
    val y=2
    val z=y+1
    if (z>2) "hello" else "goodbye"
  }
}
