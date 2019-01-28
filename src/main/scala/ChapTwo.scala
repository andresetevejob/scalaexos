object ChapTwo {

  def main(args: Array[String]):Unit={
     val list:List[Any]= List(
       "a string",
       ()=>42,
       true,
       'c',
       452
     )
    list.foreach(element=>println(element));
  }
}
