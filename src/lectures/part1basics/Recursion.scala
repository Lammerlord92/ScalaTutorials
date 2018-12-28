package lectures.part1basics

object Recursion extends App {

  def factorial(x:Int):Int={
    if(x<=1) 1
    else {
      println("Computing factorial of "+x+" - I first need factorial of "+(x-1))
      val res=x*factorial(x-1)
      println("Computed factorial of "+x)
      res
    }
  }
  println(factorial(50000))

  //el problema es que los métodos recursivos, sobrecargan la pila, por lo que hay que hacer estos saltos de forma mas 'inteligente'

  def anotherFactorial(n:Int): BigInt ={
    def factorialHelper(x:Int,accumulator:BigInt):BigInt=
      if (x<=1) accumulator
      else factorialHelper(x-1,x*accumulator)
    factorialHelper(n,1)
  }

  //anotherFactorial(10)=factorialHelper(10,1)
  //=factorialHelper(9,10*1)=factorialHelper(8,9*10*1)
  //....
  //Esta forma funciona con números enormes
  //Funciona debido a que para el primer caso, se necesita reservar la pila para las ejecuciones posteriores
  //de la segunda manera, se libera la pila al no necesitar "guardar" el estado a resolver. Esto se conoce como
  //TAIL RECURSION, es decir, usa una llamada recursiva como última expresión. El compilador
  //lo detecta como una recursión de tipo TAIL RECURSION. (Hay que fijarse en el icono del método)
  //Esto se puede indicar con @tailrec, pero el compilador lo detecta

  //Cuando se necesitan hacer bucles, USAR TAIL_RECURSION

  def fibonacciTail(x:Int):Int={
    def fibonacciTailHelper(i:Int,acc1:Int,acc2:Int):Int=
      if(i>=x) acc1
      else fibonacciTailHelper(i+1,acc1+acc2,acc1)

    if(x<=2) 1
    else fibonacciTailHelper(3,1,1)
  }
  println(fibonacciTail(8))

  def aRepeteatedFunction(aString:String,n:Int):String={
    def aRepeteatedFunctionHelper(aString:String,n:Int,accumulator:String):String=
      if(n==1) aString
      else aRepeteatedFunctionHelper(aString,n,aString+accumulator)

    aRepeteatedFunctionHelper(aString,n-1,"")
  }

  def isPrime(n:Int):Boolean={
    def isPrimeTailRec(t:Int,isStillPrime:Boolean):Boolean=
      if(!isStillPrime) false
      else if (t<=1) true
      else isPrimeTailRec(t-1,n%t !=0 && isStillPrime)

    isPrimeTailRec(n/2, true)
  }

}
