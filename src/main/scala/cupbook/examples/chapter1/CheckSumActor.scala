package cupbook.examples.chapter1

import akka.actor.Actor;

class CheckSumActor extends Actor {
  var sum = 0;

  def receive = {
//    case Data(byte) => sum += byte
//    case GetChecksum(requester) =>
//      val checksum = ~(sum & 0xFF) + 1
//      requester ! checksum
    case _ => 0 // compileを通すため
  }
}