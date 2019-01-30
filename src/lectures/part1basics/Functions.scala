package lectures.part1basics

object Functions extends App {
  def aFunction(a:String,b:Int):String={
    a+" "+b
  }

  println(aFunction("hello",3))

  def aParameterlessFunction()=42
  println(aParameterlessFunction)

  def aRepeteatedFunction(aString:String,n:Int):String={
    if(n==1) aString
    else aString+aRepeteatedFunction(aString,n-1)
  }

  println(aRepeteatedFunction("hello",3))
  //CUANDO NECESITES BUCLES EN SCALA, USA FUNCIONES RECURSIVAS
  //EStas funciones necesitan que se especifique el tipo de retorno


  def greetingFunction(name:String,age:Int):String="Hi, my name is "+name +" and i'm "+age +" years old"
  println(greetingFunction("Dan",23))

  def factorial(x:Int):Int={
    if(x<=0) 1
    else x*factorial(x-1)
  }
  println(factorial(5))

  def fibonacci(x:Int):Int={
    if(x<=2) 1
    else fibonacci(x-1)+fibonacci(x-2)
  }
  println(fibonacci(8))

  def isPrime(n:Int):Boolean={
    def isPrimeUntil(t:Int):Boolean=
      if (t<=1) true
      else n%t !=0 && isPrimeUntil(t-1)

    isPrimeUntil(n/2)
  }
  println(isPrime(37))
  println(isPrime(2003))
  println(isPrime(37*2003))


}
