import scala.util.Random

/**
  * https://docs.scala-lang.org/tour/pattern-matching.html
  * https://docs.scala-lang.org/style/naming-conventions.html
  * https://alvinalexander.com/scala/benefits-of-sealed-traits-in-scala-java-enums
  *
  *
  * http://searene.me/2017/10/06/The-difference-between-a-case-class-and-a-normal-class-in-Scala/
  * https://en.wikibooks.org/wiki/F_Sharp_Programming/Discriminated_Unions (Algebric Data)
  * https://alvinalexander.com/scala/scala-case-class-copy-method-example
  *
  * https://alvinalexander.com/java/java-deep-clone-example-source-code
  *
  *
  * https://stackoverflow.com/questions/869033/how-do-i-copy-an-object-in-java
  *
  * https://www.baeldung.com/java-deep-copy
  *
  *
  * https://danielasfregola.com/2018/02/01/using-case-classes-to-structure-your-data/
  *
  *
  * https://www.scala-exercises.org/std_lib/asserts
  *
  * https://ydisanto.developpez.com/tutoriels/java/cloneable/
  *
  * https://docs.oracle.com/javase/1.5.0/docs/api/java/io/Serializable.html
  *
  *
  * https://docs.oracle.com/javase/8/docs/api/java/io/package-summary.html
  *
  *
  * https://fr.wikipedia.org/wiki/Type_alg%C3%A9brique_de_donn%C3%A9es
  * https://www.baeldung.com/java-deep-copy
  */
object ChapTen {

   def main(args:Array[String]):Unit ={

      val x:Int = Random.nextInt(10)
      println(matchTest(x))
     val sms =  Sms("+33 6 30 40 98 98","Hello my friend")
     println(showNotification(sms))

   }


  abstract class Notification
  case class Email(sender:String,title:String,body:String) extends Notification
  case class Sms(caller:String,message:String) extends Notification
  case class VoiceRecording(contactName:String, link:String) extends Notification

   def matchTest(x:Int):String={
     x match {

       case 0 => "zero"
       case 1 => "un"
       case 2 => "deux"
       case _ => "many"
     }


   }

  /**
    * Pattern Matching
    * case class is useful with pattern Matching
    * @param notification is notification object
    * @return
    */
   def showNotification(notification: Notification):String={
      notification match {
        case Email(email,title,_)=>
          s"You got an email from $email with title: $title"

        case Sms(number,message)=>
          s"You got an sms from number $number with message: $message"

        case VoiceRecording(name,link)=>
          s"You received a voice recording from $name! Click on the Link below $link"
      }
   }
}
