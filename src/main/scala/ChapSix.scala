object ChapSix {

   def main(args: Array[String])={
     val stringIterator = new StringIterator("Andres")
     while(stringIterator.hasNext){
       println(stringIterator.next())
     }


     val richStringIter = new RichStringIter
     richStringIter foreach println


   }


}
//The new class RichStringIter has StringIterator as a superclass and RichIterator as a mixin.
class RichStringIter extends StringIterator("Scala") with RichIterator

class StringIterator(s: String) extends AbsIterator {
  type T = Char
  private var i = 0
  def hasNext = i < s.length
  def next() = {
    val ch = s charAt i
    i += 1
    ch
  }
}
abstract class AbsIterator {
  type T
  def hasNext: Boolean
  def next(): T
}
trait RichIterator extends AbsIterator {
  def foreach(f: T => Unit): Unit = while (hasNext) f(next())
}
