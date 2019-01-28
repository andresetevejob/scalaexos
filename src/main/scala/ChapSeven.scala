object ChapSeven {

     def main(args: Array[String])={

       /**
         * Exemple 1 :Utilisation de la fonction map
         * val salaries = Seq(20000, 70000, 40000)
         * val doubleSalary = (x: Int) => x * 2
         * val newSalaries = salaries.map(doubleSalary)
         */

       /**
         * Exemple 2 : Le compilateur definit le
         *  type de x paramètres de la fonction passer à la fonction d'ordre superieur
         *  map en s'appuyant sur le contenu de la sequence salaries
         */
       val salaries = Seq(2000,5000,7000)
       val newSalaries = salaries.map(x => x * 2)

       /**
         * Exemple 3
         * val salaries = Seq(2000,5000,7000)
         * val newSalaries = salaries.map(_ * 2)
         * Underscore représente toutes valeurs se trouvant dans la sequence
         */

        val weeklyWeather = new WeeklyWeather(Seq(5,12,36))
        val weeklyWeatherNews = weeklyWeather.forecastInFarheint()

        val domaineName = "www.example.com"
        def getUrlBuilder = urlBuilder(true,domaineName)
        val endPoints= "users"
        val query ="id=1"
        val url = getUrlBuilder(endPoints,query)
        println(url)
     }

  /**
    * Fonction retournant une fonction
    * @param ssl
    * @param domainName
    * @return
    */
    def urlBuilder(ssl:Boolean,domainName: String):(String,String)=>String = {
      val schema = if(ssl) "https://" else "http://"
      (endpoint:String,query:String)=> s"$schema$domainName/$endpoint?$query"
    }

  /**
    * Dans ce cas précis,le compilateur contraint la method convertCtoF à une fonction
    * @param temperatures
    */
   case class WeeklyWeather(temperatures: Seq[Double]){
        private def convertCtoF(temperature: Double):Double = {
            return temperature * 1.8
        }

        def forecastInFarheint():Seq[Double] = {
            temperatures.map(convertCtoF)
        }
     }


  object SalaryRaiser {

    private def promotion(salaries: List[Double], promotionFunction: Double => Double): List[Double] =
      salaries.map(promotionFunction)

    def smallPromotion(salaries: List[Double]): List[Double] =
      promotion(salaries, salary => salary * 1.1)

    def bigPromotion(salaries: List[Double]): List[Double] =
      promotion(salaries, salary => salary * math.log(salary))

    def hugePromotion(salaries: List[Double]): List[Double] =
      promotion(salaries, salary => salary * salary)
  }
}
