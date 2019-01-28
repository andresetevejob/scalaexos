package AlgorithmsLeetCode

object TwoSum {

    def bruteForce(tab:Array[Int],target:Int):Array[Int]={
      for ( i <- 0 to (tab.length)) {
        for ( j <- i+1 to (tab.length)) {
            if(tab(i) + tab(j)== target){
               return Array(tab(i),tab(j))
            }
        }
      }
      throw new IllegalArgumentException("No two sum solution")
    }

    def hashTabSolution(tab:Array[Int],target:Int):Array[Int]= {
       var mapTab : Map[Int,Int] = Map()
       for(i<- 0 to tab.length){
         mapTab + (tab(i) -> i) //correspond to put data in map in Java Collection

       }
       for(i<- 0 to tab.length){
          var complement = target - mapTab(i)
          if(mapTab.contains(complement) && mapTab.get(complement)!=i){
            Array(i,mapTab.get(complement))
          }
       }
       throw new IllegalArgumentException("No two sum solution")
    }

    def main(args: Array[String])={
       val result = bruteForce(Array(2,7,8,10),12)
       println(result(0))
       println(result(1))
    }
}
