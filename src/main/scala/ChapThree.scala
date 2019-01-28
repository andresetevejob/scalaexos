import scala.collection.mutable.ArrayBuffer
object ChapThree {

   def main(args : Array[String]):Unit = {
      val point = new Point(1,2)
      val personne = new Personne("Steve")
      println(point.x)
      println(personne.name)
   }
   //Les traits en Scala
   //


  val dog = new Dog("Harry")
  val cat = new Cat("Sally","Le chat")

  val animals = ArrayBuffer.empty[Pet]
  animals.append(dog)
  animals.append(cat)
  animals.foreach(pet => println(pet.name))

}


trait Pet {
  val name: String
}
class Cat(val name: String,val lastName:String) extends Pet
class Dog(val name: String) extends Pet


 class User
 class Personne(val name:String){

 }
 class Point(var x:Int,var y:Int){
   def move(dx:Int,dy:Int)={
     x = x + dx
     y = y + dy


   }

   override def toString: String = s"($x, $y)"
 }

 class PointAccessor {
    private var _x = 0
    private var _y=0
    private val bound = 1000

    def x = _x
    def x_= (newValue : Int):Unit = {
       if(bound > newValue ) _x  = newValue else printWarning
   }

   def y:Int = _y
   def y_= (newValue:Int):Unit={
     if(bound > newValue ) _y = newValue else printWarning
   }

   private def printWarning = {
     println("Warning");
   }
 }