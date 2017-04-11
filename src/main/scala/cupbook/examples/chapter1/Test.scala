package cupbook.examples.chapter1

import org.scalatest._
import org.scalatest.concurrent._

class Test extends FlatSpec with Eventually with Matchers {

  // p38
  val xs = 1 to 3
  val ite = xs.iterator
  eventually { ite.next() shouldBe 3 }  // shouldBeが達成されるまで実行し続ける。
  
  ite.next() // 関数は3回実行されたので、iteはemptyとなる。

  val ite2 = xs.iterator
  eventually { ite2.next() shouldBe 2 }

  println(ite2.next()) // 3になる。
}