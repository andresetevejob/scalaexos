object Main {
  def main(args: Array[String]): Unit ={
    println("Hello, Scala developer!")
    val greeter = new Greeter("Scala","Learner");
    println(greeter.greet(" Andrew "))
    println(add(45,42))
    val point  = Point(1,2)
    val anotherPoint = Point(1,2)

    if(point == anotherPoint){
      println(point+" est le meme que "+anotherPoint)
    }else{
      println ("Les points sont differents")
    }
  }

  val addOne = (x:Int) => x + 1 //function with one parameters

  val add = (x:Int,y:Int) => x + y //function with two parameters

  val getAnswuer = () => 42 // function without parameters
  val customizeGreeter = new CustomizeGreeter("Scala developer")
  println(customizeGreeter.greet("Andrew"))

}

class Greeter(prefix: String, suffix: String) {
  def greet(name: String): Unit =
    println(prefix + name + suffix)
}

case class Point(x:Int, y:Int)

class DefaultGreeter extends GreeterTrait{

}
class CustomizeGreeter(prefix: String) extends GreeterTraitDefault{
  override def greet(name: String): String = prefix+" "+name
}
trait GreeterTrait{
  def greetDefaut(name:String):String = name //default implementation,this features exist in java 8.Interface has default method
}

trait GreeterTraitDefault{
  def greet(name :String):String //abstract method in trait

}