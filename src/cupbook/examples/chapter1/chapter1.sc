package cupbook.examples.chapter1

object chapter1 {
  println("1章の本文のコードです。")                         //> 1章の本文のコードです。
  
  var capital = Map ("US" -> "Washington", "France" -> "Paris")
                                                  //> capital  : scala.collection.immutable.Map[String,String] = Map(US -> Washing
                                                  //| ton, France -> Paris)
  capital += ("Japan" -> "Tokyo")
  println(capital("France"))                      //> Paris
  
  // additional code
  capital("France")                               //> res0: String = Paris
  capital.get("France")                           //> res1: Option[String] = Some(Paris)
  capital.get("Thailand")                         //> res2: Option[String] = None
  // 例外を投げさせることも可能
  // capital("Thailand")
  capital.toSeq(0)                                //> res3: (String, String) = (US,Washington)
  
  
}