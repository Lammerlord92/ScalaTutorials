package lectures.part1basics

object DefaultArgs extends App {

  def trFactorial(x:Int,accumulator:BigInt): BigInt ={
    if (x<=1) accumulator
    else trFactorial(x-1,x*accumulator)
  }
  val fact10=trFactorial(10,1)
  //El accumulator siempre será 1 cuando es llamado el factorial

  def factorial(x:Int,accumulator:BigInt=1): BigInt ={
    if (x<=1) accumulator
    else trFactorial(x-1,x*accumulator)
  }
  val fact9=factorial(9)
  //Lo que se ha echo es poner al acumulador el valor 1 como valor por defecto
  //Así, también, se puede especificar un multiplicador al factorial (por si se quiere multiplicar por 2)
  //Se utiliza con valores que se van repetir mucho

  def savePic(format:String="jpg",width:Int=1920,height:Int=1080):Unit=println("picture")
  savePic("bpm") //Rellena el format y el resto por defecto
  savePic(width = 800)
  savePic(height=600,width = 800)
}
